package awnn.spotify_secure.service;


import awnn.spotify_secure.entity.RoleEntity;
import awnn.spotify_secure.enumeration.Authority;

public interface UserService {
    void createUser(String firstName, String lastName, String email, String password);
    RoleEntity getRoleName(String name);

    void verifyAccountKey(String key);
}
