 

public class GumballMachine
{

    private int machine_num;
    private int num_gumballs;
    
    private int gumball_cost;
    
    private int input_value;
    private int required_value;
    private int more_value;
 	  
    public GumballMachine( int mach_num, int size)
    {
        this.machine_num = mach_num;
        this.num_gumballs = size;
        
        if ( this.machine_num == 1 ) { 
  		  System.out.println( "Gumball cost is 25 cents, only quarters are accepted!!" );
  		  this.gumball_cost = 25;
        }
        else if ( this.machine_num == 2) {
  		  System.out.println( "Gumball cost is 50 cents, only quarters are accepted!!" );
  		  this.gumball_cost = 50;
        }
        else if ( this.machine_num == 3) {
    	  System.out.println( "Gumball cost is 50 cents, only nickels, dimes and quarters are accepted!!" );
    	  this.gumball_cost = 50;
        }
    }

    public void insertCoin(int coin)
    { 
      if ( (this.machine_num == 1 || machine_num == 2 ) && coin != 25 ) {
		System.out.println( "Can't return your coins, Please add only quarters for this machine!!" );
		coin = 0;	
      }
      this.input_value = this.input_value + coin; 
      this.required_value = this.gumball_cost - this.input_value; 
    }
    
    public void turnCrank()
    {
    	if ( this.num_gumballs > 0 ) {
    		if ( this.required_value <= 0 ) {
    			this.num_gumballs-- ;
    			System.out.println( "Gumball Ejected!" ) ;
    			if ( this.input_value > this.gumball_cost) {
    				this.more_value = this.input_value - this.gumball_cost;  
    				System.out.println( "The cost of gumball is " + this.gumball_cost + " cents, You added " + this.more_value + " cents more!" );
    			}
    			this.input_value = 0;
    		}
    		else {
    			if ( this.machine_num == 3  ) {
    				System.out.println( "Please add " + this.required_value + " cents more!" );
    			}
    		}
    	}
    	else {
    		System.out.println("Sorry can't return your coins, No more gumballs!");
    	}
   
    }
}
