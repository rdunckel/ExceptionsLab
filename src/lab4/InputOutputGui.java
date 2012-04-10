package lab4;

import javax.swing.JOptionPane;

/**
 * This class is responsible for all input and output in the program.
 * 
 * @author Ryan Dunckel, rdunckel@my.wctc.edu
 * @version 1.00
 */
public class InputOutputGui {
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

		} catch (InvalidNameException ine) {
			JOptionPane.showMessageDialog(null, ine.getMessage(),
					"Input Error", JOptionPane.ERROR_MESSAGE);
		} finally {
			System.out.println("Name service called.");
		}
		String msg = "Your last name is: " + lastName;
		JOptionPane.showMessageDialog(null, msg);

	}

}
