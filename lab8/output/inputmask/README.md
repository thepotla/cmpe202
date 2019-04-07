The design patterns in the initial code are chain of responsibility and composite.

For masking the display, I have implemeted Adapter pattern. 

For this created a new interface IDisplay with a maskinput method. This method is implemented in CreditCardNum and CreditCardExp to mask the input as per the requirements.

1. Composite Pattern is used to add all the components CreditCardNum, CreditCardExp and CreditCardCVC as part of the Screen.

2. Chain of responsibility pattern is used to pass the handler from one to the next.
   a. When the user keys in a digit, till the count of digits is 16, the key is passed to the first handler in the chain which is the CreditCardNum. 
   b. From digits 17 to 20 , the handler is CreditCardExp.
   c. From digits 21 to 23, the handler is CreditCardCVC.

3. The maskinput method of each, CreditCardNum and CreditCardExp will perform the inputmask as per the requirements.