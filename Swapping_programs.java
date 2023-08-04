package Adarsh; // Package declaration


//Swapping_programs class extends All_variable class and contains methods for manipulation.
public class Swapping_programs extends All_variable {
	
	// Method to perform swapping using arithmetic operations and without using a temporary variable.
	public void swapping() 
	{
	    swapping_no(); // Call the method to get input numbers from the superclass "All_variable.".
	    
	    // Display the numbers before swapping.
	    System.out.println("\nBefore swapping numbers: " + a + "  " + b + "\n");
	    
	    
	    // To swap two variables a and b without using a temporary variable,
	    // we use the arithmetic operations of addition and subtraction.
	    
	    // 1. Add 'a' and 'b' and store the result in 'a'.
	    a = a + b;  
	    
	    // 2. Subtract 'b' from 'a' and store the result in 'b'.
	    b = a - b;  
	    
	    // 3. Subtract 'b' from the updated 'a' to get the original 'b' value.
	    a = a - b;  
	    
	    // Now, 'a' will have the value of the original 'b', and 'b' will have the value of the original 'a'.
	    
	    /* Another Method of swapping number without third variable.
	     a = a * b;
	     a = a / b;
	     a = a / b;
	     
	     a = a ^ b;
	     a = a ^ b;
	     a = a ^ b;
	     */
	    
	    // Display the numbers after swapping.
	    System.out.println("\nAfter swapping numbers:  " + a + "  " + b + "\n");
	}

	
	// Method to perform swapping using arithmetic operations and using a temporary variable.
	public void swapping_var() 
	{
	    swapping_no(); // Call the method to get input numbers from the superclass "All_variable.".
	    
	    // Display the numbers before swapping.
	    System.out.println("\nBefore swapping numbers: " + a + "  " + b + "\n");
	    
	    // Perform swapping using a temporary variable,
	    // To swap two variables a and b using a temporary variable 'temp'.
	    
	    
	    // we first store the value of 'a' in 'temp'.
	    int temp = a;
	    
	    //then assign the value of 'b' to 'a'.
	    a = b;
	    
	    // and finally, assign the value of 'temp' (which holds the original value of 'a') to 'b'.
	    b = temp;
	    
	    // Display the numbers after swapping.
	    System.out.println("\nAfter swapping numbers:  " + a + "  " + b + "\n");
	}
}
