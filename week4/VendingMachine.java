/**
 * A class to model a vending machine that sells cans of soft drink.
 * The machine tracks the number of cans and tokens.
 */
public class VendingMachine {
    // Instance variables - private for encapsulation
    private int canCount;
    private int tokenCount;
    
    /**
     * Default constructor that initializes the vending machine with 10 cans.
     * This constructor calls the parameterized constructor.
     */
    public VendingMachine() {
        this(10);
    }
    
    /**
     * Constructor that initializes the vending machine with a specified number of cans.
     * @param cans the initial number of cans in the machine
     */
    public VendingMachine(int cans) {
        canCount = cans;
        tokenCount = 0;
    }
    
    /**
     * Inserts a token into the machine and dispenses a can if available.
     * The number of tokens is increased and the number of cans is decreased.
     * Only works if there are cans available.
     */
    public void insertToken() {
        if (canCount > 0) {
            canCount--;
            tokenCount++;
        }
    }
    
    /**
     * Fills up the machine with more cans.
     * @param cans the number of cans to add to the machine
     */
    public void fillUp(int cans) {
        canCount += cans;
    }
    
    /**
     * Accessor method for the can count.
     * @return the current number of cans in the machine
     */
    public int getCanCount() {
        return canCount;
    }
    
    /**
     * Accessor method for the token count.
     * @return the current number of tokens in the machine
     */
    public int getTokenCount() {
        return tokenCount;
    }
}
