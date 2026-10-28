package software.reuse.task1;

public class EcommerceCart {
    private final PaymentMethod paymentMethod;   // Composition + Dependency Injection
    private double total;

    public EcommerceCart(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void addItem(String name, double price) {
        total += price;
        System.out.println("Added " + name + " (Rs. " + price + ")");
    }

    public void checkout() {
        System.out.println("Total: Rs. " + total);
        boolean success = paymentMethod.pay(total);   // delegated, cart doesn't know the type
        System.out.println(success ? "Payment successful!\n" : "Payment failed!\n");
    }
}
