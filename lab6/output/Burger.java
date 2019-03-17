public class Burger implements Menu {
	String[] burger = {"LBB","LCB"};
	  String price = "";
  
   public String setOrder(String option) {    
	   
	       if ("LBB".equalsIgnoreCase(option) ) this.price = "5.59" ;
	       if ("LCB".equalsIgnoreCase(option) ) this.price = "5.29" ;
	      return this.price;
	   }

}