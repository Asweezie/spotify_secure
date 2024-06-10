package awnn.spotify_secure.exception;

public class ApiException extends RuntimeException {
    public ApiException(String message) {super(message);}

    public ApiException() {super("An error occurred");}

}
