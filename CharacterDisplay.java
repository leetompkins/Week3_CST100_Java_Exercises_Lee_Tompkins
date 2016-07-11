/* A program that prints the characters between two other character, The program prints 10 characters per line 
 * with a space separating them.
 * Week3 Chapter 6 Exercise 6.12
 * File CharacterDisplay.java
 * Author Lee Tompkins
 * Date Jul 8 2016
 */
import java.util.Scanner;
public class CharacterDisplay {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter in two characters to display all characters between them, seperate by a space");
		// Store user input and convert to char variables 
		String x = input.next();
		String y = input.next();
		char a = x.charAt(0);
		char z = y.charAt(0);
		PrintChars.printChars(a, z, 10); // invoke printChars method to display inbetween characters 
		
		
	}

}
class PrintChars {
	public static void printChars(char ch1, char ch2, int numberPerLine) { // method for displaying characters in between user input characters 
		int countDif = (int)(ch2 - ch1); // count difference between characters 
		for (int i = 1; i < countDif; i++) { // loop until remainder is 0, display chars with single space in between and 10 chars per line 
			System.out.print(++ch1 + " ");
			if (i % numberPerLine == 0) {
				System.out.println("\n");
			}
		}
	}
}