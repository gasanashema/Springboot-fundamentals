package rw.ac.auca.store;

import org.springframework.beans.factory.annotation.Value;

import java.util.List;

//@Service("stripe")
public class StripePaymentService implements PaymentService {

    @Value("${stripe.apiUrl}")
    private String apiUrl;

    @Value("${stripe.enabled}")
    private  boolean enabled;

    public void processPayment(double amount){
        System.out.println("Stripe");
        System.out.println("API URL: "+ apiUrl);
        System.out.println("Enabled: "+enabled);

        System.out.println("Amount "+amount);

    }
}
