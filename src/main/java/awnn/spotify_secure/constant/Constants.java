package awnn.spotify_secure.constant;

public class Constants {
    public static final String ROLE_PREFIX = "ROLE_";
    public static final String AUTHORITY_DELIMITER = ",";
    public static final String USER_AUTHORITIES = "song:create, song:read, song:update, song:delete";
    public static final String ADMIN_AUTHORITIES = "user:create, user:read, user:update, user:delete, song:create, song:read, song:update, song:delete";
    public static final String MANAGER_AUTHORITIES = "user:create, user:read, user:update, user:delete, song:create, song:read, song:update, song:delete";
}
