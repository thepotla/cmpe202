 

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int machine_number;    // To hold gumball machine type.
		int getcoin;

	    int gumballs_count = 5; 

	      // Create a Scanner object to read input.
	      Scanner console = new Scanner(System.in);

	      System.out.println("There are three gumball vending machines, Choose the Machine:");
	      System.out.println("Machine 1: 25 cents and accepts only quarters");
	      System.out.println("Machine 2: 50 cents and accepts only quarters");
	      System.out.println("Machine 3: 50 cents and accepts all coins, nickels, dimes and quarters");
	      
	      // Get Machine number from user
	      System.out.println("Enter Machine number: (1, 2, or 3)");	      
	      machine_number = console.nextInt();
  
		GumballMachine gumballMachine = new GumballMachine(machine_number, gumballs_count);

		System.out.println(gumballMachine);

		for (int i = 0; i < 10; i++) {

			System.out.println("Enter coin amount ");
			getcoin = console.nextInt();
	
			gumballMachine.insertCoin(getcoin);
			gumballMachine.turnCrank();
		}
		
		System.out.println(gumballMachine);
		System.out.println("Enter Machine number: (1, 2, or 3)");	      
	      machine_number = console.nextInt();
		console.close();
	}
}
			