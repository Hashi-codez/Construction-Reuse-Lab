package software.reuse.task1;

public class JazzCashPayment implements PaymentMethod {
    @Override
    public boolean pay(double amount) {
        if (amount <= 0) {
            System.out.println("JazzCash: Invalid amount.");
            return false;
        }
        System.out.println("Paid Rs. " + amount + " using JazzCash.");
        return true;
    }
}
