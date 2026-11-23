package fooddelivery.external;

public class PaymentResult {
    

      private final boolean successful;

    public PaymentResult(boolean successful) {
        this.successful = successful;
    }

    public boolean isSuccessful() {
        return successful;
    }


}
