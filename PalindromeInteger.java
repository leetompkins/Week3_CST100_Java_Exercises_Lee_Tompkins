/* Plaindrome Integer 
 * Summary: Write methods to reverse integer order, return true if integer is Palindrome
 * Test program to prompt user to enter an integer and report whether it is a Palindrome number 
 * File PalindromeInteger.java
 * Author Lee Tompkins 
 * Date Jul 8 2016
 */
import java.util.Scanner;

public class PalindromeInteger {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer to see if it is a Palindrome number or not");
			int userInput = input.nextInt(); // User input variable
		if(PalinDromeMethods.isPalindrome(userInput) == true) { // invoke method from PalinDromeMethods class
			System.out.println(userInput + " is a Palindrome number");
		} else {
			System.out.println(userInput + " is not a Palindrome number");
		}
			
		
		 
			
		

	}

}


class PalinDromeMethods {
	// Method to reverese 1st and last character of number 
	public static int reverse(int number){
		String num = Integer.toString(number);
		char a = num.charAt(0);
		char b = num.charAt(num.length() - 1);
		num.replace(a,  b);
		num.replace(b, a);
		number = Integer.parseInt(num);
		return number;
	}
	// Method for checking if PalinDrome number
	public static boolean isPalindrome(int number){
		String num = Integer.toString(number); // convert int to string 
		char a = num.charAt(0); // Set character at 0 = a 
		char b = num.charAt(num.length() - 1); // set last character = b 
		if( a == b) { // If 1st and last character are the same, return true, if not, return false
			return true;
		} else {
			return false;
		}
	}
}

