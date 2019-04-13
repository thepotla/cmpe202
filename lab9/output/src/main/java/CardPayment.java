public class CardPayment implements IPayment {

    public double payment(double price) {
        double serviceCharge = 5.00;
        double creditCardFee = 10.00;
        double amount = price +  serviceCharge + creditCardFee;
        return amount;
    }
}