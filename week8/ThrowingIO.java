import java.util.Scanner;
import java.io.IOException;

/**
 * Exercise 4: Input validation with IOException.
 * This program is similar to Throwing.java but uses IOException instead of
 * IllegalArgumentException to demonstrate checked exceptions.
 */
public class ThrowingIO {
    public static void main(String[] args) {
        try {
            int x = getInt();
            System.out.println(x);
        } catch (IOException e) {
            System.out.println("IOException caught: " + e.getMessage());
        }
    }

    /**
     * Prompts the user to enter an integer and validates the input.
     * 
     * @return the integer entered by the user
     * @throws IOException if the input is not a valid integer
     */
    public static int getInt() throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        
        if (scanner.hasNextInt()) {
            int value = scanner.nextInt();
            scanner.close();
            return value;
        } else {
            scanner.close();
            throw new IOException("Input is not a valid integer");
        }
    }
}

