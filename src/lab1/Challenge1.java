package lab1;

import javax.swing.JOptionPane;

/**
 * The purpose of this challenge is to give you practice time using Java
 * Exception handling techniques.
 * <p>
 * Your challenge is to consider all the possible things that can go wrong with
 * this program and use exception handling where appropriate to prevent the
 * program from crashing. In addition you must display a friendly error message
 * in a JOptionPane and ask the user to try again.
 * 
 * @author Ryan Dunckel, rdunckel@my.wctc.edu
 * @version 1.00
 */
public class Challenge1 {
	private static final int LAST_NAME_IDX = 1;
	private static final String ERR_MSG = "Sorry, a first name and a last name are required, no more.  "
			+ "Please try again.";
	private static final String MSG_TITLE = "Input Error";

	public static void main(String[] args) {
		Challenge1 app = new Challenge1();

		String fullName = JOptionPane.showInputDialog("Enter full name:");

		String lastName = app.extractLastName(fullName);
		String msg = "Your last name is: " + lastName;
		JOptionPane.showMessageDialog(null, msg);
	}

	/**
	 * Finds and returns the last name from within a full name. Caution: No
	 * validation is performed.
	 * 
	 * @param fullName
	 *            - a name containing a first name and a last name
	 * @return the last name
	 */
	public String extractLastName(String fullName) {

		String lastName = "Unknown";

		try {
			String[] nameParts = fullName.split(" ");

			if (nameParts.length != 2) {
				throw new IllegalArgumentException();
			}

			lastName = nameParts[LAST_NAME_IDX];

		} catch (NullPointerException npe) {
			System.exit(0);

		} catch (RuntimeException re) {
			JOptionPane.showMessageDialog(null, ERR_MSG, MSG_TITLE,
					JOptionPane.ERROR_MESSAGE);
		}

		return lastName;
	}

}
