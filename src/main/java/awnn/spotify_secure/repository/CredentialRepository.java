package awnn.spotify_secure.repository;

import awnn.spotify_secure.entity.CredentialEntity;
import awnn.spotify_secure.entity.RoleEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CredentialRepository extends JpaRepository<CredentialEntity, Integer> {
    Optional<CredentialEntity> getCredentialByUserEntityId(Long userId);
}
