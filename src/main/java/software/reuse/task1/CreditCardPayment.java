package software.reuse.task1;

public class CreditCardPayment implements PaymentMethod {
    @Override
    public boolean pay(double amount) {
        if (amount <= 0) {
            System.out.println("Credit Card: Invalid amount.");
            return false;
        }
        System.out.println("Paid Rs. " + amount + " using Credit Card.");
        return true;
    }
}
