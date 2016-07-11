/* Week 3 Chapter 18 Exercise 18.9

 * File RecursiveReverseString.java
 * Author Lee Tompkins
 * Date Jul 8 2016
 * Summary: A program that takes a user input string and displays the reverse 
 * with a recursive method
 */

import java.util.Scanner;
public class RecursiveReverseString {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter in a string of characters and see the them reversed");
		String userString = input.nextLine();
		System.out.println("The reverse of " + userString + " is " + reverseString(userString));
	}
		
		
		
		
		
	private static String reverseString(String s) {
		if ( s == null || s.length() <= 1) {
			return s;
		}
		return reverseString(s.substring(1)) + s.charAt(0);
	}
}

	