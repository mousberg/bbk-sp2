/**
 * Software and Programming II (SP2) — Lab sheet 3
 * Question 3: Customer List
 * 
 * This class creates an array of String objects to store customer names
 * and demonstrates how to print the array contents.
 */
public class CustomerLister {
    public static void main(String[] args) {
        // Create an array of String objects with room for five names
        // Use an initializer list to populate the array
        String[] customerName = {
            "Cathy",
            "Ben", 
            "Jorge",
            "Wanda",
            "Freddie"
        };
        
        // Print the array of names
        System.out.println("Customer Names:");
        for (String name : customerName) {
            System.out.println(name);
        }
    }
}
