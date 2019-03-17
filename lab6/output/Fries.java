public class Fries implements Menu {

	  String[] fries = {"LTL","REG"};
     
      String price = "";
      
   public String setOrder(String option) {
		
		 if ("LTL".equalsIgnoreCase(option))  this.price = "2.79" ;
		 if ("REG".equalsIgnoreCase(option)) this.price = "3.39" ;
		 return this.price;
	}
 
}