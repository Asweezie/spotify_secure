package awnn.spotify_secure.event.listener;

import awnn.spotify_secure.event.UserEvent;
import awnn.spotify_secure.service.EmailService;
import lombok.RequiredArgsConstructor;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class UserEventListener {
    private final EmailService emailService;

    @EventListener
    public void onUserEvent(UserEvent event) {
        switch(event.getType()) {
            case REGISTRATION -> emailService.sendNewAccountEmail(event.getUser().getFirstName(), event.getUser().getEmail(), (String)event.getData().get("key"));
            case RESETPASSWORD -> emailService.sendPasswordOnResetEmail(event.getUser().getFirstName(), event.getUser().getEmail(), (String)event.getData().get("key"));
            default -> {}
        }
    }


}
