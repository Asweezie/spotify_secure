package awnn.spotify_secure;

import awnn.spotify_secure.domain.RequestContext;
import awnn.spotify_secure.entity.RoleEntity;
import awnn.spotify_secure.enumeration.Authority;
import awnn.spotify_secure.repository.RoleRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.scheduling.annotation.EnableAsync;

@EnableJpaAuditing
@SpringBootApplication
@EnableAsync
public class SpotifySecureApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpotifySecureApplication.class, args);

	}


	@Bean
	CommandLineRunner commandLineRunner(RoleRepository roleRepository) {
		return args -> {
			RequestContext.setUserId(0L);
			/*var userRole = new RoleEntity();
			userRole.setName(Authority.USER.name());
			userRole.setAuthorities(Authority.USER);

			RequestContext.setUserId(0L);
			var adminRole = new RoleEntity();
			adminRole.setName(Authority.ADMIN.name());
			adminRole.setAuthorities(Authority.ADMIN);

			roleRepository.save(userRole);
			roleRepository.save(adminRole);

			RequestContext.start();*/

		};
	}

}
