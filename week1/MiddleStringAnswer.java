import java.util.Scanner;

public class MiddleStringAnswer {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter string 1:");
        String str1 = scan.next();
        System.out.println("Enter string 2:");
        String str2 = scan.next();
        System.out.println("Enter string 3:");
        String str3 = scan.next();
        
        String middle = str1; // Assume str1 is the middle string
        
        // Check to see if str2 is in the middle
        if ((str1.compareTo(str2) <= 0) && (str2.compareTo(str3) <= 0)) {
            middle = str2; // Change to str2
        }
        if ((str3.compareTo(str2) <= 0) && (str2.compareTo(str1) <= 0)) {
            middle = str2; // Change to str2
        }
        
        // Check to see if str3 is in the middle
        if ((str1.compareTo(str3) <= 0) && (str3.compareTo(str2) <= 0)) {
            middle = str3; // Change to str3
        }
        if ((str2.compareTo(str3) <= 0) && (str3.compareTo(str1) <= 0)) {
            middle = str3; // Change to str3
        }
        
        System.out.println("The middle string is " + middle);
        scan.close();
    }
}
