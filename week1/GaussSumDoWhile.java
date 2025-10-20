public class GaussSumDoWhile {
    public static void main(String[] args) {
        int n = 100;
        int i = 1;
        int sum = 0;
        
        do {
            sum = sum + i;
            i++;
        }
        while (i <= n);
        
        System.out.println("The sum of 1 + 2 + ... + " + n + " is " + sum);
    }
}
