package Notification_System;

public class EmailNotifier implements Notifier {

    private final NotificationConfig config;

    public EmailNotifier(NotificationConfig config) {
        this.config = config;
    }
    @Override
    public void send(String message) {
        System.out.println(
                "Sending Email using " + config.getEmailHost() + ": " + message
        );
    }
}
