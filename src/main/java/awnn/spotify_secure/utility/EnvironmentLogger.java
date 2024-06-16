package awnn.spotify_secure.utility;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class EnvironmentLogger {

    @Value("${POSTGRESQL_USERNAME}")
    private String username;

    @Value("${POSTGRESQL_PASSWORD}")
    private String password;

    @PostConstruct
    public void logEnvironmentVariables() {
        System.out.println("POSTGRESQL_USERNAME: " + username);
        System.out.println("POSTGRESQL_PASSWORD: " + password);
    }
}

