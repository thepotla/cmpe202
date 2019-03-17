public class BuildOrder {
	
	String bo ="";
	String fo ="";
	String to = "";
   //use getOrder method to order of the type 
   public Menu Order(String ordertype)
   {
      if(ordertype == null){
         return null;
      }		
      if(ordertype.equalsIgnoreCase("Burger")){
         Menu menu = new Burger();
         bo = menu.setOrder("LBB");
      } 
      else if(ordertype.equalsIgnoreCase("Toppings")){
    	  Menu menu =  new Toppings();
    	 to= menu.setOrder("LETTUCE, TOMATO,-> | G ONION, BACON");
      } 
      else if(ordertype.equalsIgnoreCase("Fries")){
    	  Menu menu = new Fries();
    	  fo = menu.setOrder("LTL");
      }
     
     return null;
   }
   

}
