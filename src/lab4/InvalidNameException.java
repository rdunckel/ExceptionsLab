package lab4;

/**
 * Exception thrown when an invalid name is used.
 * 
 * @author Ryan Dunckel, rdunckel@my.wctc.edu
 * @version 1.00
 */
public class InvalidNameException extends Exception {
	private static final String ERR_MSG = "Sorry, you must provide both a first name and a last name. "
			+ "Please try again.";

	public InvalidNameException() {
		super(ERR_MSG);
	}

}
