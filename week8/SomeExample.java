/**
 * Exercise 2: Debugging NullPointerException issues.
 * This class demonstrates common null reference bugs and their fixes.
 * 
 * Original bugs:
 * 1. sumLengths doesn't check if individual strings are null before calling .length()
 * 2. process doesn't validate if the words array itself is null before calling sumLengths
 */
public class SomeExample {

    /**
     * Returns the sum of the lengths of the non-null entries in strings.
     *
     * @param strings must not be null, but may contain null
     * @return the sum of the lengths of the non-null entries in strings
     * @throws NullPointerException if strings is the null reference
     */
    public static int sumLengths(String[] strings) {
        int result = 0;
        for (String s : strings) {
            // FIX 1: Check if individual string is null before calling .length()
            if (s != null) {
                result += s.length();
            }
        }
        return result;
    }

    /**
     * Computes and prints the sum of the lengths of the non-null entries in
     * words.
     * @param words must not be null, but may contain null
     * @throws NullPointerException if words is the null reference
     */
    public static void process(String[] words) {
        // FIX 2: Check if the array itself is null before processing
        if (words == null) {
            throw new NullPointerException("words array cannot be null");
        }
        int sum = sumLengths(words);
        System.out.println("The sum of the lengths is " + sum);
    }

    public static void main(String[] args) {
        String[] myWords = new String[3];
        myWords[0] = "Hello";
        myWords[1] = null; // myWords /contains/ the null reference
        myWords[2] = "World";
        process(myWords);

        System.out.println("Take 2.");
        String[] noWords = null; // noWords /is/ the null reference
        process(noWords);
        System.out.println("Bye!");
    }
}

