public class Payment {

    public static void main(String[] args) {
        double price = 100;
        
        System.out.println("Using Strategy Design Pattern");
        
        IPayment payStrategy = new CashPayment();
        System.out.println("Cash Payment:  " + payStrategy.payment(price));

        payStrategy = new CardPayment();
        System.out.println("CreditCard Payment:  " + payStrategy.payment(price));
    }
}