package lab05src;

public class Test {
	public static void main(String[] args) {
		// declare, create and initialise an array of Person objects
		// When you have implemented Professor and Lecturer, you should be able
		// to uncomment the commented code below.
		Person[] people = {
				new Professor("C. Darwin", 45, "c.darwin@species.com", 150000, 1000, "First Year liaison"),
				new Person("J. Doe", 20, "j.doe@supermail.com"), 
				new Student("A. Bee", 19, "a.bee@bettermail.com", "19000091"), 
				new Lecturer("B. Cee", 11, "b.cee@okmail.com", 50000), 
				new Student(),
				new Professor("A. Einstein", 105, "a.einstein@emc2.com", 100000, 2000, "Finance committee")					
		};
		
		// display the objects
		display(people);
		
		// display roles for Professor objects
		displayRoles(people);
		
		// display student numbers
		//displayNumbers(people);
		
	}
	// displays each object in the array
	public static void display(Person[] arr) {
		for (int i = 0; i < arr.length; i++)
			System.out.println(arr[i].toString());
	}
	
	// displays roles for Professor objects in the array
	public static void displayRoles(Person[] arr) {
		System.out.println("\nRoles:");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] instanceof Professor) {
				Professor prof = (Professor) arr[i];
				System.out.println(prof.getName() + ": " + prof.getRole());
			}
		}
	}
}

