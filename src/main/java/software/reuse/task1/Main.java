package software.reuse.task1;

public class Main {
    public static void main(String[] args) {
        EcommerceCart cart1 = new EcommerceCart(new CreditCardPayment());
        cart1.addItem("Laptop Bag", 3500);
        cart1.addItem("Mouse", 1200);
        cart1.checkout();

        EcommerceCart cart2 = new EcommerceCart(new JazzCashPayment());
        cart2.addItem("Keyboard", 2500);
        cart2.checkout();
    }
}
