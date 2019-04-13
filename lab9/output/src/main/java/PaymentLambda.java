import java.util.function.Function;

public class PaymentLambda {
	
    static Function<Double, Function<Double, Double>> cashPay() {
    	return price -> servicecharge -> price + servicecharge;
	}
	
	static Function<Double, Function<Double, Function<Double, Double>>> cardPay() {
    	return price -> servicecharge -> creditcardfee -> price + servicecharge + creditcardfee;
	}
	
	public static void main(String[] args) {
	  double price = 100;
	  double serviceCharge = 5.00;
	  double creditCardFee = 10.00;

	  System.out.println("Using Java Lambda Expression");
	  
	  System.out.println("Cash Payment: " + PaymentLambda.cashPay().apply(price).apply(serviceCharge) ) ;
	  System.out.println("CreditCard Payment: " +  PaymentLambda.cardPay().apply(price).apply(serviceCharge).apply(creditCardFee) ) ;
	}
}