package Notification_System;

public class NotificationService {

    private  final NotifierFactory notifierFactory;

    public NotificationService(){
        this.notifierFactory = new NotifierFactory();
    }

   public void sendNotification(String channel , String message){

        Notifier notifier1 = notifierFactory.createNotifier(channel);
        notifier1.send(message);
   }
}
