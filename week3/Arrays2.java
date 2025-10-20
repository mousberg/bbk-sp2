/**
 * Software and Programming II (SP2) — Lab sheet 3
 * Question 2: Array Rotation
 * 
 * This class demonstrates array rotation functionality where elements
 * are moved forward by n positions, with elements that rotate off
 * the array appearing at the end.
 */
public class Arrays2 {
    public static void main(String[] args) {
        double[] x = {8, 4, 5, 21, 7, 9, 18, 2, 100};
        
        System.out.println("Before rotation: ==============================");
        for (int i = 0; i < x.length; i++) {
            System.out.println("x[" + i + "]: " + x[i]);
        }
        
        // Rotate the array by 3 positions
        x = rotate(x, 3);
        
        System.out.println("After rotation: ==============================");
        for (int i = 0; i < x.length; i++) {
            System.out.println("x[" + i + "]: " + x[i]);
        }
    }
    
    /**
     * Rotates an array by moving elements forward by n positions.
     * Elements that are rotated off the array will appear at the end.
     * 
     * @param x the original array (left unchanged)
     * @param n the number of positions to rotate forward
     * @return a new array with rotated elements
     */
    public static double[] rotate(double[] x, int n) {
        double[] y = new double[x.length];
        for (int i = 0; i < x.length; i++) {
            int pos = (i + x.length - n) % x.length;
            y[pos] = x[i];
        }
        return y;
    }
}
