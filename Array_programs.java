package Adarsh; // Package declaration


//Array_programs class extends All_variable class and contains methods for array manipulation.
public class Array_programs extends All_variable {

	
	
	// Method to find the greatest number in the array.
	public void Greater() {
		accept();//This function is called from the superclass "All_variable.".
		// Initialize 'a' with the value of the first element in the array (arr[0]).
		a = arr[0];

		// Loop through the array to find the maximum element.
		for (i = 0; i < n; i++) {
		    // Compare the current element (arr[i]) with the current maximum 'a'.
		    if (a < arr[i]) {
		        // If the current element is greater than 'a', update 'a' with the current element.
		        a = arr[i];
		    }
		}

		System.out.println("\nThe Greatest number is : " + a);// Printing the greatest numbers.
	}
	
	

	// Method to find the smallest number in the array.
	public void Smaller() {
		accept();//This function is called from the superclass "All_variable.".
		// Initialize 'b' with the value of the first element in the array (arr[0]).
		b = arr[0];

		// Loop through the array to find the maximum element.
		for (i = 0; i < n; i++) {
		    // Compare the current element (arr[i]) with the current maximum 'b'.
		    if (b > arr[i]) {
		        // If the current element is smallest than 'b', update 'b' with the current element.
		        b = arr[i];
		    }
		}
		System.out.println("\nThe Smallest number is : " + b);// Printing the smallest numbers.
	}

	
	
	// Method to sort the array in ascending order.
	public void Ascending() {
		// Accept input for the array elements.
		accept();//This function is called from the superclass "All_variable.".

		// Sorting the array in ascending order using a simple Sort algorithm.
		for (i = 0; i < n; i++) {
		    for (j = i + 1; j < n; j++) {
		        // Compare two elements in the array (arr[i] and arr[j]).
		        // If the element at index i (arr[i]) is greater than the element at index j (arr[j]).
		        // then call the 'Asc_Des()' function from the superclass "All_variable.".
		        if (arr[i] > arr[j]) {
		            Asc_Des(); // This function is called from the superclass "All_variable.".
		        }
		    }
		}

		// Printing the sorted array in ascending order.
		System.out.println("\nThe Ascending numbers are :-");
		for (i = 0; i < n; i++) {
		    System.out.println(arr[i]); // Printing the numbers in ascending order.
		}

	}
	
	

	// Method to sort the array in descending order.
	public void Descending() {
		// Accept input for the array elements. 
		accept();//This function is called from the superclass "All_variable.".
		
		// Sorting the array in descending order using a simple Sort algorithm.
		for (i = 0; i < n; i++) {
			for (j = i + 1; j < n; j++) {
				// Compare two elements in the array (arr[i] and arr[j]).
		        // If the element at index i (arr[i]) is smaller than the element at index j (arr[j]).
		        // then call the 'Asc_Des()' function from the superclass "All_variable.".
				if (arr[i] < arr[j]) {
					Asc_Des();// This function is called from the superclass "All_variable.".
				}
			}
		}
		
		// Printing the sorted array in descending order.
		System.out.println("\nThe Descending numbers are :-");
		for (i = 0; i < n; i++) {
			System.out.println(arr[i]);// Printing the numbers in descending order:.
		}
	}
}