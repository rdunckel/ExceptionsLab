package lab2;

/**
 * This class provides various services relating to name manipulation. No output
 * should be performed here.
 * 
 * @author Ryan Dunckel, rdunckel@my.wctc.edu
 * @version 1.00
 */
public class NameService {
	private static final int FIRST_NAME_IDX = 0;
	private static final int LAST_NAME_IDX = 1;

	/**
	 * Finds and returns the last name from within a full name. Caution: No
	 * validation is performed.
	 * 
	 * @param fullName
	 *            - a name containing a first name and a last name
	 * @return the last name
	 * @throws IllegalArgumentException
	 *             if there are not two parts (firstName and lastName) to a full
	 *             name
	 */
	public String extractLastName(String fullName)
			throws IllegalArgumentException {

		String[] nameParts = fullName.split(" ");

		if (nameParts.length != 2) {
			throw new IllegalArgumentException();
		}

		return nameParts[LAST_NAME_IDX];
	}

	/**
	 * Finds and returns the first name from within a full name. Caution: No
	 * validation is performed. Can you fix this one?
	 * 
	 * @param fullName
	 *            - a name containing a first name and a last name
	 * @return the first name
	 */
	public String extractFirstName(String fullName) {
		String[] nameParts = fullName.split(" ");
		return nameParts[FIRST_NAME_IDX];
	}

	/**
	 * Gets the length of a name. CAn anything go wrong here? Can you fix?
	 * 
	 * @param name
	 *            - any full name or part of a name.
	 * @return the length of the name or part.
	 */
	public int getNameLength(String name) {
		return name.length();
	}

}
