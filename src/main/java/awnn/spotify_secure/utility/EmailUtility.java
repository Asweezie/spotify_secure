package awnn.spotify_secure.utility;

public class EmailUtility {

    public static String getEmailMessage(String name, String host, String key) {
        return "Hello " + name + ",\n\nYour new account has been created. Please click on the link below to verify your account. \n\n" +
                getVerificationUrl(host, key) + "\n\nThe Support Team";
    }

    public static String getVerificationUrl(String host, String key) {
        return host + "/verify/account?token=" + key;
    }

    public static String getResetPasswordMessage(String name, String host, String token) {
        return "Hello " + name + ",\n\nYour new account has been created. Please click on the link below to verify your account. \n\n" +
                getVerificationUrl(host, token) + "\n\nThe Support Team";
    }

    public static String getResetPasswordUrl(String host, String token) {
        return host + "/verify/password?token=" + token;
    }
}
