/* Week3 Chapter6 Exercise 6.5 
 * Write method with the header, public static void displaySortedNumbers(double num1, double num2, double num3)
 * Test program that prompts user to enter in three numbers and display them in increasing order 
 * File SortNumbers.java
 * Author Lee Tompkins
 * Date Jul 8 2016
 */
import java.util.Scanner;
import java.util.Arrays;
public class SortNumbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter in three numbers and they will be sorted in increasing order");
			int a = input.nextInt();	// Set user variables
			int b = input.nextInt();
			int c = input.nextInt();
		SortNumberMethods.displaySortedNumbers(a, b, c); // invoke sorting method from SortNumberMethods class with parameters as user input

	}

}

class SortNumberMethods {
	public static void displaySortedNumbers(double num1, double num2, double num3) {
		double[] array; // declare array
		array = new double[3]; // set array size
			array[0] = num1;	// Set values in array 
			array[1] = num2;
			array[2] = num3;
		Arrays.sort(array);		// Sort values in array 
		System.out.print(Arrays.toString(array)); // display values in order in array
	
	}
}