package Notification_System;

public class PushNotifier implements Notifier{


    private final NotificationConfig config;

    public PushNotifier(NotificationConfig config){
        this.config = config;
    }




    @Override
    public void send(String message){
        System.out.println("Semding Push Notification "+message);
    }

}
