import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.text.DecimalFormat;

public class Helper {
	
	String Addressline1 = "FIVE GUYS";
	double cash = 20.00;
    double taxpercent = 0.09;
    double taxtotal = 0.00;
    double subtotal = 0.00;
    double total = 0.00;
    double btotal = 0.00;
    double ftotal = 0.00;
    double change = 0.00;
    String FriesStyle = "CAJ";
    DecimalFormat fmt = new DecimalFormat("0.00");
    
	void PrintString(String str, int size) {
        int left = (size - str.length()) / 2;
        int right = size - left - str.length();
        String repeatedChar = " ";
        StringBuffer buff = new StringBuffer();
        for (int i = 0; i < left; i++) {
            buff.append(repeatedChar);
        }
        buff.append(str);
        for (int i = 0; i < right; i++) {
            buff.append(repeatedChar);
        }
          
        System.out.println(buff.toString());
    }
	
	int GenRegNo() {
		int  RegNo= 0;
	   return ++RegNo;
	 }

 int GenTxnNo() {
		int  TxnNo= 57844;
	   return ++TxnNo;
	}
 
 int GenOrderNo() {
        int  orderNo= 44;
		return ++orderNo;
 }
		
 String GenOrderTime() {
	Calendar cal = Calendar.getInstance();
	SimpleDateFormat sdf = new SimpleDateFormat("MM/DD/YYYY hh:mm:ss a");
	String orderTime = sdf.format(cal.getTime());
	return orderTime;
 }
  
 void PrintTop(int orderNo, String ordertime) {
	
 	PrintString(ordertime,45);
 	PrintString(Addressline1,45);
 	PrintString("  Order No." +orderNo, 0);
	}
 
 void PrintOrder(double bt, double ft) {
	 subtotal  = bt +ft;
	  taxtotal = taxpercent*subtotal;
	  total = subtotal + taxtotal;
	  change = cash - total;
	  
	  PrintString("     Sub. Total:                 $" + fmt.format(subtotal), 0);
      PrintString("     Tax:                        $" + fmt.format(taxtotal), 0);
      PrintString("     Total:                      $" + fmt.format(total) , 0);
      PrintString("\n", 0);
      PrintString("     Cash $" + Double.valueOf(cash)  + "                 $" + fmt.format(cash), 0);
      PrintString("     Change                     $" + fmt.format(change), 0);
 }
 
 void Orderdetails (double bt, double ft,String tt) {
	 String[] toppings= {};
	 toppings = tt.split(","); 
	 PrintString("   1 LBB "+ "                        " + bt,0);
	   for (int i = 0; i <= toppings.length - 1; i++) {
	       String value = toppings[i];
	           if (value.equalsIgnoreCase("bacon"))
	              PrintString("      " + "{{{{" + value.toUpperCase() + "}}}}", 0);
	            else
	               PrintString("      " +	value.toUpperCase(), 0);
	    }
	   PrintString("  1 LTL "+ " "+FriesStyle  + "                     " + ft,0);
   }
    
 void Orderdetails2 (double bt, double ft,String tt) {
	 String[] toppings= {};
	 toppings = tt.split(","); 
	 PrintString("   1 LBB ",0);
	   for (int i = 0; i <= toppings.length - 1; i++) {
	       String value = toppings[i];
	           if (value.equalsIgnoreCase("bacon"))
	              PrintString("      " + "{{{{" + value.toUpperCase() + "}}}}", 0);
	            else
	               PrintString("      " +	value.toUpperCase(), 0);
	    }
	   PrintString("  1 LTL "+FriesStyle ,0);
   }
}