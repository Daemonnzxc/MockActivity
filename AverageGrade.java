import java.util.Scanner;

public class AverageGrade{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of grades: ");
        int numGrades = scanner.nextInt();
        
        // Check if the input is valid
        if (numGrades <= 0) {
            System.out.println("Please enter a positive number of grades.");
        } else {
            double sum = 0;
            
            // Loop to collect grades from the user
            for (int i = 1; i <= numGrades; i++) {
                System.out.print("Enter grade " + i + ": ");
                double grade = scanner.nextDouble();
                sum += grade;
            }
            
            // Calculate and display the average grade
            double average = sum / numGrades;
            System.out.printf("The average grade is: %.2f\n", average);
        }
        
        scanner.close();
    }
}
