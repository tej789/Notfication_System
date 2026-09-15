package Notification_System;

public class NotifierFactory {
    private final  NotificationConfig config;

    public NotifierFactory(){
        this.config = NotificationConfig.getInstance();
    }




    public Notifier createNotifier(String notifier){


        if(notifier.equals("email")){
            return new EmailNotifier(config);
        }

        if(notifier.equals("sms")){
            return new SMSNotifier();
        }
        if (notifier.equals("push")) {
            return new PushNotifier();
        }

        throw new IllegalArgumentException("Unknown Notifier: " + notifier);

    }
}
