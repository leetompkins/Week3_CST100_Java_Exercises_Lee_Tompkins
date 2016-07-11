/* Program that computes fibonacci numbers using iterations and not recursion
 * Program promts user to enter index and displays its Fibonacci number 
 * Week 3 Chapter 18 Exercise 18.2
 * Author Lee Tomkins 
 * File FibonacciNumbers.java
 * Date Jul 8 2016
 */
import java.util.Scanner;
public class FibonacciNumbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter in an index to display is respective Fibonacci Number");
		//Declare Variables 
		int n = input.nextInt();
		long f0 = 0;	// for fib(0)
		long f1 = 1;	// for fib(1)
		long currentFib = 0;
		long fn = 0;
		
		for(int i = 2; i <= n; i++) {
			currentFib = f0 + f1;
			f0 = f1;
			f1 = currentFib;
		}	// After loop, fn = currentFib)
		fn = currentFib;
		System.out.println("The fibonacci number at index " + n + " is " + fn);
	}

}
