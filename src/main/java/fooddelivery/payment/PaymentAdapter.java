package fooddelivery.payment;

import java.math.BigDecimal;

import fooddelivery.external.PaymentResult;
import fooddelivery.external.StripeAPI;
import fooddelivery.external.StripePaymentGateway;
import com.stripe.exception.StripeException;
public class PaymentAdapter implements PaymentService{
    
    // private final StripeAPI stripeAPI;
    private final StripePaymentGateway  stripePaymentGateway;

    public PaymentAdapter(StripePaymentGateway  stripePaymentGateway){
        this.stripePaymentGateway = stripePaymentGateway;
    }


    @Override
    public boolean pay(BigDecimal total) {
        
            long amountInCents = total.multiply(BigDecimal.valueOf(100)).longValueExact();
            try{
            boolean paymentResult =  stripePaymentGateway.createPayment(amountInCents);
            return paymentResult;
            }
            catch (StripeException e){
                e.printStackTrace();
                return false;
            }
            // boolean result=  paymentResult.isSuccessful();

        
    }


}
