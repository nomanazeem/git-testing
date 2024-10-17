package factory;

public class PaymentFactory {
    PaymentProcessing paymentProcessing;
    public PaymentProcessing GetPayment(PaymentType type){
        switch (type){
            case Paypal -> {
                return new PaypalProcessing();
            }
            case CreditCard -> {
                return new CreditCardProcessing();
            }
            default ->
            {
                return new CreditCardProcessing();
            }
        }
    }
}
