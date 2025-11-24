import java.util.Scanner;

/**
 * Exercise 5: Robust input validation with looping.
 * This program repeatedly prompts the user to enter an integer until
 * valid input is provided. It demonstrates error handling with loops.
 */
public class LoopUntilInt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value = 0;
        boolean validInput = false;
        
        // Keep looping until we get a valid integer
        while (!validInput) {
            System.out.print("Please enter an integer: ");
            
            if (scanner.hasNextInt()) {
                value = scanner.nextInt();
                validInput = true;
            } else {
                // Clear the invalid input
                String invalidInput = scanner.next();
                System.out.println("Invalid input: '" + invalidInput + "' is not an integer. Try again.");
            }
        }
        
        scanner.close();
        System.out.println("You entered: " + value);
    }
}

