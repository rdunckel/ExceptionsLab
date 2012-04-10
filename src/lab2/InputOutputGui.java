package lab2;

import javax.swing.JOptionPane;

/**
 * This class is responsible for all input and output in the program.
 * 
 * @author Ryan Dunckel, rdunckel@my.wctc.edu
 * @version 1.00
 */
public class InputOutputGui {
	private static final String ERR_MSG = "Sorry, a first name and a last name are required, no more. "
			+ "Please try again.";
	private static final String MSG_TITLE = "Input Error";

	private NameService nameService;

	public InputOutputGui() {
		nameService = new NameService();
	}

	/**
	 * Startup dialog from the GUI, initiating the user interaction.
	 */
	public void startConversation() {

		String fullName = JOptionPane.showInputDialog("Enter full name:");

		if (fullName == null) {
			System.exit(0);
		}

		String lastName = "Unknown";

		try {
			lastName = nameService.extractLastName(fullName);

		} catch (RuntimeException re) {
			JOptionPane.showMessageDialog(null, ERR_MSG, MSG_TITLE,
					JOptionPane.ERROR_MESSAGE);
		}

		String msg = "Your last name is: " + lastName;
		JOptionPane.showMessageDialog(null, msg);

	}

}
