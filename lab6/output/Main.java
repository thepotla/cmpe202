import java.io.IOException;

public class Main 
{
      
	public static void main(String[] args) throws IOException
	{
		 double bt = 0.00;
		 double ft = 0.00;
		 String tt = "";
		 Helper helper = new Helper();	
		 Print prt = new Print();
		 
		 BuildOrder buildorder = new BuildOrder(); 
		 Menu menu1 = buildorder.Order("Burger");	
		 bt = Double.parseDouble(buildorder.bo);
		 Menu menu2 = buildorder.Order("Toppings");
		 tt = buildorder.to;
		 Menu menu3 = buildorder.Order("Fries");
		ft = Double.parseDouble(buildorder.fo);
		
		 int orderNo = helper.GenOrderNo();		 
	     String ordertime = helper.GenOrderTime();
	     
	     System.out.println("**********")  ;
	     System.out.println("Burger price " + bt)  ;
	     System.out.println("Fries price " + ft)  ;
	     System.out.println("Toppings options "+tt)  ;
	     System.out.println("**********")  ;
	     
	    prt.PrintAddress();
	    helper.PrintTop(orderNo, ordertime);
	    helper.Orderdetails(bt, ft, tt);
	    helper.PrintOrder(bt, ft);
	    prt.PrintReg();
	    prt.PrintBottom();
	    prt.PackingSlip(orderNo, ordertime);
	    helper.Orderdetails2(bt,ft,tt);
	    prt.PrintReg();
 
	}
}
			