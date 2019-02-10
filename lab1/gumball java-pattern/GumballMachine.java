 

public class GumballMachine {
	 
	State soldOutState;
	State noCoinState;
	State hasCoinState;
	State soldState;
 
	State state = soldOutState;
	int count = 0;
	
	private int machine_num;
	private int gumball_cost;
    
	private int input_value;
        private int required_value;
        private int more_value;
    
 
	public GumballMachine(int machineNumber, int numberGumballs) {
		soldOutState = new SoldOutState(this);
		noCoinState = new NoCoinState(this);
		hasCoinState = new HasCoinState(this);
		soldState = new SoldState(this);

        this.machine_num = machineNumber;

        setMachine();
		this.count = numberGumballs;
 		if (numberGumballs > 0) {
			state = noCoinState;
		} 
	}
 
    public void setMachine() {
    	
		if ( this.machine_num == 1 ) { 
  		  System.out.println( "Gumball cost is 25 cents, only quarters are accepted!!" );
  		  this.gumball_cost = 25;
        }
        else if ( this.machine_num == 2) {
  		  System.out.println( "Gumball cost is 50 cents, only quarters are accepted!!" );
  		  this.gumball_cost = 50;
        }
        else if ( this.machine_num == 3) {
    	  System.out.println( "Gumball cost is 50 cents, all coins are accepted!!" );
    	  this.gumball_cost = 50;
        }
        else {
          System.out.println( "No such Gumball vending machine" );
          System.exit(0);
        }
		
	}
	public void insertCoin(int coin) {
		
		if ( (this.machine_num == 1 || machine_num == 2 ) && coin != 25 ) {
		  System.out.println( "Can't return your coins, Please add ony quarters for this machine!!" );
		  //coin = 0;	
        }
    	this.input_value = this.input_value + coin; 
	    this.required_value = this.gumball_cost - this.input_value; 
        state.insertCoin();
	}
 
	public void ejectCoin() {
        state.ejectCoin();
    }
 
	public void turnCrank() {
		if ( this.input_value > this.gumball_cost) {
            this.more_value = this.input_value - this.gumball_cost;
            System.out.println("You added " + this.more_value +" cents! more");
		    state = hasCoinState;
		    this.input_value = 0;
		 } 
        state.turnCrank();
		state.dispense();
	}

	void setState(State state) {
		this.state = state;
	}
 
	void releaseBall() {
		if ( this.required_value <= 0 ) {
		  System.out.println("A gumball comes rolling out the slot...");
		  if (count != 0) {
			count = count - 1;
			this.input_value = 0;
		  }
		} 
		else {
    	    if ( this.machine_num == 3  ) {
    	    	System.out.println( "Please add " + this.required_value + " cents more!" );
    		}
    		state = hasCoinState;
		}
	}
 
	int getCount() {
		return count;
	}
	
	void refill(int count) {
		this.count = count;
		state = noCoinState;
	}

    public State getState() {
        return state;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getNoCoinState() {
        return noCoinState;
    }

    public State getHasCoinState() {
        return hasCoinState;
    }

    public State getSoldState() {
        return soldState;
    }
 
	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("\nMighty Gumball, Inc.");
		result.append("\nJava-enabled Standing Gumball Model #2004");
		result.append("\nCost of the gumball: " + gumball_cost + " cents");
		result.append("\nInventory: " + count + " gumball");
		if (count != 1) {
			result.append("s");
		}
		
		result.append("\n");
		result.append("Machine is " + state + "\n");
		return result.toString();
	}
}