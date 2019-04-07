/* (c) Copyright 2018 Paul Nguyen. All Rights Reserved */

public class CreditCardNum implements IDisplayComponent, IKeyEventHandler, IDisplay
{

	private IKeyEventHandler nextHandler ;
	private String number = "" ;
	
    public void setNext( IKeyEventHandler next) {
    	this.nextHandler = next ;
    }	

	public String display() {
		if ( number.equals("") ) {
			return "[4444 4444 4444 4444]" + "  " ;
		}
		else {
			return "[" + maskinput(number) + "]" + "  " ;
		}

	}	

	public void key(String ch, int cnt) {
		if ( cnt <= 16 ) {
			number +=ch;
			if (ch.equalsIgnoreCase("X")) {
			  number = number.substring(0,number.length()-2) ;
			}
			//maskdisplay();
		}
		else if ( nextHandler != null ) {
			nextHandler.key(ch, cnt) ;
		}
	}

	public void addSubComponent( IDisplayComponent c ) {
		return ; // do nothing
	}
	
 
	public String maskinput(String number) {
		
		if ( ! number.equals("") ) {
			number = number.replaceAll("....(?!$)", "$0 ")  ;
		}
		return number;
	}

}