package lab2;

import lab2.InputOutputGui;

/**
 * This challenge is similar to the first one, except that the architecture has
 * change to SOA. Now it's more important than ever to throw exceptions back to
 * a class that is responsible for displaying error messages.
 * <p>
 * No input or output should be performed here.
 * 
 * @author Ryan Dunckel, rdunckel@my.wctc.edu
 * @version 1.00
 */
public class Challenge2 {

	public static void main(String[] args) {

		InputOutputGui iOGui = new InputOutputGui();
		iOGui.startConversation();
	}

}
