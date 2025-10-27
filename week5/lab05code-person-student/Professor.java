package lab05src;

public class Professor extends Lecturer {
	private double bonus;
	private String role;
	
	public Professor() {
		super();
		this.bonus = 1000.0; // Default bonus
		this.role = "General Professor"; // Default role
	}
	
	public Professor(String name, int age, String email, double salary, double bonus, String role) {
		super(name, age, email, salary);
		this.bonus = bonus;
		this.role = role;
	}
	
	public double getBonus() {
		return bonus;
	}
	
	public void setBonus(double bonus) {
		if (bonus >= 0) {
			this.bonus = bonus;
		} else {
			System.out.println("Error: Bonus cannot be negative. Value not set.");
		}
	}
	
	public String getRole() {
		return role;
	}
	
	public void setRole(String role) {
		this.role = role;
	}
	
	@Override
	public double getSalary() {
		return super.getSalary() + bonus; // Include bonus in salary calculation
	}
	
	@Override
	public String toString() {
		return super.toString() + bonus + "\n" + role + "\n";
	}
}
