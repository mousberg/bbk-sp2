# Software and Programming II (SP2) — Lab Sheet 1 Solutions
## Java Recap 2025/26

Based upon exercises from Java for Everyone, 2e, Chapters 1 through 4.

This lab sheet is significantly longer than those in the following weeks. The idea is to give you material you can practise with to reactivate your knowledge from the SP1 module.

## Lab Exercises Overview

### Questions 1-5: Basic Java Concepts
- **HelloPrinter.java** - Simple Hello World program (Exercise 1)
- **NumberDemo.java** - Primitive number types and constants (Exercise 2)
- **Expressions2.java** - Arithmetic expressions with detailed comments (Exercise 3)
- **Smaller.java** - Finding smaller of two integers using Scanner and Math methods (Exercise 4)
- **IncrementDemo2.java** - Increment/decrement operations (Exercise 5)

### Questions 6-9: Arithmetic and Type Issues
- **AverageCalculator.java** - Shows integer division issue (Exercise 6)
- **AverageCalculatorFixed.java** - Fixed version using floating-point division (Exercise 7)
- **PercentagePrinter.java** - Demonstrates floating-point precision issues (Exercise 8)
- **PercentagePrinterFixed.java** - Fixed version using Math.round (Exercise 9)

### Questions 10-19: Conditional Logic and Decision Making
- **GoodIfs.java** - Properly indented if statements with braces (Exercise 18)
- **ColourMixer.java** - Complex conditional logic for color mixing (Exercise 19)
- **SmallestIntAnswer.java** - Finding smallest of three integers (Exercise 11)
- **SmallestInt2Answer.java** - Finding smallest of four integers (Exercise 12)
- **StringEqual.java** - String comparison using == vs equals() (Exercise 15)
- **MiddleString.java** - Finding middle string lexicographically (Exercise 16)
- **MiddleStringAnswer.java** - Same as above but with && operator (Exercise 17)

### Questions 20-29: Loops and Iteration
- **SimpleLoop.java** - Basic while loop demonstration (Exercise 20)
- **SimpleLoop2.java** - Modified loop with different increment (Exercise 22)
- **GaussSum.java** - Sum calculation using while loop (Exercise 23)
- **GaussSumFor.java** - Same calculation using for loop (Exercise 24)
- **GaussSumDoWhile.java** - Same calculation using do-while loop (Exercise 24)
- **SentinelRunner.java** - Sentinel-controlled loop with Scanner (Exercise 25)
- **NestedLoopRunner.java** - Nested loops to print X pattern (Exercise 26)
- **PrintSum.java** - Sum calculation with while loop (Exercise 27)
- **PrintSumAnswer.java** - Same program converted to do-while loop (Exercise 28)

## Key Learning Objectives

1. **Java Fundamentals**: Variables, data types, operators, expressions
2. **Control Flow**: if/else statements, loops (while, for, do-while)
3. **String Manipulation**: String comparison, concatenation, methods
4. **Loop Control**: Loop variables, nested loops, sentinel values
5. **Problem Solving**: Algorithm implementation, debugging techniques

## Compilation and Execution

### Prerequisites
- Java Development Kit (JDK) 8 or higher
- Command line access or Java IDE

### Compilation
```bash
javac FileName.java
```

### Execution
```bash
java ClassName
```

### Batch Compilation
```bash
javac *.java
```

## Interactive Programs
The following programs require user input:
- `Smaller.java` - Enter two integers
- `SmallestIntAnswer.java` - Enter three integers
- `SmallestInt2Answer.java` - Enter four integers
- `MiddleString.java` / `MiddleStringAnswer.java` - Enter three strings
- `ColourMixer.java` - Answer Y/N for color inclusion
- `SentinelRunner.java` - Enter numbers, 'q' to quit
- `PrintSum.java` / `PrintSumAnswer.java` - Enter numbers, 0 to quit

## Key Concepts Covered

### Variables and Data Types
- Primitive number types (int, byte, short, long, double, float, char)
- Constants using `final` keyword
- Type casting and precision issues

### Arithmetic Operations
- Order of operations
- Integer vs. floating-point division
- Math class methods (min, max, sqrt, pow, abs, round)

### Conditional Logic
- if-else statements
- Nested conditionals
- Boolean operators (&& and ||)
- String comparison using .equals() and .compareTo()

### Loops
- while loops
- for loops
- do-while loops
- Loop control variables
- Nested loops
- Sentinel-controlled loops

### Input/Output
- Scanner class for user input
- System.out.println for output
- hasNextDouble() for input validation

## Notes
- Exercises marked with (*) are more challenging and can be done at home
- Some files have both original and "Fixed" versions showing common programming mistakes
- Solutions demonstrate proper Java syntax and best practices
- Focus on understanding Java fundamentals before moving to advanced topics