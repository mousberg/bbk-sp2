import java.util.Scanner;

/**
 * Exercise 3: Input validation with IllegalArgumentException.
 * This program prompts the user to enter an integer and throws an exception
 * if the input is not a valid integer.
 */
public class Throwing {
    public static void main(String[] args) {
        try {
            int x = getInt();
            System.out.println(x);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    /**
     * Prompts the user to enter an integer and validates the input.
     * 
     * @return the integer entered by the user
     * @throws IllegalArgumentException if the input is not a valid integer
     */
    public static int getInt() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        
        if (scanner.hasNextInt()) {
            int value = scanner.nextInt();
            scanner.close();
            return value;
        } else {
            scanner.close();
            throw new IllegalArgumentException("Input is not a valid integer");
        }
    }
}

