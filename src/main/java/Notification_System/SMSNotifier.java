package Notification_System;

public class SMSNotifier implements Notifier {

   private final NotificationConfig config;

   public SMSNotifier(NotificationConfig config){
       this.config = config;
   }


    @Override
    public void send(String message){
        System.out.println("Sending SMS "+ message);
    }
}
