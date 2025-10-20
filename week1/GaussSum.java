public class GaussSum {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;
        int n = 100;
        
        while (i <= n) {
            sum = sum + i;
            i++;
        }
        
        // formula is n(n+1)/2
        System.out.println("The sum of 1 + 2 + ... + " + n + " is " + sum);
    }
}
