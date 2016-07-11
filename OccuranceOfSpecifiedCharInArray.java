/* Week 3 Chapter 18 Exercise 18.17
 * Author Lee Tompkins
 * File OccuranceOfSpecifiedCharInArray.java
 * Date Jul 8 2016
 * Summary: A program that uses a recursive method to find the number of occurences 
 * of a specified character in an array 
 */
import java.util.Arrays;
import java.util.Scanner;
public class OccuranceOfSpecifiedCharInArray {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter in a list of characters followed by the character you would like to count occurances on to get the total occurances");
		// Declare variables , set character list to char array 
		String str = input.next();
		String character = input.next();
		char ch = character.charAt(0);
		int i = str.length();
		char[] array = new char[i];
		array[0] = str.charAt(0);
		// Fill char array with input characters 
		for (int j = 1; j <= i - 1; j++) {
			array[j] = str.charAt(j); 
		}
		int output = count(array, ch); // invoke method , store output as variable
		// Display output
		System.out.println("The character " + character + " appears " + output + " times in the list of characters" + str);

	}
	// Recursive method to count occurrences of a character in a character array
	public static int count(char[] chars, char ch) {
		if(chars.length < 1) {
			return 0;
		}
		if(chars[0] == ch) {	// if 1st char is user selected char, make new array from remaining values - chars[0]
			char[] chars1 = new char[chars.length - 1];
			chars1 = Arrays.copyOfRange(chars, 1, chars.length);
			return 1 + count(chars1, ch); // add 1 to return value for char[0] being user selected character
		} else { // if 1st char is not user selected char, make new array from remaining values - chars[0]
			char[] chars1 = new char[chars.length - 1];
			chars1 = Arrays.copyOfRange(chars, 1, chars.length);
			return count(chars1, ch);
		}
	}
	// Helper method to add High index 
	public static int count(char[] chars, char ch, int high){
		if(chars.length == 0 || chars.length == high) {
			return high;
		}
		if(chars[0] == ch) {
			char[] chars1 = new char[chars.length - 1];
			chars1 = Arrays.copyOfRange(chars, 1, chars.length);
			return count(chars1, ch, high);
		} else {
			char[] chars1 = new char[chars.length - 1];
			chars1 = Arrays.copyOfRange(chars, 1, chars.length);
			return count(chars1, ch, high);
		}
	}
}
