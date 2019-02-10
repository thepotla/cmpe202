 

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int getcoin;

	    int gumballs_count = 5; 
	  

	      // Create a Scanner object to read input.
	    Scanner console = new Scanner(System.in);
    
	    System.out.println("\nMachine 1");
		GumballMachine gumballMachine1 = new GumballMachine(1, gumballs_count);
		System.out.println(gumballMachine1);
		for (int i = 0; i < 3; i++) {

			System.out.println("Enter coin amount ");
			getcoin = console.nextInt();
	
			gumballMachine1.insertCoin(getcoin);
			gumballMachine1.turnCrank();
		}
		System.out.println("\nMachine 1: completed");
		
		System.out.println("\nMachine 2");
		GumballMachine gumballMachine2 = new GumballMachine(2, gumballs_count);		
		System.out.println(gumballMachine2);
		for (int i = 0; i < 10; i++) {

			System.out.println("Enter coin amount ");
			getcoin = console.nextInt();
	
			gumballMachine2.insertCoin(getcoin);
			gumballMachine2.turnCrank();
		}
		System.out.println("\nMachine 2: completed");
		
		System.out.println("\nMachine 3");
		GumballMachine gumballMachine3 = new GumballMachine(3, gumballs_count);
        System.out.println(gumballMachine3);
		for (int i = 0; i < 30; i++) {

			System.out.println("Enter coin amount ");
			getcoin = console.nextInt();
	
			gumballMachine3.insertCoin(getcoin);
			gumballMachine3.turnCrank();
		}
		System.out.println("\nMachine 3: completed");
		
		console.close();
	}
}
			