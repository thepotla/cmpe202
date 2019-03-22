
public class BuildOrder {

    public static Component getOrder()
    {
        Composite order = new Composite( "Order" ) ;
      
        CustomBurger customBurger = new CustomBurger( "Build Your Own Burger" ) ;
        Burger b = new Burger( "Burger Options" ) ;
        String[] bo = { "Organic Bison*", "1/2lb.", "On A Bun" } ;
         b.setOptions( bo ) ;
        //Cheese options
        Cheese c = new Cheese( "Cheese Options" ) ;
        String[] co = { "Yellow American", "Spicy Jalapeno Jack" } ;
        c.setOptions( co ) ;
        c.wrapDecorator( b ) ;   
        // Premium cheese options
        PremiumCheese x = new PremiumCheese( " Premium Cheese Options" ) ;
        String[] xo = { "Danish Blue Cheese" } ;
        x.setOptions( xo ) ;
        x.wrapDecorator( c ) ;
        // Sause options
        Sauce s = new Sauce( "Sauce Options" ) ;
        String[] so = { "Mayonnaise", "Thai Peanut Sauce" } ;
        s.setOptions( so ) ; 
        s.wrapDecorator( x ) ;
        //Toppings options
        Toppings t = new Toppings( "Toppings Options" ) ;
        String[] to = { "Dill Pickle Chips", "Black Olives", "Spicy Pickles" } ;
        t.setOptions( to ) ;
        t.wrapDecorator( s ) ;
        // Premium toppings options
        PremiumToppings p = new PremiumToppings( "Premium Toppings Options" ) ;
        String[] po = { "Marinated Tomatoes" } ;
        p.setOptions( po ) ;
        p.wrapDecorator( t ) ;
         // Bun options
        Bun u = new Bun( "Bun Options" ) ;
        String[] uo = { "Cibatta(Vegan)" } ;
        u.setOptions( uo ) ;
        u.wrapDecorator( p ) ;
        // Sides options
        Sides e = new Sides( "Sides Options" ) ;
        String[] eo = { "Shoe String Fries" } ;
        e.setOptions( eo );
        e.wrapDecorator( u ) ;
        
            
        // Setup Custom Burger Ingredients
        customBurger.setDecorator( e ) ;
        customBurger.addChild( b ) ;
        customBurger.addChild( c ) ;        
        customBurger.addChild( x ) ;
        customBurger.addChild( s ) ;
        customBurger.addChild( t ) ;
        customBurger.addChild( p ) ;       
        customBurger.addChild( u ) ;
        customBurger.addChild( e ) ;
      
      
     
        CustomBurger customBurger2 = new CustomBurger( "Build Your Own Burger" ) ;
        Burger b2 = new Burger( "Burger Options" ) ;
        String[] bo2 = { "Hormone & Antibiotic Free Beef*", "1/3lb.", "On A Bun" } ;
        b2.setOptions( bo2 ) ;
        // cheese options
        Cheese c2 = new Cheese( "Cheese Options" ) ;
        String[] co2 = { "Smoked Gouda", "Greek Feta" } ;
        c2.setOptions( co2 ) ;
        c2.wrapDecorator( b2 ) ;
        // premium cheese option
        PremiumCheese x2 = new PremiumCheese( "Premium Cheese Options" ) ;
        String[] xo2 = { "Fresh Mozarella" } ;
        x2.setOptions( xo2 ) ;
        x2.wrapDecorator( c2 ) ;
        // sause options
        Sauce s2 = new Sauce( "Sauce Options" ) ;
        String[] so2 = { "Habanera Salsa" } ;
        s2.setOptions( so2 ) ;
        s2.wrapDecorator( x2 ) ;
        // toppings
        Toppings t2 = new Toppings( "Toppings Options" ) ;
        String[] to2 = { "Crushed Peanuts" } ;
        t2.setOptions( to2 ) ;
        t2.wrapDecorator( s2 ) ;
        // premium toppings options
        PremiumToppings p2 = new PremiumToppings( "Premium Toppings Options" ) ;
        String[] po2 = { "Sunny Side Up Egg*","Marinated Tomatoes" } ;
        p2.setOptions( po2 ) ;
        p2.wrapDecorator( t2 ) ;
        // Bun options
        Bun u2 = new Bun( "Bun Options" ) ;
        String[] uo2 = { "Gluten-Free Bun" } ;
        u2.setOptions( uo2 ) ;
        u2.wrapDecorator( p2 ) ;
         //Sides options
        Sides e2 = new Sides( "Sides Options" ) ;
        String[] eo2 = { "Shoe String Fries" } ;
        e2.setOptions( eo2 ) ;
        e2.wrapDecorator( u2 ) ;
        
        // Setup Custom Burger Ingredients
        customBurger2.setDecorator( e2 ) ;
        customBurger2.addChild( b2 ) ;
        customBurger2.addChild( c2 ) ;        
        customBurger2.addChild( x2 ) ;
        customBurger2.addChild( s2 ) ;
        customBurger2.addChild( t2 ) ;
        customBurger2.addChild( p2 ) ;        
        customBurger2.addChild( u2 ) ;
        customBurger2.addChild( e2 ) ;
        
        // Add Custom Burger to the ORder
        order.addChild( customBurger );
      
        // Add Custom Burger to the ORder
        order.addChild( customBurger2 );
        
        
        return order ;
    }

}
