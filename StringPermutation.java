/* Week 3 Chapter 18 Exercise 18.25
 * Author Lee Tompkins
 * File StringPermutation.java
 * Date Jul 10 2016
 * Summary: A program that uses a recursive method to display all of the possible permutations of a string
 */
import java.util.Scanner; // import Scanner
public class StringPermutation {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); // create new scanner
		// prompt user for string 
		System.out.print("Enter in a string to see all possible permutations of that string");
		String str = input.nextLine(); // store user string as variable 
		String y = ""; // set empty string
		String str1 = permutation(y, str); // invoke method with specific arguments 
		System.out.println(str1); // display results from method 
	}

	public static String permutation(String y, String str) { // create permutation recursive method
	    int x = str.length(); // set base
	    if (x == 0) System.out.println(y);
	    else {
	        for (int i = 0; i < x; i++) // cycle through variations of string 
	            permutation(y + str.charAt(i), str.substring(0, i) + str.substring(i+1, x));
	    }
		return str; // return variations  
	}    
}
	
