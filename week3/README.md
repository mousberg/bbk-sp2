# Software and Programming II (SP2) — Lab Sheet 3 Solutions
## Arrays and ArrayLists 2025/26

Based upon exercises from Java for Everyone, 2e, Chapters 5 and 6.

## Lab Exercises Overview

### Exercise 1: Array Fundamentals
- **Arrays.java** - Comprehensive array operations demonstration
  - Array initialization with values: {8, 4, 5, 21, 7, 9, 18, 2, 100}
  - Array length property usage
  - Accessing first and last elements
  - Standard for loops for iteration
  - Enhanced for loops (for-each)
  - Reverse iteration through arrays

### Exercise 2: Array Rotation
- **Arrays2.java** - Array rotation algorithm implementation
  - Rotates array elements by specified positions
  - Elements rotated off the end appear at the beginning
  - Example: {1,2,3,4,5,6,7} rotated by 3 becomes {4,5,6,7,1,2,3}
  - Uses modular arithmetic for position calculation

### Exercise 3: String Arrays
- **CustomerLister.java** - String array management
  - Array of customer names: {"Cathy", "Ben", "Jorge", "Wanda", "Freddie"}
  - Enhanced for loop for string iteration
  - Demonstrates string array initialization and iteration

### Exercise 4: ArrayList Operations
- **ArrayListRunner.java** - Comprehensive ArrayList usage
  - ArrayList creation and initialization
  - Adding elements: Alice, Bob, Connie, David, Edward, Fran, Gomez, Harry
  - get() method for element retrieval
  - size() method for length determination
  - set() method for element modification
  - add() with index for insertion
  - remove() method for element deletion
  - ArrayList constructor with another ArrayList
  - Enhanced for loop iteration

### Exercise 5: Statistical Analysis
- **Numbers.java** - Advanced ArrayList operations with statistical calculations
  - User input collection until -1 is entered
  - Number of items calculation
  - Average calculation
  - Standard deviation of even numbers
  - Sum of odd numbers
  - Helper methods for data processing

## Key Learning Objectives

1. **Array Operations**: Creation, initialization, iteration, manipulation
2. **ArrayList Usage**: Dynamic arrays with built-in methods
3. **Algorithm Implementation**: Array rotation, statistical calculations
4. **Data Processing**: User input, filtering, mathematical operations
5. **Method Design**: Helper methods for complex operations

## Array Operations Demonstrated

### Basic Array Operations
- Array initialization with initializer lists
- Length property access
- Element access by index
- Standard and enhanced for loops
- Reverse iteration

### Advanced Array Operations
- Array rotation algorithm
- Modular arithmetic for position calculation
- Array copying and manipulation

## ArrayList Methods Used

### Core Methods
- `add(element)` - Add element to end
- `add(index, element)` - Insert element at specific position
- `get(index)` - Retrieve element at index
- `set(index, element)` - Replace element at index
- `remove(index)` - Remove element at index
- `size()` - Get number of elements

### Constructor Usage
- Default constructor: `new ArrayList<>()`
- Copy constructor: `new ArrayList<>(otherList)`

## Statistical Calculations

### Numbers.java Features
- **Input Collection**: Continuous number input until -1
- **Average Calculation**: Sum divided by count
- **Standard Deviation**: Mathematical formula implementation
- **Data Filtering**: Separate even and odd numbers
- **Helper Methods**: Modular code design

### Mathematical Operations
- Mean calculation: `sum / count`
- Standard deviation: `sqrt(sum of squared differences / count)`
- Number classification: even/odd determination

## Code Examples

### Array Initialization
```java
double[] x = {8, 4, 5, 21, 7, 9, 18, 2, 100};
```

### ArrayList Operations
```java
ArrayList<String> names = new ArrayList<>();
names.add("Alice");
names.add("Bob");
String first = names.get(0);
int size = names.size();
```

### Array Rotation
```java
public static double[] rotate(double[] x, int n) {
    double[] y = new double[x.length];
    for (int i = 0; i < x.length; i++) {
        int pos = (i + x.length - n) % x.length;
        y[pos] = x[i];
    }
    return y;
}
```

## Compilation and Execution

```bash
# Compile all files
javac *.java

# Run individual programs
java Arrays
java Arrays2
java CustomerLister
java ArrayListRunner
java Numbers
```

## Interactive Programs
- **Numbers.java** - Enter numbers until -1, then see statistical analysis

## Key Concepts Covered

### Array Fundamentals
- Array declaration and initialization
- Index-based access
- Length property
- Iteration patterns (standard and enhanced for loops)

### ArrayList Advantages
- Dynamic sizing
- Built-in methods for common operations
- Generic type safety
- Memory management

### Algorithm Design
- Array rotation using modular arithmetic
- Statistical calculations with helper methods
- Data filtering and processing

## Notes
- Arrays have fixed size, ArrayLists are dynamic
- Enhanced for loops are preferred for iteration when index isn't needed
- Statistical calculations demonstrate real-world programming applications
- Method decomposition makes complex algorithms more manageable