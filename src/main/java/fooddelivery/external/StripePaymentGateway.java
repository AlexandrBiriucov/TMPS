package fooddelivery.external;

import com.stripe.StripeClient;
import com.stripe.exception.StripeException;
import com.stripe.model.PaymentIntent;
import com.stripe.param.PaymentIntentConfirmParams;
import com.stripe.param.PaymentIntentCreateParams;
public class StripePaymentGateway {

    private final StripeClient client;

    public StripePaymentGateway() {
        String secretKey = System.getenv("STRIPE_SECRET_KEY");

        if (secretKey == null || secretKey.isBlank()) {
            throw new IllegalStateException("Stripe secret key is missing!");
        }

        this.client = new StripeClient(secretKey);
        

    }


    public boolean createPayment(long amount) throws StripeException {
    PaymentIntentCreateParams params =
        PaymentIntentCreateParams.builder()
            .setAmount(amount)
            .setCurrency("eur")
            .setPaymentMethod("pm_card_visa")
            .build();

    PaymentIntent intent= client.v1().paymentIntents().create(params);
    System.out.println(intent.getId());
    System.out.println(intent.getStatus());
    PaymentIntentConfirmParams confirmParams =
  PaymentIntentConfirmParams.builder()
    .setPaymentMethod("pm_card_visa")
    .setReturnUrl("https://www.example.com")
    .build();
    PaymentIntent paymentIntent =
    client.v1().paymentIntents().confirm(intent.getId(), confirmParams);
    System.out.println(paymentIntent.getId());
    System.out.println(paymentIntent.getStatus());

        return "succeeded".equals(paymentIntent.getStatus());



    }


    


    


}