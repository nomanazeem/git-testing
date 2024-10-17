package factory;

public class CreditCardProcessing implements PaymentProcessing {
    @Override
    public void updatePayment(Double amount) {
        System.out.println("Credit card processing :: amount %s"+ amount);
    }
}
