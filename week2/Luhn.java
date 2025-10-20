public class Luhn {
    public static void main(String[] args) {
        boolean even = false;
        System.out.println("Testing decode method with odd positions (even = false):");
        System.out.println(decode(1, even));
        System.out.println(decode(2, even));
        System.out.println(decode(3, even));
        System.out.println(decode(4, even));
        System.out.println(decode(5, even));
        System.out.println(decode(6, even));
        System.out.println(decode(7, even));
        System.out.println(decode(8, even));
        System.out.println(decode(9, even));
        
        even = !even;
        System.out.println("\nTesting decode method with even positions (even = true):");
        System.out.println(decode(1, even));
        System.out.println(decode(2, even));
        System.out.println(decode(3, even));
        System.out.println(decode(4, even));
        System.out.println(decode(5, even));
        System.out.println(decode(6, even));
        System.out.println(decode(7, even));
        System.out.println(decode(8, even));
        System.out.println(decode(9, even));
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
