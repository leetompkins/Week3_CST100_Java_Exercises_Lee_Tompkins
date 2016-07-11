/* Check password application, checks if password is at least 8 characters long
 * password has no special character, and has at least 2 digits 
 * Author Lee Tompkins 
 * File CheckPassword.java
 * Date Jul 8 2016
 */


import java.util.Scanner;
public class CheckPassword {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter in a password, must have at least 8 characters, only letters and digits, and at least two digits");
		String password = input.nextLine();
		if(PasswordTestMethod.isValid(password)) { //Display valid or invalid password
			System.out.println("That is a valid password");
		} else {
			System.out.println("That is not a valid password");
		}

	}

}

class PasswordTestMethod {
	public static boolean isValid(String password) {
		// Declare & Initialize variables , and set booleans 
		boolean length = false;
		boolean letter = false;
		boolean digit = false;
		boolean special = true;
		boolean twoDigits = false;
		boolean valid = false;
		int a = 0;
		int j = 0;
		int y = 0;
		for (int i = 0; i < password.length(); i++) { // loop through characters in password to check if valid parameters are met
			
			char x = password.charAt(i);
			if (Character.isLetter(x)) {
				a++;
					if (a >= 1) {
						letter = true; // if there are more than 1 letters, letters is true
					}
			}
			if (Character.isDigit(x)) {
				j++;
					if (j >= 1) {
						twoDigits = true;
						digit = true; // if there are more than two digits, digits and two digits is true
					}
			}
			if (!Character.isDigit(x) && !Character.isLetter(x)) {
				y++;
					if (y >= 1) {
						special = false; // if there are not special characters, special is false 
					}
			}
			if (password.length() >= 8) {
				length = true; // if password length is greater or equal to 8 then true 
			}
			if (length && digit && letter && special && twoDigits) {
				valid = true; // if all parameters are met, password is valid 
			}
		}
		return valid; // return password is valid 
	}
}