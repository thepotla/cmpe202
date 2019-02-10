This program works for all the three gumball machines instantiating each machine by the machine number.

Machine1: The gumball cost in this machine is 25 cents and only quarters are accepted.

Machine2: The gumball cost in this machine is 50 cents and only quarters are accepted.

Machine3: The gumball cost in this machine is 50 cents, nickels, dimes and quarters are accepted.

Main.java:

User is asked which machine does he want to use for getting the gumball.


GumballMachine is instantiated and the coins are accepted through user input and inserted into the machine using the insertCoin() method.
After the coin insertion, turnCrank() method is called to turn the crank.

GumballMachine.java:

Based on the machine number, setMachine() method sets gumball cost to the appropriate cost and the machine details.

insertCoin():
If machine number is 1 or 2 and coin is not a quarter a message output "Can't return your coins, Please add only quarters for this machine!!" is displayed.
else check if the inserted coins are enough to dispense the gumball.

turnCrank():
if the coins inserted is equal to or more than the cost of the gumball, gumball is ejected
if coins inserted are more than the gumball cost, a message with the excess value is displayed and gumball is ejected.

ejectCoin():
Machines 1 & 2: Ony quarters are accepted, if any other coin is inserted , the coin is ejected.
Machine 3: Nickels, dimes and quarters are accepted.

dipense():
Gumball is dispensed. 
Count of the gumballs by 1 after each dispense.


When the machine is out of gumballs a message stating the same is displayed to the user.