import adaptor.MyLogMessage;
import command.TextEditor;
import factory.PaymentFactory;
import factory.PaymentProcessing;
import factory.PaymentType;

public class Main {
    public static void main(String args[]){
        System.out.println("Hello");

        /*
        //Command pattern
        TextEditor editor=new TextEditor();
        editor.AppendText("Saleem Ghauri");
        editor.AppendText(" Nameed Ghauri");
        editor.UndoText("Ghauri");

        //Adaptor pattern
        MyLogMessage logMessage = new MyLogMessage();
        logMessage.LogMessage("Hi message");
        logMessage.LogMessage("message 2");
        logMessage.LogMessage("message 3");
        */

        //Factory
        PaymentFactory factory = new PaymentFactory();
        PaymentProcessing processing = factory.GetPayment(PaymentType.CreditCard);
        processing.updatePayment(12334D);


        processing = factory.GetPayment(PaymentType.Paypal);
        processing.updatePayment(45555D);

    }
}
