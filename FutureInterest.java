/* A Financial application that calculates future investment value at a given interest
 * rate for a specified number of years. Prompts user to enter in investment amount and the interest rate
 * then displays the future value from years 1 to 30
 * File FutureInterest.java
 * Author Lee Tompkins 
 * Date Jul 8 2016
 */

import java.util.Arrays;
import java.util.Scanner;

public class FutureInterest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter in an investment amount and interest rate to display the value over the next 30 years");
		System.out.print("Enter in an investment amount");
			double amount = input.nextDouble(); // Set user input for investment amount as double variable
		System.out.print("Enter in an annual interest rate");
			double interestRate = input.nextDouble(); // set user interest rate as double variable
		FutureInvestmentValue.futureValue(amount, interestRate); // invoke futureValue method from FutureInvestmentValue class using defined arguments  
		
		

	}

}
class FutureInvestmentValue{
	public static void futureValue(double amount, double rate) { // method with set arguments for calculating future investment value 
		double[] array; // create new double array 
		array = new double[30]; // set array suze to 30
		array[0] = amount; // set initial array value at index 0
		
		for (int i = 1; i < 30; i++) { 	// loop to gernerate values of investment for next 30 years and store them in array with respective index to year
			double x = (1 +(rate / 100));
			double y = Math.pow(x, i);
			amount = amount * y;
			array[i] = amount;
			
			// Display all values of investment for next 30 years 
		System.out.println(Arrays.toString(array));
			
		}
	}
}