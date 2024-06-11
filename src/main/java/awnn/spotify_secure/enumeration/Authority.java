package awnn.spotify_secure.enumeration;

import lombok.Getter;

import static awnn.spotify_secure.constant.Constants.*;

@Getter
public enum Authority {
    USER(USER_AUTHORITIES),
    ADMIN(ADMIN_AUTHORITIES),
    MANAGER(MANAGER_AUTHORITIES);

    private final String value;

    Authority(String value) {
        this.value = value;
    }
}
