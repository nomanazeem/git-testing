package factory;

public class PaypalProcessing implements PaymentProcessing {
    @Override
    public void updatePayment(Double amount) {
        System.out.println("Paypal processing :: amount %s"+ amount);
    }
}
