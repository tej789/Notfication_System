package Notification_System;

public class NotifierFactory {
    public Notifier createNotifier(String notifier){


        if(notifier.equals("email")){
            return new EmailNotifier();
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
