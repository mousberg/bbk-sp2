import java.util.Scanner;

/**
 * Exercise 6: Command line argument processing.
 * This program processes command line arguments that are a mixture of
 * integers and doubles, identifying and printing each number with its type.
 * 
 * Test cases:
 * 1) java ArgumentProcessor 1 2 3 4 5
 * 2) java ArgumentProcessor 1.1 2.2 3.3 4.4
 * 3) java ArgumentProcessor 1 2.9 3 4.9 5 6.9
 */
public class ArgumentProcessor {
    public static void main(String[] args) {
        // Check if arguments were provided
        if (args.length == 0) {
            System.out.println("No arguments provided.");
            System.out.println("Usage: java ArgumentProcessor <number1> <number2> ...");
            return;
        }
        
        // Concatenate all arguments into a single string with spaces
        StringBuilder combined = new StringBuilder();
        for (int i = 0; i < args.length; i++) {
            combined.append(args[i]);
            if (i < args.length - 1) {
                combined.append(" ");
            }
        }
        
        System.out.println("Processing arguments: " + combined.toString());
        System.out.println();
        
        // Scan the concatenated string and process each number
        Scanner scanner = new Scanner(combined.toString());
        
        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                // It's an integer
                int intValue = scanner.nextInt();
                System.out.println(intValue + " is an int");
            } else if (scanner.hasNextDouble()) {
                // It's a double
                double doubleValue = scanner.nextDouble();
                System.out.println(doubleValue + " is a double");
            } else {
                // Not a number - skip it
                String token = scanner.next();
                System.out.println("Skipping non-numeric token: " + token);
            }
        }
        
        scanner.close();
    }
}

