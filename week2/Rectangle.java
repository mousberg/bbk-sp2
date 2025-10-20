public class Rectangle {
    public static void main(String[] args) {
        double length = 3.4;
        double width = 8.4;
        
        System.out.println("Rectangle dimensions:");
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        System.out.println("Area: " + areaOfRectangle(length, width));
    }
    
    /**
     * Calculates the area of a rectangle.
     *
     * @param length the length of the rectangle as a floating-point value
     * @param width the width of the rectangle as a floating-point value
     * @return the area of the rectangle (length * width) as a double
     */
    public static double areaOfRectangle(double length, double width) {
        return length * width;
    }
}
