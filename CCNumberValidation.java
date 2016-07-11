/* Week3 Chapter6 Exercise 6.31
 * Date Jul 8 2016
 * Author Lee Tompkins 
 * File CCNumberValidation.java
 * Summary: A program that checks whether a credit card is valid or not valid 
 * with the use of multiple pre-defined methods
 */

import java.util.Scanner;
public class CCNumberValidation {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter in a CC number to determine if it is valid or not");
		long ccNumber = input.nextLong();
		if(CCNumValidationMethods.isValid(ccNumber)) {
			System.out.println(ccNumber + " Is a valid card number");
		} else {
			System.out.println(ccNumber + " Is not a valid card number");
		}
		

	}

}

class CCNumValidationMethods {
	//Return true if card num valid
	public static boolean isValid(long number){
		
		long x = number;
		String xD = Long.toString(x);
		xD = xD.substring(0, 1);
		int d = Integer.valueOf(xD);
		boolean valid = false;
		boolean isValidLength = false;
		boolean prefixValid = false;
		boolean sumTotal = false;
		if(CCNumValidationMethods.getDigit((int) number) == 75) {
			sumTotal = true;
		}
		if(13 <= CCNumValidationMethods.getSize(number) && CCNumValidationMethods.getSize(number) <= 16) {
			isValidLength = true;
		}
		if(CCNumValidationMethods.prefixMatched(number, d)){
			prefixValid = true;
		}
		if(isValidLength && prefixValid && sumTotal) {
			valid = true;
		}
		return valid;
	}
	//Get result from step 2
	public static int sumOfDoubleEvenPlace(long number){
		int k = 10;
		long x = CCNumValidationMethods.getPrefix(number, k);
		int xX = (int) x;
		return xX;
	}
		
	// Return this number if it is a single digit or
	//return sum if two digits
	public static int getDigit(int number) {
		int sum = CCNumValidationMethods.sumOfDoubleEvenPlace(number) + CCNumValidationMethods.sumOfOddPlace(number) ; 
		return sum;
	}
	// Return sum of odd placed digits in number
	public static int sumOfOddPlace(long number) {
		 String strNumber = Long.toString(number);
		 int sum = strNumber.charAt(1);
		for(int i = 3; i <= strNumber.length(); i += 2) {
			sum += strNumber.charAt(i);
		}
		return sum;
	}
	// Return true if digit d is prefix for number
	public static boolean prefixMatched(long number, int d) {
		String x = Integer.toString(d);
		if(x.charAt(0) == 4 || x.charAt(0) == 5 || x.charAt(0) == 6) {
			return true;
		} else if (x.charAt(0) == 3 && x.charAt(1) == 7) {
			return true;
		} else return false;
	}
	// Return the number of digits in d
	public static int getSize(long d) {
		int length;
		String strLength = Long.toString(d);
		length = strLength.length();
		return length;
	}
	// Return the first k number of digits from number. If the number of 
	// digits in number is less than k return number
	public static long getPrefix(long number, int k) {
		String strNumber = Long.toString(number);
		int sum = 0;
		for (int i = strNumber.length(); i <= 0; i -=2) {
			if (strNumber.charAt(i) * 2 >= k) {
				int x = strNumber.charAt(i) * 2;
				String xX = Integer.toString(x);
				int y = xX.charAt(0) + xX.charAt(1);
				sum += y; 
			} else {
				sum += strNumber.charAt(i) * 2;
			}
		}
		return sum;
	}
}
