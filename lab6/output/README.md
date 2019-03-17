This program works on Factory Method design pattern.

There is a Menu interface which get implemented through the Burger, Fries and Toppings files.

The pricing of the burgers and fries are stored in the respective java files.

The toppings file has the options of all the toppings available.

BuildOrder build the order by giving the options of burger,fries and toppings.

Based on the options selected the respective prices are set for each item.

Helper and Print classes together help in printing the order receipt and packing slip.

Shown below is the output created.

To run the program:
java -classpath C:\lab6\bin; Main

        ****************************         
             ORDER RECEIPT              
        ****************************         
                  FIVE GUYS                  
              BURGERS AND FRIES              
               STORE # CA-1294               
            5353 ALMADEN EXPY N60            
             SAN JOSE, CA 95118              
              (P) 408-264-9300               
           03/75/2019 08:05:11 AM            
                  FIVE GUYS                  
  Order No.45
   1 LBB                          5.59
      TOMATO
      LETTUCE
      > | G ONION
      {{{{BACON}}}}
  1 LTL  CAJ                      2.79
     Sub. Total:                 $8.38
     Tax:                        $0.75
     Total:                      $9.13


     Cash $20.0                 $20.00
     Change                     $10.87
    Register:1      Tran Seq No: 57845    
    Cashier:Sakda* S.     
    ************************************     
      Don't throw away your receipt!!!       
                      
                      
      Help Five Guys and you could win!      


        ****************************         
              PACKING SLIP              
        ****************************         


PATTIES - 1


  Order No.45
           03/75/2019 08:05:11 AM            
                  FIVE GUYS                  


Sandwich# 1
   1 LBB 
      TOMATO
      LETTUCE
      > | G ONION
      {{{{BACON}}}}
      
  1 LTL CAJ
    Register:1      Tran Seq No: 57845    
    Cashier:Sakda* S.     
