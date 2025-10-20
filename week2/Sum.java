public class Sum {
    public static void main(String[] args) {
        int x = 2;
        int y = 3;
        System.out.println("x: " + x + " y: " + y + " Sum: " + sum(x, y));
        System.out.println("After calling sum method:");
        System.out.println("x: " + x + " y: " + y);
    }
    
    /**
     * Computes the sum of two arguments.
     * Note: This method violates good design principles by modifying parameters.
     *
     * @param a an int operand to be added
     * @param b another int operand
     * @return the sum of a and b
     */
    public static int sum(int a, int b) {
        a = 5;
        b = 6;
        return a + b;
    }
}
