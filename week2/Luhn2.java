public class Luhn2 {
public static void main(String[] args) {
int num = 2315778;
System.out.println("CC number: " + num + " is " + checkDigits(num));
num = 1234567;
System.out.println("CC number: " + num + " is " + checkDigits(num));
num = 7654321;
System.out.println("CC number: " + num + " is " + checkDigits(num));
num = 1111111;
System.out.println("CC number: " + num + " is " + checkDigits(num));
}
    
    /**
     * Validates a 7-digit credit card number using the Luhn algorithm.
     * Starting from the check digit (rightmost), it decodes each digit based on position
     * and checks if the sum of all decoded digits is divisible by 10.
     *
     * @param number the 7-digit credit card number to validate
     * @return "valid" if the number passes the test, "invalid" otherwise
     */
    public static String checkDigits(int number) {
        int sum = 0;
        int position = 1; // Start from check digit (position 1)
        
        // Process each digit from right to left
        while (number > 0) {
            int digit = number % 10; // Get the rightmost digit
            boolean isEvenPosition = (position % 2 == 0);
            
            // Decode the digit and add to sum
            sum += decode(digit, isEvenPosition);
            
            number = number / 10; // Remove the rightmost digit
            position++;
        }
        
        // Check if sum is divisible by 10
        if (sum % 10 == 0) {
            return "valid";
        } else {
            return "invalid";
        }
    }
    
    /**
     * Decodes a digit based on its position in a credit card number.
     * For odd positions: returns the digit unchanged.
     * For even positions: doubles the digit, and if the result is two digits,
     * adds those digits together.
     *
     * @param digit the digit to decode (0-9)
     * @param position true if even position, false if odd position
     * @return the decoded digit
     */
    public static int decode(int digit, boolean position) {
        // If it's an odd position, return the digit unchanged
        if (!position) {
            return digit;
        }
        
        // If it's an even position, double the digit
        int doubled = digit * 2;
        
        // If the result is a single digit (0-9), return it
        if (doubled < 10) {
            return doubled;
        }
        
        // If the result is two digits, add them together
        // For example: 16 becomes 1 + 6 = 7
        return (doubled / 10) + (doubled % 10);
    }
}
