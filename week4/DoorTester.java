/**
 * A class to test the Door class.
 */
public class DoorTester {
    /**
     * Tests the methods of the Door class
     * @param args not used
     */
    public static void main(String[] args) {
        Door frontDoor = new Door("Front", "open");
        System.out.println("The front door is " + frontDoor.getState());
        System.out.println("Expected: open");
        
        Door backDoor = new Door("Back", "closed");
        System.out.println("The back door is " + backDoor.getState());
        System.out.println("Expected: closed");
        
        // Use the mutator to change the state variable
        backDoor.setState("open");
        System.out.println("The back door is " + backDoor.getState());
        System.out.println("Expected: open");
        
        // Use the mutator to change the name variable
        backDoor.setName("Kitchen");
        System.out.println("The back door is called " + backDoor.getName());
        System.out.println("Expected: Kitchen");
        
        // Create a third Door object called sideDoor
        Door sideDoor = new Door("Side", "closed");
        System.out.println("The side door is " + sideDoor.getState());
        System.out.println("Expected: closed");
        
        // Verify that the object was properly created
        System.out.println("The side door is called " + sideDoor.getName());
        System.out.println("Expected: Side");
        
        // Use the mutator to change the state of sideDoor to open
        sideDoor.setState("open");
        System.out.println("The side door is " + sideDoor.getState());
        System.out.println("Expected: open");
    }
}
