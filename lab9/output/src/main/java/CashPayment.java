public class CashPayment implements IPayment {

    public double payment(double price) {
        double serviceCharge = 5.00;
        double amount = price + serviceCharge;
        return amount;
    }
}