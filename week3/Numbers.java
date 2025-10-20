import java.util.ArrayList;
import java.util.Scanner;

/**
 * Software and Programming II (SP2) — Lab sheet 3
 * Question 5: Number Analysis
 * 
 * This program reads numbers from the user, stores them in an ArrayList,
 * and prints various statistical information about the entered numbers.
 */
public class Numbers {
    
    /**
     * Asks the user to enter numbers and stores them in an ArrayList
     * until the user enters -1.
     * 
     * @return the list of the values != -1 entered so far, in the order
     *         they were entered
     */
    public static ArrayList<Integer> readInput() {
        ArrayList<Integer> res = new ArrayList<Integer>();
        Scanner in = new Scanner(System.in);
        int input;
        
        try {
            do {
                System.out.print("Enter a number: ");
                input = in.nextInt();
                if (input != -1) {
                    res.add(input);
                }
            } while (input != -1);
        } finally {
            in.close();
        }
        
        return res;
    }
    
    /**
     * Returns the average (the mean) of the elements of numbers.
     * The average of a non-empty list [x1, ..., xN] with N > 1
     * is defined as: (x1 + ... + xN) / N
     * 
     * @param numbers a non-null list of numbers without null entries
     * @return the average of numbers, or NaN if numbers is empty
     */
    public static double average(ArrayList<Integer> numbers) {
        if (numbers.size() == 0) {
            return Double.NaN;
        }
        
        double sum = 0;
        for (int value : numbers) {
            sum = sum + value;
        }
        return sum / numbers.size();
    }
    
    /**
     * Returns the average (the mean) of the elements of numbers.
     * The average of a non-empty list [x1, ..., xN] with N > 1
     * is defined as: (x1 + ... + xN) / N
     * 
     * @param numbers a non-null list of numbers without null entries
     * @return the average of numbers, or NaN if numbers is empty
     */
    public static double averageDouble(ArrayList<Double> numbers) {
        // Method needed for evensStdDeviation;
        // note the code duplication wrt "average". :-(
        // We will see ways to remedy this (using bounded generic types)
        // later in the module.
        if (numbers.size() == 0) {
            return Double.NaN;
        }
        
        double sum = 0;
        for (double value : numbers) {
            sum = sum + value;
        }
        return sum / numbers.size();
    }
    
    /**
     * Returns the standard deviation of the even elements in numbers.
     * The standard deviation of a non-empty list of numbers
     * Xs = [x1, ..., xN] with N > 1 is defined as
     * sqrt( (x1 - avg(Xs))^2 + ... + (xN - avg(Xs))^2 / N )
     * Here "avg" stands for the average and "sqrt" stands for the square root.
     * 
     * @param numbers a non-null list of numbers without null entries
     * @return the standard deviation of the even elements of numbers,
     *         or NaN if numbers has no even elements
     */
    public static double evensStdDeviation(ArrayList<Integer> numbers) {
        ArrayList<Integer> evens = getEvens(numbers);
        if (evens.isEmpty()) {
            return Double.NaN;
        }
        
        double avg = average(evens);
        ArrayList<Double> valueMinusAvgSquares = new ArrayList<Double>();
        
        for (int value : evens) {
            double valMinusAvg = value - avg;
            valueMinusAvgSquares.add(valMinusAvg * valMinusAvg);
        }
        
        double variance = averageDouble(valueMinusAvgSquares);
        return Math.sqrt(variance);
    }
    
    /**
     * @param numbers a non-null list of numbers without null entries
     * @return a fresh ArrayList containing the even elements of numbers
     *         in the same order as in numbers
     */
    public static ArrayList<Integer> getEvens(ArrayList<Integer> numbers) {
        ArrayList<Integer> res = new ArrayList<Integer>();
        for (int value : numbers) {
            if (value % 2 == 0) {
                res.add(value);
            }
        }
        return res;
    }
    
    /**
     * @param numbers a non-null list of numbers without null entries
     * @return the sum of the elements of numbers
     */
    public static int computeSum(ArrayList<Integer> numbers) {
        int res = 0;
        for (int value : numbers) {
            res = res + value;
        }
        return res;
    }
    
    /**
     * @param numbers a non-null list of numbers without null entries
     * @return the sum of the odd elements of numbers
     */
    public static int oddsSum(ArrayList<Integer> numbers) {
        ArrayList<Integer> odds = getOdds(numbers);
        return computeSum(odds);
    }
    
    /**
     * @param numbers a non-null list of numbers without null entries
     * @return a fresh ArrayList containing the odd elements of numbers
     *         in the same order as in numbers
     */
    public static ArrayList<Integer> getOdds(ArrayList<Integer> numbers) {
        ArrayList<Integer> res = new ArrayList<Integer>();
        for (int value : numbers) {
            if (value % 2 != 0) {
                res.add(value);
            }
        }
        return res;
    }
    
    /**
     * Main method that orchestrates the number analysis process.
     * 
     * @param args ignored
     */
    public static void main(String[] args) {
        ArrayList<Integer> numbers = readInput();
        
        System.out.println();
        System.out.println("# of items: " + numbers.size());
        
        // Cast to int in the next statement because
        // the example output has no ".0" at the end
        System.out.println("Average: " + (int) average(numbers));
        
        // Format standard deviation to 2 decimal places
        System.out.println("Standard deviation of even numbers: " 
            + String.format("%.2f", evensStdDeviation(numbers)));
        
        System.out.println("Sum of odd numbers: " + oddsSum(numbers));
    }
}
