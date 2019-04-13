I have used the Strategy Pattern to implement Java Lambda Expression.

In my test case, I have chosen a payment module that is generally used by several shopping sites to make a payment.

The payment can be done using two ways, payment using cash or payment using a credit card. Each type of payment will incur its own additional service charges which get computed in the final amount to be paid.

In the regular approach, two separate classes for each type of payment created (CashPayment, CardPayment).

Using Strategy pattern, an interface with a payment method is implemented in the above two created classes.
Each class will implement its own method of payment depending on the additional charges that could be incurred based on the payment type. 

Using Java Lambdas, the strategies are implemented with lambdas. Instead of creating a hierarchy of classes to support the strategy pattern we can now create a library of lambda functions or static methods to apply the respective strategy.

With the use of lambda expressions, the additional classes (CashPayment, CardPayment) are now redundant. 

Additional payment strategies can then be specified using lambda expression.




