import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;
import static java.time.Duration.ofSeconds;

/**
 * JUnit 5 test suite for the Fibonacci class.
 * Tests cover all branches of the fib() method including:
 * - Negative input (exception case)
 * - Base cases (0 and 1)
 * - Recursive cases
 * - Performance tests with timeouts
 * 
 * Follows best practices from BBK SP2 JUnit guide:
 * - Descriptive method names
 * - One assertion per test (mostly)
 * - Clear assertion messages without repeating expected/actual values
 * - Tests for boundary cases and exceptions
 */
public class FibonacciTest {

    // ========== Exception Testing ==========
    
    @Test
    @DisplayName("fib() with negative input throws IllegalArgumentException")
    void fib_negativeInput_throwsIllegalArgumentException() {
        IllegalArgumentException exception = assertThrows(
            IllegalArgumentException.class,
            () -> Fibonacci.fib(-1),
            "calling fib with negative n"
        );
        assertTrue(exception.getMessage().contains("Illegal negative value"),
            "exception message should mention illegal negative value");
    }

    @Test
    @DisplayName("fib() with multiple negative values all throw exceptions")
    void fib_multipleNegativeInputs_allThrowExceptions() {
        assertThrows(IllegalArgumentException.class, 
            () -> Fibonacci.fib(-5), "fib(-5)");
        assertThrows(IllegalArgumentException.class, 
            () -> Fibonacci.fib(-100), "fib(-100)");
        assertThrows(IllegalArgumentException.class, 
            () -> Fibonacci.fib(-1000), "fib(-1000)");
    }

    // ========== Base Cases ==========
    
    @Test
    @DisplayName("fib(0) returns 0")
    void fib_baseCase_zero() {
        assertEquals(0, Fibonacci.fib(0), "base case n=0");
    }

    @Test
    @DisplayName("fib(1) returns 1")
    void fib_baseCase_one() {
        assertEquals(1, Fibonacci.fib(1), "base case n=1");
    }

    // ========== Recursive Cases - Small Values ==========
    
    @Test
    @DisplayName("fib(2) returns 1")
    void fib_recursiveCase_two() {
        assertEquals(1, Fibonacci.fib(2), "first recursive case n=2");
    }

    @Test
    @DisplayName("fib(5) returns 5")
    void fib_recursiveCase_five() {
        assertEquals(5, Fibonacci.fib(5), "small recursive case n=5");
    }

    @Test
    @DisplayName("fib(10) returns 55")
    void fib_recursiveCase_ten() {
        assertEquals(55, Fibonacci.fib(10), "recursive case n=10");
    }

    @Test
    @DisplayName("fib(15) returns 610")
    void fib_recursiveCase_fifteen() {
        assertEquals(610, Fibonacci.fib(15), "recursive case n=15");
    }

    @Test
    @DisplayName("fib(20) returns 6765")
    void fib_recursiveCase_twenty() {
        assertEquals(6765, Fibonacci.fib(20), "larger recursive case n=20");
    }

    // ========== Timeout Testing - assertTimeout ==========
    // assertTimeout: waits for completion even if timeout exceeded
    
    @Test
    @DisplayName("fib(46) completes within 600 seconds (assertTimeout)")
    void fib_largeValue_completesWithinLongTimeout() {
        assertTimeout(ofSeconds(600), () -> {
            assertEquals(1836311903L, Fibonacci.fib(46), 
                "computing fib(46)");
        });
    }

    @Test
    @DisplayName("fib(46) exceeds 1 second timeout (assertTimeout)")
    void fib_largeValue_exceedsShortTimeout() {
        // This test will likely fail on most machines
        // assertTimeout waits for completion, then reports timeout failure
        assertTimeout(ofSeconds(1), () -> {
            assertEquals(1836311903L, Fibonacci.fib(46), 
                "computing fib(46) within 1 second");
        });
    }

    // ========== Timeout Testing - assertTimeoutPreemptively ==========
    // assertTimeoutPreemptively: aborts execution when timeout exceeded
    
    @Test
    @DisplayName("fib(46) completes within 600 seconds (assertTimeoutPreemptively)")
    void fib_largeValue_completesWithinLongTimeoutPreemptive() {
        assertTimeoutPreemptively(ofSeconds(600), () -> {
            assertEquals(1836311903L, Fibonacci.fib(46), 
                "computing fib(46) preemptively");
        });
    }

    @Test
    @DisplayName("fib(46) aborted after 1 second (assertTimeoutPreemptively)")
    void fib_largeValue_abortedAfterShortTimeoutPreemptive() {
        // This test will fail quickly (at 1 second mark)
        // assertTimeoutPreemptively aborts execution immediately
        assertTimeoutPreemptively(ofSeconds(1), () -> {
            assertEquals(1836311903L, Fibonacci.fib(46), 
                "computing fib(46) with preemptive timeout");
        });
    }
}

