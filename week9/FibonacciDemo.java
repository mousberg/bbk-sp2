/**
 * Demo program to test the Fibonacci implementation manually.
 * This can be run without JUnit to verify the basic functionality.
 */
public class FibonacciDemo {
    public static void main(String[] args) {
        System.out.println("=== Fibonacci Number Calculator Demo ===\n");
        
        // Test base cases
        System.out.println("Base cases:");
        System.out.println("fib(0) = " + Fibonacci.fib(0) + " (expected: 0)");
        System.out.println("fib(1) = " + Fibonacci.fib(1) + " (expected: 1)");
        System.out.println();
        
        // Test small values
        System.out.println("Small values:");
        System.out.println("fib(2) = " + Fibonacci.fib(2) + " (expected: 1)");
        System.out.println("fib(5) = " + Fibonacci.fib(5) + " (expected: 5)");
        System.out.println("fib(10) = " + Fibonacci.fib(10) + " (expected: 55)");
        System.out.println("fib(15) = " + Fibonacci.fib(15) + " (expected: 610)");
        System.out.println("fib(20) = " + Fibonacci.fib(20) + " (expected: 6765)");
        System.out.println();
        
        // Test larger value (this might take a few seconds)
        System.out.println("Larger value (may take a few seconds):");
        long start = System.currentTimeMillis();
        long result = Fibonacci.fib(30);
        long elapsed = System.currentTimeMillis() - start;
        System.out.println("fib(30) = " + result + " (expected: 832040)");
        System.out.println("Time taken: " + elapsed + " ms");
        System.out.println();
        
        // Test exception handling
        System.out.println("Testing exception handling:");
        try {
            Fibonacci.fib(-1);
            System.out.println("ERROR: Should have thrown IllegalArgumentException!");
        } catch (IllegalArgumentException e) {
            System.out.println("✓ Correctly threw exception: " + e.getMessage());
        }
        System.out.println();
        
        // Note about fib(46)
        System.out.println("Note: fib(46) = 1836311903 (but takes 30+ seconds to compute)");
        System.out.println("Run the JUnit tests to test this with proper timeout handling.");
    }
}

