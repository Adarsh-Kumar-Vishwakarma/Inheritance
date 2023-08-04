package Adarsh; // Package declaration

import java.util.Scanner; // Importing the Scanner class

public class All_variable { // Main class definition
	
	Scanner sc = new Scanner(System.in);// Creating a Scanner object to read user input
	String again = ""; // Variable to hold user input for repeat operation.
	int[] arr; // Array to store user input numbers.
	int i, j, a, b, n, // Variables for different operations.
	choice, // Variable to hold user's choice.
	temp = 0, // Temporary variable used in swapping.
	rev = 0; // Variable to store the reversed number.
	
	
	 
	public int[] accept() {
		
		// Method to accept an array from the user.
		System.out.println("Enter The Size Of an Array\n");
		n = sc.nextInt();// Accept the size of the array from the user.
		System.out.println("\nEnter The " + n + " Numbers\n");
		arr = new int[n]; // Initializing the array with the given size.
		for (i = 0; i < n; i++) {
			arr[i] = sc.nextInt(); // Accept each element of the array from the user.
		}
		return arr;// Return the filled array.
	}
	
	public void Asc_Des() {
		
		// Method to sort the array in ascending or descending order.
		// Swapping elements in the array using a temporary variable.
		// Store the value of arr[i] in a temporary variable temp.
		temp = arr[i];

		// Assign the value of arr[j] to arr[i].
		arr[i] = arr[j];

		// Assign the value of the temporary variable (stored earlier) to arr[j].
		arr[j] = temp;

	}
	
	public void palin_drome() {
		
		// Method to check if the given number is a palindrome.
		System.out.println("Enter The Number\n");
		n = sc.nextInt(); // Accepting the number from the user.
		temp = n; // Storing the number in a temporary variable.
		// Rest of the logic to check for palindrome is in palindrome class.
	}
	
	public void swapping_no() {
		
		// Method to swap two numbers.
		System.out.println("Enter Two Numbers For Swapping\n");
		a = sc.nextInt(); // Accepting the first number from the user.
		b = sc.nextInt(); // Accepting the second number from the user.
		// Rest of the logic to perform swapping is in swapping_program class.
	}
}
