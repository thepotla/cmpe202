/* (c) Copyright 2018 Paul Nguyen. All Rights Reserved */

public class CreditCardExp implements IDisplayComponent, IKeyEventHandler, IDisplay
{

	private IKeyEventHandler nextHandler ;
	private String date = "" ;

    public void setNext( IKeyEventHandler next) {
    	this.nextHandler = next ;
    }	

	public String display() {
		if ( date.equals("") )
			return "[MM/YY]" + "  " ;
		else
			return "[" + maskinput(date) + "]" + "  " ;
	}	

	public void key(String ch, int cnt) {
		if ( cnt >= 17 && cnt <= 20  ){
			date +=ch;
			if (ch.equalsIgnoreCase("X")) {
			  date = date.substring(0,date.length()-2) ;
		   } 
		}	
		else if ( nextHandler != null ) {
			nextHandler.key(ch, cnt) ;
		}
	}	

	public void addSubComponent( IDisplayComponent c ) {
		return ; // do nothing
	}

    public String maskinput(String date) {
		
		if ( ! date.equals("") ) {
			date = date.replaceAll("..(?!$)", "$0/")  ;
		}
		return date;
	}
}