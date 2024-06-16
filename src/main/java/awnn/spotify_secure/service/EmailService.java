package awnn.spotify_secure.service;

public interface EmailService {
    void sendNewAccountEmail(String none, String email, String token);
    void sendPasswordOnResetEmail(String none, String email, String token);
}
