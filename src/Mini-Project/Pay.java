// 1. Abstraction for DIP (Dependency Inversion)
interface PaymentMethod {
    void pay(double amount);
}

// 2. Separate classes for SRP (Single Responsibility)
class UpiPayment implements PaymentMethod {
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " via UPI.");
    }
}

class CardPayment implements PaymentMethod {
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " via Card.");
    }
}

class PayPalPayment implements PaymentMethod {
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " via PayPal.");
    }
}

// 3. OrderService depends on abstraction, not concrete classes
class OrderService {
    private PaymentMethod payment;

    // Dependency Injection (we can "inject" any payment type)
    public OrderService(PaymentMethod payment) {
        this.payment = payment;
    }

    public void processOrder(double amount) {
        payment.pay(amount);  // Polymorphism in action
    }
}

// 4. Main class to keep usage simple (KISS)
public class Pay {
    public static void main(String[] args) {
        OrderService order1 = new OrderService(new UpiPayment());
        order1.processOrder(500);

        OrderService order2 = new OrderService(new CardPayment());
        order2.processOrder(1200);

        OrderService order3 = new OrderService(new PayPalPayment());
        order3.processOrder(2500);
    }
}
