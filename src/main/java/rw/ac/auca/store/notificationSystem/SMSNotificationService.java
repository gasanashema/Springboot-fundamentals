package rw.ac.auca.store.notificationSystem;

import org.springframework.stereotype.Service;

@Service
public class SMSNotificationService implements NotificationService{
    @Override
    public void send(String message) {
        System.out.println("SMS Notification");
        System.out.println(message);
    }
}
