import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of terms for the Fibonacci sequence: ");
        int n = scanner.nextInt();
        
        // Check if the input is valid
        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            System.out.println("Fibonacci sequence up to " + n + " terms:");
            int firstTerm = 0, secondTerm = 1;3
            for (int i = 1; i <= n; ++i) {
                System.out.print(firstTerm + " ");
                
                // Compute the next term
                int nextTerm = firstTerm + secondTerm;
                firstTerm = secondTerm;
                secondTerm = nextTerm;
            }
        }
        
        scanner.close();
    }
}
