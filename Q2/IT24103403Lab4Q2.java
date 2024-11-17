// Import the Scanner class for taking user input
import java.util.Scanner;

// Declare the class with the filename as the class name
public class IT24103403Lab4Q2 {

    // Main method
    public static void main(String[] args) {

        // Declare variables to store input and calculated values
        float ExamMark, LabMark, FinalMark, PercentageExam, PercentageLab;

        // Create a Scanner object
        Scanner mark = new Scanner(System.in);

        // Display to enter Exam mark
        System.out.println("Please enter exam marks (out of 100): ");
        ExamMark = mark.nextFloat();

        // Validate Exam mark
        if (ExamMark < 0 || ExamMark > 100) {
            System.out.println("Invalid input for exam marks. Terminating program.");
            mark.close();
            return;
        }

        // Display to enter Lab Exam mark
        System.out.println("Please enter lab submission marks (out of 100): ");
        LabMark = mark.nextFloat();

        // Validate Lab Exam mark
        if (LabMark < 0 || LabMark > 100) {
            System.out.println("Invalid input for lab submission marks. Terminating program.");
            mark.close();
            return;
        }

        // Display to enter percentage weight of Exam mark
        System.out.println("Enter percentage given for the exam : ");
        PercentageExam = mark.nextFloat();

        // Display to enter percentage weight of Lab Exam mark
        System.out.println("Enter percentage give for the lab submission : ");
        PercentageLab = mark.nextFloat();

        // Validate that the percentages equals to 100
        if (PercentageExam + PercentageLab != 100) {
            System.out.println("The percentages must add up to 100. Terminating program.");
            mark.close();
            return;
        }

        // Calculate the final mark
        FinalMark = (ExamMark * PercentageExam / 100) + (LabMark * PercentageLab / 100);

        // Output the final exam mark
        System.out.println("Final Exam mark is: " + FinalMark);

        // Close the Scanner
        mark.close();
    }
}
