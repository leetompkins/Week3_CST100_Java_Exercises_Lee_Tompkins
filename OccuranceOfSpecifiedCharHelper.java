import java.util.Scanner;

/* Week 3 Chapter 18 Exercise 18.15
 * Author Lee Tompkins
 * File OccuranceOfSpecifiedCharHelper.java
 * Date Jul 8 2016
 * Summary: A helper method for the mehtod made in 18.10 to pass a substring "high" index to the method
 * Method header public static int count(String str, char a, int high)
 */
import java.util.Scanner;
public class OccuranceOfSpecifiedCharHelper {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter in a string followed by a character to count the occurances of that character");
		String str = input.next();
		String b = input.next();
		char a = b.charAt(0);
		int output = count(str, a);
		System.out.println("The character " + a + " occurs " + output + " times in the string " + str);
		

	}
	
	
	
	
	public static int count(String str, char a) {
		if (str.length() == 0) {
			return 0;
		} else if (str.charAt(0) == a) {
			return 1 + count(str.substring(1, str.length()), a);
		} else 
			return count(str.substring(1, str.length()), a);
			
		
	}
	
	public static int count(String str, char a, int high) {
		if (str.length() == 0) {
			return 0;
		} else if (str.charAt(0) == a) {
			return 1 + count(str.substring(1, high), a);
		} else 
			return count(str.substring(1, str.length()), a);
			
		
	}
}
