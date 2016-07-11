/* Week3 Chapter6 Exercise 6.31
 * Date Jul 8 2016, Last Modified Jul 11 2016
 * Author Lee Tompkins 
 * File CCNumberValidation.java
 * Summary: A program that checks whether a credit card is valid or not valid 
 * with the use of multiple pre-defined methods
 */
import java.util.Scanner;
public class CCNumberValidation {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); // Create Scanner
		System.out.print("Enter in a CC number to determine if it is valid or not");
		long ccNumber = input.nextLong(); // Store CC input as long 
		if(CCNumValidationMethods.isValid(ccNumber)) { // Display if CC num is valid or not
			System.out.println(ccNumber + " Is a valid card number");
		} else {
			System.out.println(ccNumber + " Is not a valid card number");
		}
		

	}

}

class CCNumValidationMethods {
	//Return true if card num valid
	public static boolean isValid(long number){
		// Declare variables an booleans 
		int d =0;
		boolean sum = false;
		boolean valid = false;
		boolean prefixMatched = false;
		boolean length = false;
		// Set booleans based on method returns 
		if ((CCNumValidationMethods.sumOfDoubleEvenPlace(number) + CCNumValidationMethods.sumOfOddPlace(number)) % 10 == 0) {
			sum = true;
		} else {
			sum = false;
		}
		if (CCNumValidationMethods.prefixMatched(number, d)) {
			prefixMatched = true;
		} else {
			prefixMatched = false;
		}
		if(CCNumValidationMethods.getSize(number) >= 13 && CCNumValidationMethods.getSize(number) <= 16) {
			length = true;
		} else {
			length = false;
		}
		if(sum && prefixMatched && length) {
			valid = true;
		} else {
			valid = false;
		}
		return valid; // return final validity
	}
	
	//Get result from step 2
	public static int sumOfDoubleEvenPlace(long number){
		String longNumber = Long.toString(number); // convert long to string
		int sumOfDoubleEven = 0; // initialize variable for double sums
		for(int i = 0; i < longNumber.length(); i += 2 ) {
			sumOfDoubleEven += CCNumValidationMethods.getDigit(longNumber.charAt(i) - 48);
		}
		return sumOfDoubleEven;
	}
		
	// Return this number if it is a single digit or
	//return sum if two digits
	public static int getDigit(int number) {
		number = number * 2;
		if(number < 10) {
			return number;
		} else {
			String strNumber = Integer.toString(number);
			int sum = (strNumber.charAt(0) - 48) + (strNumber.charAt(1) - 48);
			return sum;
		}
	}
	// Return sum of odd placed digits in number
	public static int sumOfOddPlace(long number) {
		 String strNumber = Long.toString(number);
		 int sum = strNumber.charAt(1) - 48;
		for(int i = 3; i <= strNumber.length(); i += 2) {
			sum = sum + (strNumber.charAt(i) - 48);
		}
		return sum;
	}
	// Return true if digit d is prefix for number
	public static boolean prefixMatched(long number, int d) {
		String x = Long.toString(number);
		int xx = x.charAt(0) - 48;
		if(xx == 4 || xx == 5 || xx == 6) {
			return true;
		} else if ((x.charAt(d) - 48) == 3 && (x.charAt(1) - 48) == 7) {
			return true;
		} else {
			return false;
		}
	}
	// Return the number of digits in d
	public static int getSize(long d) {
		int length; // Declare variable length
		String strLength = Long.toString(d); // convert to string
		length = strLength.length(); // set length equal to string length
		return length; // return length
	}
	// Return the first k number of digits from number. If the number of 
	// digits in number is less than k return number
	//public static long getPrefix(long number, int k) {
	//}	
}