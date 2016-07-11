/* Week3 Chapte4 Exercise 4.11 
 * A program that asks the user to input an integer between 0 and 15 and converts 
 * it to its corresponding hex number 
 * File DecimalToHex.java
 * Author Lee Tompkins
 * Date Jul 8 2016
 */


import java.util.Scanner;
public class DecimalToHex {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// Requesting user input 
		System.out.print("To convert from decimal to hex, enter in an integer between 0 and 15");
		// Store user input as int variable userInput
			int userInput = input.nextInt();
		String hexNum = Integer.toHexString(userInput); // Convert user input string to hexString
		// Ensure user input is between 0 & 15, else show invalid 
		if (0 <= userInput && userInput <= 15) {
			System.out.println("The hexadecimal for " + userInput + " is " + hexNum);
		} else {
			System.out.println(userInput + " is an invalid input ");
		}

	}

}
