package Adarsh; // Package declaration


//Palindrome class extends Array_programs class and contains methods for manipulation.
public class Palindrome extends Array_programs {
	
	
	 // This method checks if the given number is a palindrome.
    public void palindrome() {
       
        palin_drome(); // Calling the function through base class "Array_programs".
        
     // Reversing the number using a while loop.
        while (n > 0) {
        	
            // Extracting the last digit of the number.
            a = n % 10;
            // Building the reversed number by adding the last digit.
            rev = rev * 10 + a;
            // Removing the last digit from the original number.
            n = n / 10;
        }


        // Checking if the reversed number is equal to the original number.
        if (rev == temp) {
            System.out.println("\nThe Given Number is Palindrome");// display the number if palindrome.
        } else {
            System.out.println("\nThe Given Number is Not a Palindrome");// display the number if not a palindrome.
        }
    }
}
