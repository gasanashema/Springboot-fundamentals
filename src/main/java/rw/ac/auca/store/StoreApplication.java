package rw.ac.auca.store;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
//import rw.ac.auca.store.notificationSystem.NotificationManager;

@SpringBootApplication
public class StoreApplication {

    public static void main(String[] args) {
       ApplicationContext context = SpringApplication.run(StoreApplication.class, args);
//        var notificationManager = context.getBean(NotificationManager.class);
//        notificationManager.sendMessage("This is the message from where?");
        var orderService = context.getBean(OrderService.class);
        orderService.placeOrder();
  }

}
