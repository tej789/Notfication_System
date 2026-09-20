package Notification_System;

public class NotifierFactory {
    private final  NotificationConfig config;

    public NotifierFactory(){
        this.config = NotificationConfig.getInstance();
    }

    public Notifier createNotifier(String channel){


        if(channel.equals("email")){
            return new EmailNotifier(config);
        }

        if(channel.equals("sms")){
            return new SMSNotifier(config);
        }
        if (channel.equals("push")) {
            return new PushNotifier(config);
        }

        throw new IllegalArgumentException("Unknown Notifier: " + channel);

    }
}
