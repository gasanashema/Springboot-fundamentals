package rw.ac.auca.store;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StoreApplication {

    public static void main(String[] args) {
//        SpringApplication.run(StoreApplication.class, args);
    var ordersService = new OrderService(new PayPalPaymentService());
    ordersService.placeOrder();
    }

}
