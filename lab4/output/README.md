**CRC CARDS**

| Class: Customer                                                                                                                                                                      |                     |
|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|---------------------|
| Responsibilities                                                                                                                                                                     | Collaborators       |
| KNOWS: Name ID Cell Phone \# ID No. of people in party DOES: Registers on Waitlist Confirms or Leaves Waitlist                                                                       | Waitlist            |
| Class: Waitlist                                                                                                                                                                      |                     |
| Responsibilities                                                                                                                                                                     | Collaborators       |
| KNOWS: Customer Details List Details Table Ready Details DOES: Sends registration message to Customer Checks to see if table is ready Sends a 'Confirm or Leave' message to Customer | Customer Table      |
| Class: Table                                                                                                                                                                         |                     |
| Responsibilities                                                                                                                                                                     | Collaborators       |
| KNOWS: No. of seats in a table Table availability DOES: Checks if table is ready                                                                                                     | Waitlist TableReady |
| Class: TableReady                                                                                                                                                                    |                     |
| Responsibilities                                                                                                                                                                     | Collaborators       |
| KNOWS: If table is available DOES: Sends a ready message to Table                                                                                                                    | Table               |

**DESIGN PATTERNS**

OBSERVER PATTERN (I chose this pattern because the problem statement fits the
observer pattern where a number of objects depend on another object.)

**Subject:** Table

**ConcreteSubject:** Waitlist

**Observer:** Customer

**ConcreteObserver:** TableReady

-   The pattern revolves around the “Table” where customers register for a
    ‘table’

-   The “Waitlist” implements ‘table’

-   The “Customer” is observing when the ‘table’ is ready and ‘confirms’ or
    ‘leaves’ the ‘table’

-   The “Waitlist” is updated based on customer response and is ready for the
    next customer

STATE PATTERN (I chose this pattern as well where the waitlist has several
states and checks on the table availability, which is the context.)

**Context:** Table

**State:** Waitlist

The pattern revolves around the “Table” where customers register for a ‘table’

The “Waitlist” state changes based on ‘table’ availability. It has two states:

1.  New Customers registration

2.  Customers Confirm or Leave
