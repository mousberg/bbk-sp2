import java.util.ArrayList;

/**
 * Software and Programming II (SP2) — Lab sheet 3
 * Question 4: ArrayList Operations
 * 
 * This class demonstrates various ArrayList operations including:
 * - Adding elements
 * - Retrieving elements by index
 * - Modifying elements
 * - Inserting elements at specific positions
 * - Creating copies of ArrayLists
 * - Removing elements
 */
public class ArrayListRunner {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        System.out.println("Initial ArrayList: " + names);
        
        // (a) Add names in sequence
        names.add("Alice");
        names.add("Bob");
        names.add("Connie");
        names.add("David");
        names.add("Edward");
        names.add("Fran");
        names.add("Gomez");
        names.add("Harry");
        System.out.println("After adding names: " + names);
        
        // (b) Retrieve and print first and last names
        System.out.println("First name: " + names.get(0));
        System.out.println("Last name: " + names.get(7));
        
        // (c) Print the size of the ArrayList
        System.out.println("Size of ArrayList: " + names.size());
        
        // (d) Use size() to print the last name
        System.out.println("Last name (using size): " + names.get(names.size() - 1));
        
        // (e) Change Alice to Anna using set()
        names.set(0, "Anna");
        System.out.println("After changing Alice to Anna: " + names);
        
        // (f) Insert Doug after David using alternate form of add()
        names.add(4, "Doug");
        System.out.println("After inserting Doug after David: " + names);
        
        // (g) Use enhanced for loop to print each name
        System.out.println("Names using enhanced for loop:");
        for (String s : names) {
            System.out.println(s);
        }
        
        // (h) Create a second ArrayList using constructor that accepts another ArrayList
        ArrayList<String> names2 = new ArrayList<>(names);
        System.out.println("names2 (copy of names): " + names2);
        
        // (i) Remove first element and verify both lists
        names.remove(0);
        System.out.println("names after removing first element: " + names);
        System.out.println("names2 (should be unchanged): " + names2);
    }
}
