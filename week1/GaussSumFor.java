public class GaussSumFor {
    public static void main(String[] args) {
        int n = 100;
        int sum = 0;
        
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        
        System.out.println("The sum of 1 + 2 + ... + " + n + " is " + sum);
    }
}
