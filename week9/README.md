# Week 9: JUnit Testing

This folder contains solutions to Lab Sheet 9 exercises focusing on JUnit 5 (Jupiter) unit testing.

## Exercises

### Exercise 1: Fibonacci JUnit Test Suite

**Topic:** JUnit 5 testing with comprehensive test coverage

This exercise demonstrates writing a complete JUnit test suite for a Fibonacci number calculator, including:
- Testing normal cases (base cases and recursive cases)
- Testing exception handling (IllegalArgumentException)
- Testing with timeouts (assertTimeout vs assertTimeoutPreemptively)
- Achieving full code coverage

## Files

### Fibonacci.java
A simple recursive implementation to compute the nth Fibonacci number.

**Implementation details:**
- `fib(0) = 0`
- `fib(1) = 1`
- `fib(n) = fib(n-1) + fib(n-2)` for n >= 2
- Throws `IllegalArgumentException` for negative input

**Note:** This is a straightforward recursive implementation (not optimized) that serves as a good example for testing, including performance testing with timeouts.

### FibonacciTest.java
Comprehensive JUnit 5 test suite with the following test cases:

#### Exception Testing
- `testNegativeInput()`: Tests that negative values throw IllegalArgumentException
- `testMultipleNegativeInputs()`: Tests multiple negative values

#### Base Cases
- `testFibZero()`: Tests fib(0) = 0
- `testFibOne()`: Tests fib(1) = 1

#### Recursive Cases
- `testFibTwo()`: Tests fib(2) = 1
- `testFibFive()`: Tests fib(5) = 5
- `testFibTen()`: Tests fib(10) = 55
- `testFibFifteen()`: Tests fib(15) = 610
- `testFibTwenty()`: Tests fib(20) = 6765

#### Timeout Testing (fib(46) = 1836311903)
- `testFib46WithLongTimeout()`: Tests fib(46) with 600s timeout using `assertTimeout`
- `testFib46WithShortTimeout()`: Tests fib(46) with 1s timeout using `assertTimeout`
- `testFib46WithLongTimeoutPreemptive()`: Tests fib(46) with 600s timeout using `assertTimeoutPreemptively`
- `testFib46WithShortTimeoutPreemptive()`: Tests fib(46) with 1s timeout using `assertTimeoutPreemptively`

## Key Concepts

### assertTimeout vs assertTimeoutPreemptively

**assertTimeout:**
- Waits for the test to complete, even if it exceeds the timeout
- Reports the timeout failure after execution finishes
- The test continues running in the same thread
- Better for most scenarios as it allows cleanup code to run

**assertTimeoutPreemptively:**
- Aborts execution immediately when timeout is exceeded
- Runs the test in a separate thread
- Terminates the thread abruptly when timeout occurs
- Use with caution - may not allow cleanup code to execute

### Difference in Behavior with 1 Second Timeout

For `fib(46)` with 1 second timeout:

**With assertTimeout:**
- The computation continues for ~30+ seconds (depending on machine)
- After completion, JUnit reports the timeout failure
- You see the actual execution time in the failure message
- Test thread remains active throughout

**With assertTimeoutPreemptively:**
- The computation is aborted after exactly 1 second
- The separate thread is terminated immediately
- Test fails faster (at 1 second mark)
- More aggressive but doesn't wait for completion

## Running the Tests

### Prerequisites
You need JUnit 5 (Jupiter) in your classpath. You can:

**Option 1: Using JUnit standalone JARs**
```bash
# Download JUnit 5 JARs
# junit-jupiter-api-5.x.x.jar
# junit-jupiter-engine-5.x.x.jar
# junit-platform-console-standalone-1.x.x.jar
```

**Option 2: Using Maven**
Add to `pom.xml`:
```xml
<dependency>
    <groupId>org.junit.jupiter</groupId>
    <artifactId>junit-jupiter</artifactId>
    <version>5.10.0</version>
    <scope>test</scope>
</dependency>
```

**Option 3: Using Gradle**
Add to `build.gradle`:
```gradle
testImplementation 'org.junit.jupiter:junit-jupiter:5.10.0'
```

### Compiling and Running

**Compile the Fibonacci class:**
```bash
javac Fibonacci.java
```

**Compile the test class (with JUnit in classpath):**
```bash
javac -cp .:junit-jupiter-api-5.x.x.jar FibonacciTest.java
```

**Run tests using JUnit console launcher:**
```bash
java -jar junit-platform-console-standalone-1.x.x.jar \
  --class-path . \
  --scan-class-path
```

**Or run with Maven:**
```bash
mvn test
```

**Or run with Gradle:**
```bash
./gradlew test
```

### Expected Test Results

✅ **Passing tests (fast):**
- All base case tests (fib(0), fib(1))
- Small recursive cases (fib(2), fib(5), fib(10), fib(15), fib(20))
- Exception tests
- fib(46) with 600s timeout (both assertTimeout and assertTimeoutPreemptively)

❌ **Likely failing tests (unless you have a very fast machine):**
- fib(46) with 1s timeout using assertTimeout (completes but exceeds timeout)
- fib(46) with 1s timeout using assertTimeoutPreemptively (aborted at 1s)

## Test Coverage Analysis

The test suite achieves **100% code coverage** of the `fib()` method:

1. ✅ Line testing `if (n < 0)` - covered by `testNegativeInput()`
2. ✅ Line throwing exception - covered by `testNegativeInput()`
3. ✅ Line testing `if (n == 0)` - covered by `testFibZero()`
4. ✅ Line returning 0 - covered by `testFibZero()`
5. ✅ Line testing `if (n == 1)` - covered by `testFibOne()`
6. ✅ Line returning 1 - covered by `testFibOne()`
7. ✅ Line with recursive call - covered by all recursive test cases

## Performance Notes

The recursive Fibonacci implementation has exponential time complexity O(2^n):
- fib(20) takes milliseconds
- fib(30) takes seconds
- fib(40) takes tens of seconds
- fib(46) takes 30+ seconds on most machines

This makes it perfect for demonstrating timeout testing in JUnit!

## Best Practices Demonstrated

1. **Descriptive test names:** Using `@DisplayName` for clear test descriptions
2. **Comprehensive coverage:** Testing all code paths
3. **Exception testing:** Using `assertThrows` to verify error conditions
4. **Edge cases:** Testing boundary conditions (0, 1, negative)
5. **Performance testing:** Using timeout assertions for performance requirements
6. **Meaningful assertions:** Including descriptive failure messages
7. **Organized structure:** Grouping related tests logically

## Additional Notes

- The recursive implementation is intentionally inefficient for educational purposes
- A memoized or iterative version would be much faster for large n
- Timeout tests are hardware-dependent - results may vary
- JUnit 5 provides much better timeout testing than JUnit 4

