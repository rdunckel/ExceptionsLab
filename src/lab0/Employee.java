package lab0;

import java.util.Date;

/**
 * Represents a 'typical' human employee in corporate America.
 *
 * @author Ryan Dunckel, rdunckel@my.wctc.edu
 * @version 1.00
 */
public class Employee {

    /**
     * The maximum number of vacation days (28) an employee can have.
     */
    public static final int MAX_VACATION_DAYS = 28;
    /**
     * A date to compare against for hire date validation (Jan 1st, 1970).
     */
    public static final Date MIN_HIRE_DATE = new Date(0);
    private String firstName;
    private String lastName;
    private String ssn;
    private Date hireDate;
    private int daysVacation;

    /**
     * Default constructor.
     *
     * Initializes several fields to unknown and/or '0'.
     */
    public Employee() {
        firstName = "Unknown";
        lastName = "Unknown";
        ssn = "Unknown";
        hireDate = new Date();
        daysVacation = 0;
    }

    /**
     * Constructor to set relevant information for an employee.
     *
     * @param firstName The employee's first name.
     * @param lastName The employee's last name.
     * @param ssn The employee's social security number (in XXX-XX-XXXX format).
     * @param hireDate The employee's hire date.
     * @param daysVacation The amount of vacation days the employee is allowed.
     */
    public Employee(String firstName, String lastName, String ssn, Date hireDate, int daysVacation) {
        setFirstName(firstName);
        setLastName(lastName);
        setSsn(ssn);
        setHireDate(hireDate);
        setDaysVacation(daysVacation);
    }

    public final int getDaysVacation() {
        return daysVacation;
    }

    /**
     * Sets the number of vacation days for the employee.
     *
     * @param daysVacation The number of vacation days the employee is allowed.
     * Validated to ensure the String object is not null, is not empty, and
     * contains all alpha characters.
     * @throws IllegalArgumentException in the event of a value outside of the
     * valid range.
     */
    public final void setDaysVacation(int daysVacation) throws IllegalArgumentException {
        if (daysVacation < 0 || daysVacation > MAX_VACATION_DAYS) {
            throw new IllegalArgumentException("Vacation days must be between 0 and " + MAX_VACATION_DAYS);
        }

        this.daysVacation = daysVacation;
    }

    public final String getFirstName() {
        return firstName;
    }

    /**
     * Sets the employee's first name.
     *
     * @param firstName The employee's first name. Validated to ensure the
     * String object is not null, is not empty, and contains all alpha
     * characters.
     * @throws IllegalArgumentException if validation on the string fails.
     */
    public final void setFirstName(String firstName) throws IllegalArgumentException {
        if (firstName == null || firstName.length() == 0 || !(isAllAlpha(firstName))) {
            throw new IllegalArgumentException("Must provide first name (all alpha)");
        }

        this.firstName = firstName;
    }

    public final Date getHireDate() {
        return hireDate;
    }

    /**
     * Sets the hire date for the employee.
     *
     * @param hireDate The employee's hire date. Validated to ensure the date
     * object is not null and the hire date is greater than the MIN_HIRE_DATE
     * constant.
     * @throws IllegalArgumentException if validation on the date fails.
     */
    public final void setHireDate(Date hireDate) throws IllegalArgumentException {
        if (hireDate == null || hireDate.before(MIN_HIRE_DATE)) {
            throw new IllegalArgumentException("Hire date must not be empty or before 1/1/1970");
        }

        this.hireDate = hireDate;
    }

    public final String getLastName() {
        return lastName;
    }

    /**
     * Sets the employee's last name.
     *
     * @param lastName The employee's last name. Validated to ensure the String
     * object is not null, is not empty, and contains all alpha characters.
     * @throws IllegalArgumentException if validation on the string fails.
     */
    public final void setLastName(String lastName) throws IllegalArgumentException {
        if (lastName == null || lastName.length() == 0 || !(isAllAlpha(lastName))) {
            throw new IllegalArgumentException("Must provide last name (all alpha)");
        }

        this.lastName = lastName;
    }

    public final String getSsn() {
        return ssn;
    }

    /**
     * Sets the employee's social security number.
     *
     * @param ssn The employee's social security number. Validated to ensure the
     * ssn String object is not null, is greater than zero, and is all numeric.
     * [Should be of the format 123456789].
     * @throws IllegalArgumentException if validation on the SSN fails.
     */
    public final void setSsn(String ssn) throws IllegalArgumentException {
        if (ssn == null || ssn.length() == 0 || !(isAllNumeric(ssn))) {
            throw new IllegalArgumentException("Must provide social security number");
        }

        this.ssn = ssn;
    }

    private static boolean isAllAlpha(String string) {
        char[] chars = string.toCharArray();

        boolean alphaChars = true;

        for (char c : chars) {
            if (!(Character.isLetter(c))) {
                alphaChars = false;
            }
        }

        return alphaChars;

    }

    private static boolean isAllNumeric(String string) {
        char[] chars = string.toCharArray();

        boolean numericChars = true;

        for (char c : chars) {
            if (!(Character.isDigit(c))) {
                numericChars = false;
            }
        }

        return numericChars;

    }

    /**
     * Standard toString method returning all properties of the employee.
     *
     * @return
     */
    @Override
    public String toString() {
        return "Employee{" + "firstName=" + firstName + ", lastName=" + lastName
                + ", ssn=" + ssn + ", hireDate=" + hireDate + ", daysVacation="
                + daysVacation + '}';
    }

    /**
     * A main method to test the class.
     *
     * @param args The command line arguments.
     */
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setDaysVacation(MAX_VACATION_DAYS);
        employee.setFirstName("Ryan");
        employee.setHireDate(MIN_HIRE_DATE);
        employee.setLastName("Dunckel");
        employee.setSsn("123456789");
        System.out.println(employee);
    }
}
