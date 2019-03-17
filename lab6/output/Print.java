public class Print{

	String Addressline1 = "FIVE GUYS";
	String Addressline2 = "BURGERS AND FRIES";
	String Addressline3 = "STORE # CA-1294";
	String Addressline4 = "5353 ALMADEN EXPY N60";
	String Addressline5 = "SAN JOSE, CA 95118";
	String Addressline6 = "(P) 408-264-9300";
	
	String Bottomline1 = "************************************";
	String Bottomline2 = "Don't throw away your receipt!!!";
	String Bottomline3 = "Help Five Guys and you could win!";
	String cashier = "Sakda* S.";
	
	Helper help = new Helper();
	
	void PrintAddress() {	    
		help.PrintString(Addressline1,45);
		help.PrintString(Addressline2,45);
		help.PrintString(Addressline3,45);
		help.PrintString(Addressline4,45);
		help.PrintString(Addressline5,45);
		help.PrintString(Addressline6,45);
	}	
	
	void PrintBottom() {
		help.PrintString(Bottomline1,45);
		help.PrintString( Bottomline2,45);
		help.PrintString("\n", 45);
		help.PrintString(Bottomline3,45);
		}
	void PrintReg() {
		String Orderline1 = "Register:" + help.GenRegNo() + "      Tran Seq No: "+help.GenTxnNo(); 
		String Orderline2 = "Cashier:" + cashier;	
		help.PrintString(Orderline1,42);
		help.PrintString(Orderline2,26);
	 }
	void PackingSlip( int OrderNo, String OrderTime) {
		help.PrintString("\n",0);
		help.PrintString("\n",0);
		help.PrintString("PATTIES - 1", 0);
		help.PrintString("\n",0);
		help.PrintString("  Order No." + OrderNo, 0);
		help.PrintString(OrderTime,45);
		help.PrintString(Addressline1,45);
		help.PrintString("\n",0);
		help.PrintString("Sandwich# 1", 0);
		
	 }
}