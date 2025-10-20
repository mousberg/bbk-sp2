/**
 * Software and Programming II (SP2) — Lab sheet 3
 * Question 1: Arrays and ArrayLists
 * 
 * This class demonstrates various operations on arrays including:
 * - Creating arrays with initializer lists
 * - Accessing array elements
 * - Printing arrays with different loop types
 * - Printing arrays in reverse order
 */
public class Arrays {
    public static void main(String[] args) {
        // (a) Create an array x of doubles with an initializer list
        double[] x = {8, 4, 5, 21, 7, 9, 18, 2, 100};
        
        // (b) Print the number of items in the array
        System.out.println("Length of x : " + x.length);
        
        // (c) Print the first array item
        System.out.println("x[0] : " + x[0]);
        
        // (d) Print the last array item
        System.out.println("x[8] : " + x[8]);
        
        // (e) Print the expression x[x.length - 1]
        System.out.println("x[x.length - 1] : " + x[x.length - 1]);
        
        // (f) Use a standard for loop to print all values without labels
        System.out.println("\nAll values without labels:");
        for (int i = 0; i < x.length; i++) {
            System.out.println(x[i]);
        }
        
        // (g) Use a standard for loop to print all values with labels
        System.out.println("\nAll values with labels:");
        for (int i = 0; i < x.length; i++) {
            System.out.println("x[" + i + "] : " + x[i]);
        }
        
        // (h) Use a standard for loop to print all values in reverse order with labels
        System.out.println("\nAll values in reverse order with labels:");
        for (int i = x.length - 1; i >= 0; i--) {
            System.out.println("x[" + i + "] : " + x[i]);
        }
        
        // (i) Use an enhanced for loop to print all values without labels
        System.out.println("\nAll values using enhanced for loop:");
        for (double value : x) {
            System.out.println(value);
        }
    }
}
