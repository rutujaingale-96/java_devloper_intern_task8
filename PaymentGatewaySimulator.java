package internship;

// Payment interface
interface Payment {
    void pay(double amount);
}

// Another interface for multiple inheritance
interface Refundable {
    void refund(double amount);
}

// Credit Card Payment Class
class CreditCardPayment implements Payment, Refundable {

    public void pay(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid payment amount!");
            return;
        }
        System.out.println("Processing Credit Card Payment...");
        System.out.println("Paid Rs." + amount + " successfully using Credit Card.");
    }

    public void refund(double amount) {
        System.out.println("Refunded Rs." + amount + " to Credit Card.");
    }
}

// UPI Payment Class
class UPIPayment implements Payment {

    public void pay(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid payment amount!");
            return;
        }
        System.out.println("Processing UPI Payment...");
        System.out.println("Paid Rs." + amount + " successfully using UPI.");
    }
}

// Cash Payment Class
class CashPayment implements Payment {

    public void pay(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid payment amount!");
            return;
        }
        System.out.println("Processing Cash Payment...");
        System.out.println("Paid Rs." + amount + " successfully using Cash.");
    }
}

// Main Class
public class PaymentGatewaySimulator {

    public static void main(String[] args) {

        // Loose coupling: reference is interface, object can change
        Payment payment;

        // Switch payment modes dynamically
        payment = new CreditCardPayment();
        payment.pay(5000);

        System.out.println("----------------");

        payment = new UPIPayment();
        payment.pay(1500);

        System.out.println("----------------");

        payment = new CashPayment();
        payment.pay(-200); // Invalid case

        System.out.println("----------------");

        // Multiple inheritance demo
        CreditCardPayment cc = new CreditCardPayment();
        cc.refund(1000);
    }
}
