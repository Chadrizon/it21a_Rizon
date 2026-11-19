 
package abstractiondemo;

 

abstract class PaymentMethod {
    protected String customerName;
    protected double amount;

    public PaymentMethod(String customerName, double amount) {
        this.customerName = customerName;
        this.amount = amount;
    }

     
    public abstract void processPayment();

   
    public void printReceipt() {
        System.out.println("--- RECEIPT ---");
        System.out.println("Customer: " + customerName);
        System.out.println("Amount paid: PHP " + amount);
        System.out.println("Thank you for shopping with us!");
        System.out.println();
    }
}

class GCashPayment extends PaymentMethod {
    private String mobileNumber;

    public GCashPayment(String customerName, double amount, String mobileNumber) {
        super(customerName, amount);
        this.mobileNumber = mobileNumber;
    }

    @Override
    public void processPayment() {
        System.out.println("Sending OTP to " + mobileNumber + "...");
        System.out.println("OTP verified. PHP " + amount + " deducted from " + customerName + "'s GCash wallet.");
    }
}

class CreditCardPayment extends PaymentMethod {
    private String cardLastFour;

    public CreditCardPayment(String customerName, double amount, String cardLastFour) {
        super(customerName, amount);
        this.cardLastFour = cardLastFour;
    }

    @Override
    public void processPayment() {
        System.out.println("Contacting the bank for card ending in " + cardLastFour + "...");
        System.out.println("Card approved. PHP " + amount + " charged to " + customerName + "'s credit card.");
    }
}

class CashOnDeliveryPayment extends PaymentMethod {
    public CashOnDeliveryPayment(String customerName, double amount) {
        super(customerName, amount);
    }

    @Override
    public void processPayment() {
        System.out.println("Order confirmed. " + customerName + " will hand PHP " + amount + " to the courier on arrival.");
    }
}

public class AbstractionDemo {

    public static void main(String[] args) {
       

        PaymentMethod gcash = new GCashPayment("Ana", 1250.50, "0917-123-4567");
        PaymentMethod card = new CreditCardPayment("Ben", 3999.00, "4821");
        PaymentMethod cod = new CashOnDeliveryPayment("Carla", 499.75);

        PaymentMethod[] payments = { gcash, card, cod };

        for (PaymentMethod p : payments) {
            p.processPayment();
            p.printReceipt();
        }
    }
}