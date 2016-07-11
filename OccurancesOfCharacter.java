/* Week 3 Chapter 18 Exercise 18.10
 * Author Lee Tompkins
 * File OccuranceOfCharacter.java
 * Date Jul 8 2016
 * Summary: A program that uses a recursive method to find the number of occurences 
 * of a specified letter in a string using method header: public static int count (String str, char a) {}
 */
import java.util.Scanner;
public class OccurancesOfCharacter {

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
}
