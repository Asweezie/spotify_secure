package awnn.spotify_secure.entity;

import awnn.spotify_secure.enumeration.Authority;
import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

import static com.fasterxml.jackson.annotation.JsonInclude.Include.NON_DEFAULT;

@Entity
@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "roles")
@JsonInclude(NON_DEFAULT)
public class RoleEntity extends Auditable{
    private String name;
    private Authority authorities;
}
