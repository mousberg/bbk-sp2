import java.util.Scanner;

public class SmallestInt2Answer {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a value for w:");
        int w = scan.nextInt();
        int smallest = w; // w is the smallest value so far
        
        System.out.println("Enter a value for x:");
        int x = scan.nextInt();
        if (x < smallest) {
            smallest = x; // Update smallest if necessary
        }
        
        System.out.println("Enter a value for y:");
        int y = scan.nextInt();
        if (y < smallest) {
            smallest = y; // Update smallest if necessary
        }
        
        System.out.println("Enter a value for z:");
        int z = scan.nextInt();
        if (z < smallest) {
            smallest = z; // Update smallest if necessary
        }
        
        System.out.println("The smallest value was " + smallest);
        scan.close();
    }
}
