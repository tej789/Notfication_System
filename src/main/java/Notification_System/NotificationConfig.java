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




//

/*

A real Singleton creates one actual object that can be shared throughout the application.
A Singleton is a real object, so it can implement an interface and be used through that
 interface, while a static utility class only provides static methods.

ApplicationContext acts like a big factory that creates and manages beans.
 By default, each Spring bean has Singleton scope,
  so the same bean instance is shared within the ApplicationContext.

 */