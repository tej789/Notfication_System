package Notification_System;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NotificationSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(NotificationSystemApplication.class, args);

//		NotifierFactory factory = new NotifierFactory();
//		Notifier notifier = factory.createNotifier("email");
//		notifier.send("Hello via Email!");

		NotificationService service = new NotificationService();

		service.sendNotification("email","Hello Email");
		service.sendNotification("sms","Hello Via SMS");
	}

}
