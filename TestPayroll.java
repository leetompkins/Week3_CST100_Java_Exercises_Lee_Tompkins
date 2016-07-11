/* Week 3 Chapter 4 Exercise 4.23
 * Author Lee Tompkins 
 * File TestPayroll.java
 * Date Jul 9 2016 
 * Summary: A program that takes user input payroll data and displays 
 * taxes paid, total hours worked, gross pay, and pay rate 
 */
import java.util.Scanner;
public class TestPayroll { // Class to test the Payroll class 

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// Request user input for payroll data
		System.out.println("Enter in the following information to display the payroll statment");
		System.out.print("Enter employee's name");
			String name = input.next();
		System.out.print("Enter number of hours worked in a week");
			double hoursWorked = input.nextDouble();
		System.out.print("Enter in hourly pay rate");
			double payRate = input.nextDouble();
		System.out.print("Enter in federal tax withholding rate");
			double fedTaxRate = input.nextDouble();
		System.out.print("Enter in state withholding tax rate");
			double stateTaxRate = input.nextDouble();
		// Construct payroll from Payroll class with specified parameters 
		Payroll payroll1 = new Payroll(name, hoursWorked, payRate, fedTaxRate, stateTaxRate);
		// Display results according to specified input parameters 
		System.out.print(payroll1);

	}

}

class Payroll { // A class to handle specific payroll arguments 
	Payroll(String name, double hoursWorked, double payRate, double fedTaxRate, double stateTaxRate){
		System.out.println("Emplyee Name: " + name ); // show name
		System.out.println("Hours Worked: " + hoursWorked ); // show hours worked
		System.out.println("Pay Rate: " + payRate ); // show pay rate
		System.out.println("Federal Tax Rate: " + fedTaxRate ); // show federal tax rate
		System.out.println("State Tax Rate: " + stateTaxRate ); // show state tax rate
		System.out.println("Gross Pay: $" + (payRate * hoursWorked)); // show gross pay before deductions 
		System.out.println("Deductions:");
		System.out.println("Federal Withholding: $" + (hoursWorked * payRate * fedTaxRate)); // show federal taxes paid
		System.out.println("State Withholding: $" + (hoursWorked * payRate * stateTaxRate)); // show state taxes paid
		System.out.println("Total Deduction: $" + ((hoursWorked * payRate * fedTaxRate) + (hoursWorked * payRate * stateTaxRate))); // show total paid out
		System.out.println("Net Pay: $" + ((payRate * hoursWorked) - ((hoursWorked * payRate * fedTaxRate) + (hoursWorked * payRate * stateTaxRate)))) ; // show net pay
	}
}