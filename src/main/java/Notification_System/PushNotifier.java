package Notification_System;

public class PushNotifier implements Notifier{

    @Override
    public void send(String message){
        System.out.println("Semding Push Notification "+message);
    }

}
