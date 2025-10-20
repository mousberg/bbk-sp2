/**
 * A class to model a door object with name and state properties.
 * This class demonstrates basic object-oriented programming concepts.
 */
public class Door {
    // Instance variables - private for encapsulation
    private String name;
    private String state;
    
    /**
     * Constructor that initializes a Door object with name and state.
     * @param doorName the name of the door
     * @param doorState the initial state of the door (open/closed)
     */
    public Door(String doorName, String doorState) {
        name = doorName;
        state = doorState;
    }
    
    /**
     * Opens the door by setting its state to "open".
     */
    public void open() {
        state = "open";
    }
    
    /**
     * Closes the door by setting its state to "closed".
     */
    public void close() {
        state = "closed";
    }
    
    /**
     * Accessor method for the name variable.
     * @return the name of the door
     */
    public String getName() {
        return name;
    }
    
    /**
     * Accessor method for the state variable.
     * @return the current state of the door
     */
    public String getState() {
        return state;
    }
    
    /**
     * Mutator method for the name variable.
     * @param newName the new name for the door
     */
    public void setName(String newName) {
        name = newName;
    }
    
    /**
     * Mutator method for the state variable.
     * @param newState the new state for the door
     */
    public void setState(String newState) {
        state = newState;
    }
}
