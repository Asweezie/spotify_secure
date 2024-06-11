package awnn.spotify_secure.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

import static com.fasterxml.jackson.annotation.JsonInclude.Include.NON_DEFAULT;

@Entity
@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "users")
@JsonInclude(NON_DEFAULT)
public class UserEntity extends Auditable{

    @Column(unique = true, nullable = false, updatable = false)
    private String UserId;
    private String firstName;
    private String lastName;
    @Column(unique = true, nullable = false)
    private String email;
    private Integer loginAttempts;
    private LocalDateTime lastLogin;
    private String phone;
    private String bio;
    private String imageUrl;
    private boolean accountNoneExpired;
    private boolean accountNonLocked;
    private boolean enabled;
    private boolean hasMfa;
    @JsonIgnore
    private String qrCodeSecret;
    @Column(columnDefinition = "TEXT")
    private String qeCodeImageUri;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinTable(
            name = "user_roles",
            joinColumns = @JoinColumn(
                    name = "user_id", referencedColumnName = "id"),
                    inverseJoinColumns = @JoinColumn(
                            name = "role_id", referencedColumnName = "id"))
    private RoleEntity role;
}
