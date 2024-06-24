package awnn.spotify_secure.utility;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class EnvVarChecker {

    @Value("${EMAIL_HOST}")
    private String emailHost;

    @Value("${EMAIL_PORT}")
    private String emailPort;

    @Value("${EMAIL_ID}")
    private String emailId;

    @Value("${EMAIL_PASSWORD}")
    private String emailPassword;

    @Value("${VERIFY_EMAIL_HOST}")
    private String verifyEmailHost;

    @PostConstruct
    public void init() {
        // Print environment variables
        System.out.println("EMAIL_HOST: " + emailHost);
        System.out.println("EMAIL_PORT: " + emailPort);
        System.out.println("EMAIL_ID: " + emailId);
        System.out.println("EMAIL_PASSWORD: " + emailPassword);
        System.out.println("VERIFY_EMAIL_HOST: " + verifyEmailHost);
    }
}