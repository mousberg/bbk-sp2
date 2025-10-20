# Software and Programming II (SP2) — Lab Sheet 2 Solutions
## Methods 2025/26

Based upon exercises from Java for Everyone, 2e, Chapters 5 and 6.

## Lab Exercises Overview

### Exercise 1: Method Side Effects
- **Sum.java** - Demonstrates method parameter behavior and side effects
  - Shows that primitive parameters are passed by value
  - Illustrates that changes to parameters don't affect original variables
  - Includes proper Javadoc documentation

### Exercise 2: Static Methods
- **Rectangle.java** - Implements areaOfRectangle static method
  - Takes two floating-point parameters (length and width)
  - Returns the product as a double
  - Includes Javadoc documentation
  - Demonstrates method design and documentation

### Exercise 3: Credit Card Validation - Decode Method
- **Luhn.java** - Implements decode method for credit card validation
  - Decodes digits based on position (odd/even)
  - For odd positions: returns digit as-is
  - For even positions: doubles digit, adds digits if result > 9
  - Tests all digits 1-9 in both odd and even positions

### Exercise 4: Complete Credit Card Validation
- **Luhn2.java** - Implements full credit card validation using Luhn algorithm
  - Uses decode method from Exercise 3
  - Computes sum of all decoded digits
  - Validates if sum mod 10 equals 0
  - Tests multiple credit card numbers for validity

## Key Learning Objectives

1. **Method Design**: Creating reusable, well-documented methods
2. **Parameter Passing**: Understanding pass-by-value for primitives
3. **Static Methods**: Writing utility methods that don't require object instantiation
4. **Algorithm Implementation**: Complex algorithms like Luhn validation
5. **Documentation**: Javadoc conventions for method documentation

## Method Signatures

### Sum Class
```java
public static int sum(int a, int b)
```

### Rectangle Class
```java
public static double areaOfRectangle(double length, double width)
```

### Luhn Class
```java
public static int decode(int digit, boolean position)
```

### Luhn2 Class
```java
public static String checkDigits(int number)
```

## Testing Examples

### Credit Card Numbers Tested
- `2315778` - Valid (sum = 30, 30 % 10 = 0)
- `1234567` - Invalid (sum = 31, 31 % 10 = 1)
- `7654321` - Test case
- `1111111` - Test case

### Decode Method Examples
- `decode(8, false)` → 8 (odd position)
- `decode(8, true)` → 7 (even position: 8*2=16, 1+6=7)
- `decode(4, false)` → 4 (odd position)
- `decode(4, true)` → 8 (even position: 4*2=8)

## Key Concepts Covered

### Method Design Principles
- Single responsibility principle
- Clear parameter names and types
- Appropriate return types
- Javadoc documentation

### Algorithm Implementation
- Luhn algorithm for credit card validation
- Position-based digit processing
- Sum calculation and modulo operations

### Parameter Behavior
- Primitive parameters are passed by value
- Changes to parameters don't affect original variables
- Understanding method scope and variable lifetime

## Compilation and Execution

```bash
# Compile all files
javac *.java

# Run individual programs
java Sum
java Rectangle
java Luhn
java Luhn2
```

## Notes
- All methods include proper Javadoc documentation
- The Luhn algorithm is a real-world application used in credit card validation
- Methods demonstrate good programming practices and reusable code design
- Focus on understanding method design patterns for future object-oriented programming
