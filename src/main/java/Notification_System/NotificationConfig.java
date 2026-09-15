package Notification_System;

public class NotificationConfig {

    private static final NotificationConfig instance = new NotificationConfig();

    private String emailHost = "smtp.gmail.com";

    private NotificationConfig(){}

   public static NotificationConfig getInstance(){
        return instance;
   }

public String getEmailHost(){
        return emailHost;
}

}
/*
Today:
=> singleton and factory method
Tomorrow:
=> complete implementation and learn builder
Impediments:
=> NONE
 */