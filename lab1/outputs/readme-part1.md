This program works for all the three gumball machines by instantiating each machine.

Machine1: The gumball cost in this machine is 25 cents and only quarters are accepted.

Machine2: The gumball cost in this machine is 50 cents and only quarters are accepted.

Machine3: The gumball cost in this machine is 50 cents, nickels, dimes and quarters are accepted.

Main.java:

GumballMachine is instantiated and the coins are accepted through user input and inserted into the machine using the insertCoin() method.
After the coin insertion, turnCrank() method is called to turn the crank.

GumballMachine.java:

Based on the machine number the gumball cost is set to the appropriate cost.

insertCoin():
If machine number is 1 or 2 and coin is not a quarter a message output "Can't return your coins, Please add only quarters for this machine!!" is displayed.

turnCrank():
This method checks if the value of inserted coins is equal to or more than the cost of the gumball to dispense the gumball.

If the coins inserted is equal to or more than the cost of the gumball, gumball is ejected

If coins inserted are more than the gumball cost, a message with the excess value is displayed and gumball is ejected.

The number of gumballs is decreased by one each time a gumball is dispensed.

When the machine is out of gumballs a message stating the same is displayed to the user.

