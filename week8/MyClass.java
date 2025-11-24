/**
 * Exercise 1: Exception handling trace demonstration.
 * This class demonstrates how exceptions propagate through method calls
 * and how finally blocks always execute.
 * 
 * Expected output:
 * Value x = 12
 * In exception - Conditional: 23
 * AnotherClass::finally: 8
 * java.lang.IllegalArgumentException: AnotherClass::method exception x = 23
 * MyClass::finally: 12
 * 
 * Explanation:
 * - x starts as 12
 * - x + 10 = 22 is passed to method()
 * - In method: x becomes 22, then 22/2 = 11 > 10, so x++ makes it 23
 * - RuntimeException is thrown with "Conditional: 23"
 * - Caught in method's catch block, prints "In exception - Conditional: 23"
 * - IllegalArgumentException is thrown with x still at 23 (subclass of RuntimeException)
 * - Finally block executes: x -= 15, so x becomes 23-15 = 8, prints this
 * - IllegalArgumentException propagates to main's catch block (message still has x=23)
 * - Main's catch prints the exception (with x=23 from when it was thrown)
 * - Main's finally block executes with original x value (12)
 */
public class MyClass {
    public static void main(String[] args) {
        int x = 12;
        try {
            AnotherClass c = new AnotherClass();
            System.out.println("Value x = " + x);
            x = c.method(x + 10);
            System.out.println("Result is: " + x);
        }
        catch (RuntimeException ex) {
            System.out.println(ex);
        }
        finally {
            System.out.println("MyClass::finally: " + x);
        }
    }
}

class AnotherClass {
    int method(int x) {
        try {
            if (x / 2 > 10) {
                x++;
                throw new RuntimeException("Conditional: " + x);
            }
            System.out.println("AnotherClass::method Value of x is " + x);
        }
        catch (RuntimeException ex) {
            System.out.println("In exception - " + ex.getMessage());
            throw new IllegalArgumentException("AnotherClass::method exception x = " + x);
        }
        catch (Exception e) {
            System.out.println("In general exception");
            throw new RuntimeException("From exception");
        }
        finally {
            x -= 15;
            System.out.println("AnotherClass::finally: " + x);
        }
        return x;
    }
}

