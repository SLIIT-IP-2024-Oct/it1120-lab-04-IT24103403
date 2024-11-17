// Import the Scanner class for taking user input
import java.util.Scanner;

// Declare the class with the filename as the class name
public class IT24103403Lab4Q3 {

    // Main method
    public static void main(String[] args) {

        // Declare an integer variable to store the input number
        int number;

        // Create a Scanner object
        Scanner num = new Scanner(System.in);

        // Diaplay to enter number
        System.out.println("Enter number: ");

        // Read the input number from user
        number = num.nextInt();

		//using Ternary Operator

        // if the number is positive
        if (0 < number) {
            System.out.println("The number is: Positive"); 
        }
        //if the number is negative
        else if (number < 0) {
            System.out.println("The number is: Negative"); 
        }
        // If the number is neither positive nor negative, it must be zero
        else {
            System.out.println("The number is: The number is Zero"); 
        }

        // Close the Scanner
        num.close();
    }
}