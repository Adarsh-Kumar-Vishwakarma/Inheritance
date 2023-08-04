package Adarsh; // Package declaration

import java.util.Scanner; // Importing the Scanner class

public class Main_operation { // Main class definition
    Scanner sc = new Scanner(System.in); // Creating a Scanner object to read user input

    public static void main(String[] args) { // Main method
        Main_operation obj0 = new Main_operation(); // Creating an object of Main_operation class
        obj0.displayOperation(); // Calling the displayOperation method
    }

    public void displayOperation() { // Method to display and perform operations
        Palindrome obj = new Palindrome(); // Creating an object of Palindrome class

        do {
            System.out.println(); // Empty line for formatting
            System.out.println("\t1.Array Programs (Greater, Smaller, Ascending, Descending)"); // Displaying options
            System.out.println("\t2.Palindrome"); // Displaying options
            System.out.println("\t3.Swapping Number"); // Displaying options

            System.out.println("\nSelect The Number To Perform Operation : \n"); // Prompting user for input
            obj.choice = sc.nextInt(); // Reading the user's choice

            switch (obj.choice) { // Switch case based on user's choice
                case 1:
                    System.out.println("\nFind The Greatest Number In A Given Array \n"); // Displaying message
                    obj.Greater(); // Calling the Greater method to find the greatest number
                    System.out.println("\n------------xxxxxxxx-----xxxxxxxx------------"); // Separator line

                    System.out.println("\nFind The Smallest Number In A Given Array \n"); // Displaying message
                    obj.Smaller(); // Calling the Smaller method to find the smallest number
                    System.out.println("\n------------xxxxxxxx-----xxxxxxxx------------"); // Separator line

                    System.out.println("\nFind The Ascending Number In A Given Array \n"); // Displaying message
                    obj.Ascending(); // Calling the Ascending method to sort the array in ascending order
                    System.out.println("\n------------xxxxxxxx-----xxxxxxxx------------"); // Separator line

                    System.out.println("\nFind The Descending Number In A Given Array \n"); // Displaying message
                    obj.Descending(); // Calling the Descending method to sort the array in descending order
                    System.out.println("\n------------xxxxxxxx-----xxxxxxxx------------"); // Separator line

                    break;

                case 2:
                    System.out.println("\nFind The Given Number Is Palindrome or Not \n"); // Displaying message
                    obj.palindrome(); // Calling the palindrome method to check if a number is palindrome
                    System.out.println("\n------------xxxxxxxx-----xxxxxxxx------------"); // Separator line

                    break;

                case 3:
                    Swapping_programs obj1 = new Swapping_programs(); // Creating an object of Swapping_programs class
                    System.out.println("\nSwapping Numbers Without Third Variable \n"); // Displaying message
                    obj1.swapping(); // Calling the swapping method to swap numbers without a third variable
                    System.out.println("\n------------xxxxxxxx-----xxxxxxxx------------"); // Separator line

                    System.out.println("\nSwapping Numbers Using Third Variable \n"); // Displaying message
                    obj1.swapping_var(); // Calling the swapping_var method to swap numbers using a third variable
                    System.out.println("\n------------xxxxxxxx-----xxxxxxxx------------"); // Separator line

                    break;

                default:
                    System.out.println(); // Empty line for formatting
                    System.out.println("Invalid Choice Please Order Again"); // Displaying an error message for invalid input
                    System.out.println();
                    displayOperation(); // Recursively calling the displayOperation method to ask for input again
                    break;
            }

            System.out.println(); // Empty line for formatting
            System.out.print("You Want Perform Again (Y/N) : \n"); // Asking the user if they want to perform again
            obj.again = sc.next(); // Reading the user's response

        } while (obj.again.equalsIgnoreCase("Y")); // Continue the loop if the user wants to perform again

        System.out.println("\n------------xxxxxxxx------------- Your Process Is Completed ------------xxxxxxxx-------------"); // Completion message
    }
}
