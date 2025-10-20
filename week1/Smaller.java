import java.util.Scanner;

public class Smaller {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two integers separated by one or more spaces");
        int a = scan.nextInt();
        int b = scan.nextInt();
        System.out.println("The smaller integer is " + Math.min(a, b));
        scan.close();
    }
}
