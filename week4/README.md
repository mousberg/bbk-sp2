# Software and Programming II (SP2) — Lab Sheet 4 Solutions
## Objects and Classes 2025/26

Based upon exercises from Java for Everyone, 2e.

## Lab Exercises Overview

### Part 1: Door Class Implementation
- **Door.java** - Complete Door class implementation
- **DoorTester.java** - Test program for Door class functionality

### Part 2: VendingMachine Class Implementation
- **VendingMachine.java** - Complete VendingMachine class implementation
- **VendingMachineTester.java** - Test program for VendingMachine class functionality

## Door Class Design

### Instance Variables
```java
private String name;    // Door name (e.g., "Front", "Back", "Side")
private String state;    // Door state ("open" or "closed")
```

### Constructor
```java
public Door(String doorName, String initialState)
```

### Methods
- `public String getName()` - Accessor for door name
- `public String getState()` - Accessor for door state
- `public void setName(String newName)` - Mutator for door name
- `public void setState(String newState)` - Mutator for door state
- `public void open()` - Opens the door
- `public void close()` - Closes the door

## VendingMachine Class Design

### Instance Variables
```java
private int canCount;    // Number of cans in machine
private int tokenCount;  // Number of tokens collected
```

### Constructors
```java
public VendingMachine()                    // Default: 10 cans, 0 tokens
public VendingMachine(int cans)            // Custom: specified cans, 0 tokens
```

### Methods
- `public void insertToken()` - Insert token, dispense can (if available)
- `public void fillUp(int cans)` - Add more cans to machine
- `public int getCanCount()` - Get current can count
- `public int getTokenCount()` - Get current token count

## Key Learning Objectives

1. **Class Design**: Creating classes to model real-world objects
2. **Instance Variables**: Private data members with appropriate types
3. **Constructors**: Object initialization with different parameter sets
4. **Accessor Methods**: Getting values from private variables
5. **Mutator Methods**: Modifying private variables safely
6. **Object Behavior**: Methods that change object state
7. **Encapsulation**: Data hiding and controlled access

## Object-Oriented Concepts

### Encapsulation
- Private instance variables
- Public methods for controlled access
- Data hiding principle

### Constructor Design
- Default constructor with sensible defaults
- Parameterized constructor for customization
- Constructor chaining (one constructor calls another)

### Method Design
- Accessor methods (getters) for reading data
- Mutator methods (setters) for modifying data
- Business logic methods for object behavior

## Door Class Features

### State Management
- Tracks door name and current state
- Provides methods to open and close door
- Allows name changes through mutator

### Testing Scenarios
- Create doors with different names and states
- Change door states using mutator methods
- Verify state changes through accessor methods

## VendingMachine Class Features

### Inventory Management
- Tracks number of cans and tokens
- Prevents dispensing when no cans available
- Allows refilling with additional cans

### Business Logic
- Token insertion triggers can dispensing
- Can count decreases, token count increases
- Safety check prevents negative can count

## Code Examples

### Door Class Usage
```java
Door frontDoor = new Door("Front", "open");
System.out.println("The front door is " + frontDoor.getState());
frontDoor.close();
System.out.println("The front door is " + frontDoor.getState());
```

### VendingMachine Class Usage
```java
VendingMachine machine = new VendingMachine(10);
machine.insertToken();
machine.insertToken();
System.out.println("Cans: " + machine.getCanCount());
System.out.println("Tokens: " + machine.getTokenCount());
```

## Testing Programs

### DoorTester.java
- Creates multiple Door objects
- Tests state changes
- Verifies mutator and accessor methods
- Demonstrates object independence

### VendingMachineTester.java
- Creates VendingMachine with initial cans
- Tests token insertion
- Verifies can and token counts
- Tests business logic

## Key Concepts Covered

### Class Structure
- Instance variable declaration
- Constructor implementation
- Method design and implementation
- Access modifiers (private, public)

### Object Creation
- Constructor calls with parameters
- Object reference variables
- Method invocation on objects

### State Management
- Object state through instance variables
- State changes through method calls
- Object independence

## Compilation and Execution

```bash
# Compile all files
javac *.java

# Run test programs
java DoorTester
java VendingMachineTester
```

## Design Patterns Demonstrated

### Constructor Pattern
- Default constructor with sensible defaults
- Parameterized constructor for customization
- Constructor chaining for code reuse

### Accessor/Mutator Pattern
- Private instance variables
- Public accessor methods (getters)
- Public mutator methods (setters)

### Business Logic Pattern
- Methods that implement object behavior
- State validation and safety checks
- Encapsulation of business rules

## Notes
- All classes follow proper encapsulation principles
- Constructors provide flexible object initialization
- Methods demonstrate good object-oriented design
- Test programs verify all functionality works correctly
- Focus on understanding class design for future object-oriented programming
