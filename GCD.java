
//The Test Class For the GCD Class 
//Author Lee Tompkins
//Date Jul 6 2016
//File GCD.java
/* Summary
 * A program that requests the user input 2 sets of lat and long coordinates, then displays the 
 * distance between the two points in Kilometeres 
 */



import java.util.Scanner; // importing scanner 

public class TestGCD { // Test class for the GCD method
	public static void main(String[] args) {
		
		GCD gcd1 = new GCD(); // constructing gcd method 
		
		Scanner input = new Scanner(System.in); // Constructing new scanner for console input 
		System.out.println("Two coordiantes will be entered to find the distance apart on a sphere with a radius equal to 6371.01km");
		System.out.print("What is the first lat and long corrdinate? Seperate coords with a space");
			// Setting user input variables 
			double x1 = input.nextDouble();
			double y1 = input.nextDouble();
		System.out.print("What is the Second lat and long corrdinate? Seperate coords with a space");
		// Setting user input variables
			double x2 = input.nextDouble();
			double y2 = input.nextDouble();
		// Displaying answer by onvoking gcd1 method from gcd class 
		System.out.println("The distance between the two points is " + gcd1.getGCD(x1, y1, x2, y2) + "km");
	}	
}









public class GCD {   // The Great Circle Distance Class
	
	
	public double getGCD(double x1, double y1, double x2, double y2){
		double earthRadius = 6371.01; // Declaring sphere radius
		double lat1 = Math.toRadians(x1); // Converting degree lat and longs to radians
		double lat2 = Math.toRadians(y1);
		double lat3 = Math.toRadians(x2);
		double lat4 = Math.toRadians(y2);
		/* Use Formula d = radius * arccos(sin(x1) * sin(x2) + cos(x1) * cos(x2) * cos(y1 - y2))
		 * Where d = distance from pointA to pointB on the sphere 
		 */
		return earthRadius * (Math.acos(Math.sin(lat1) * Math.sin(lat2) + Math.cos(lat1) * Math.cos(lat2) * Math.cos(lat3 - lat4)));
	}
	
	
	
	
	
	
}





