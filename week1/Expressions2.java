public class Expressions2 {
    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        int c = 5;
        int d = 17;
        
        System.out.println((a + b) / c);
        // 3 and 4 are added with sum 7
        // 7 is divided by 5 with quotient 1
        
        System.out.println(a + b / c);
        // 4 is divided by 5 with quotient 0
        // 3 is added to 0 with sum 3
        
        System.out.println(a + 1);
        // 3 is added to 1 with sum 4
        
        System.out.println(d % c);
        // 17 is divided by 5 with remainder 2
        
        System.out.println(d / c);
        // 17 is divided by 5 with quotient 3
        
        System.out.println(d % b);
        // 17 is divided by 4 with remainder 1
        
        System.out.println(d / b);
        // 17 is divided by 4 with quotient 4
        
        System.out.println(d + a / d + b);
        // 3 is divided by 17 with quotient 0
        // 17 is added to 0 with sum 17
        // 17 is added to 4 with sum 21
        
        System.out.println((d + a) / (d + b));
        // 17 is added to 3 with sum 20
        // 17 is added to 4 with sum 21
        // 20 is divided by 21 with quotient 0
        
        System.out.println(Math.sqrt(b));
        // the square root of 4 is 2.0
        
        System.out.println(Math.pow(a, b));
        // 3 to the 4th power is 81.0
        
        System.out.println(Math.abs(-a));
        // the absolute value of -3 is 3
        
        System.out.println(Math.max(a, b));
        // the maximum of 3 and 4 is 4
    }
}
