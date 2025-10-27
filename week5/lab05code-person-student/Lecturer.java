package lab05src;

public class Lecturer extends Person {
	private double salary;
	
	public Lecturer() {
		super();
		this.salary = 50000.0; // Default salary
	}
	
	public Lecturer(String name, int age, String email, double salary) {
		super(name, age, email);
		this.salary = salary;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public void setSalary(double salary) {
		if (salary >= 0) {
			this.salary = salary;
		} else {
			System.out.println("Error: Salary cannot be negative. Value not set.");
		}
	}
	
	@Override
	public String toString() {
		return super.toString() + salary + "\n";
	}
}
