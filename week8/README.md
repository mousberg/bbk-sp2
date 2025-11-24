# Week 8: Exceptions and Input/Output

This folder contains solutions to Lab Sheet 8 exercises focusing on exception handling and I/O operations.

## Exercises

### Exercise 1: MyClass.java
**Topic:** Exception handling trace (pen-and-paper exercise)

Demonstrates how exceptions propagate through method calls, including:
- Try-catch-finally blocks
- Exception inheritance (IllegalArgumentException extends RuntimeException)
- How finally blocks always execute regardless of exceptions
- Variable scope in exception handling

**To compile and run:**
```bash
javac MyClass.java
java MyClass
```

### Exercise 2: SomeExample.java
**Topic:** Debugging NullPointerException

Fixes two common bugs related to null references:
1. Not checking if array elements are null before calling methods on them
2. Not validating if the array itself is null before processing

**To compile and run:**
```bash
javac SomeExample.java
java SomeExample
```

### Exercise 3: Throwing.java
**Topic:** Input validation with IllegalArgumentException

Prompts user for integer input and throws IllegalArgumentException if input is invalid.
- Demonstrates unchecked exceptions
- Basic input validation with Scanner

**To compile and run:**
```bash
javac Throwing.java
java Throwing
```

### Exercise 4: ThrowingIO.java
**Topic:** Input validation with IOException

Similar to Exercise 3 but uses IOException (checked exception) instead.
- Demonstrates checked vs unchecked exceptions
- Requires explicit throws declaration and catch blocks

**To compile and run:**
```bash
javac ThrowingIO.java
java ThrowingIO
```

### Exercise 5: LoopUntilInt.java
**Topic:** Robust input validation with loops

Repeatedly prompts user until valid integer is entered.
- Demonstrates error recovery without exceptions
- User-friendly error messages
- Input validation in a loop

**To compile and run:**
```bash
javac LoopUntilInt.java
java LoopUntilInt
```

### Exercise 6: ArgumentProcessor.java
**Topic:** Command line argument processing

Processes command line arguments containing a mix of integers and doubles.
- Concatenates arguments into a single string
- Uses Scanner to identify number types
- Distinguishes between int and double

**To compile and run:**
```bash
javac ArgumentProcessor.java

# Test case 1: All integers
java ArgumentProcessor 1 2 3 4 5

# Test case 2: All doubles
java ArgumentProcessor 1.1 2.2 3.3 4.4

# Test case 3: Mixed integers and doubles
java ArgumentProcessor 1 2.9 3 4.9 5 6.9
```

## Key Concepts Covered

1. **Exception Hierarchy:** Understanding RuntimeException vs checked exceptions
2. **Exception Propagation:** How exceptions travel up the call stack
3. **Finally Blocks:** Code that always executes regardless of exceptions
4. **Null Safety:** Checking for null references to prevent NullPointerException
5. **Input Validation:** Using Scanner for type-safe input
6. **Command Line Arguments:** Processing program arguments
7. **Type Detection:** Distinguishing between different numeric types

## Common Pitfalls

- Forgetting to check for null before calling methods on objects
- Not understanding the difference between checked and unchecked exceptions
- Forgetting to close Scanner objects (can cause resource leaks)
- Not validating array/object references before use
- Misunderstanding finally block execution order

## Additional Notes

- Stack traces provide valuable debugging information about where exceptions occur
- Always validate input from users to prevent runtime errors
- Finally blocks execute even when exceptions are thrown
- Scanner.hasNextInt() vs Scanner.hasNextDouble() order matters

