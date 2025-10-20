import java.util.Scanner;

public class SmallestIntAnswer {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a value for x:");
        int x = scan.nextInt();
        System.out.println("Enter a value for y:");
        int y = scan.nextInt();
        System.out.println("Enter a value for z:");
        int z = scan.nextInt();
        
        if (x <= y) {
            if (x <= z) {
                System.out.println("The smallest value was " + x);
            } else {
                System.out.println("The smallest value was " + z);
            }
        } else {
            if (y <= z) {
                System.out.println("The smallest value was " + y);
            } else {
                System.out.println("The smallest value was " + z);
            }
        }
        scan.close();
    }
}
