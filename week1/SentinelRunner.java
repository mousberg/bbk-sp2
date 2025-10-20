import java.util.Scanner;

public class SentinelRunner {
    public static void main(String[] args) {
        double total = 0;
        int count = 0;
        double inputValue;
        
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number or type 'q' to Quit");
        
        while (in.hasNextDouble()) {
            inputValue = in.nextDouble();
            total = total + inputValue;
            count = count + 1;
            System.out.println("Enter a number or type 'q' to Quit");
        }
        
        System.out.println("The total was " + total + ".");
        System.out.println("You typed " + count + " values.");
        in.close();
    }
}
