package awnn.spotify_secure.dtorequest;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserRequest {
    @NotEmpty(message = "First name must not be empty or null")
    private String firstName;
    @NotEmpty(message = "Last name must not be empty or null")
    private String lastName;
    @NotEmpty(message = "First name must not be empty or null")
    @Email(message = "Invalid Email Address")
    private String email;
    @NotEmpty(message = "Password must not be empty or null")
    private String password;
    private String bio;
    private String phone;
}
