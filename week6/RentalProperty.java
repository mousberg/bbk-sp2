
/**
 * A RentalProperty has an address and a rent.
 */
public class RentalProperty implements ProvidesMonthlyIncome {
	/** The address of the RentalProperty. May be null. */
	private String address;
	
	/** The rent of the RentalProperty. */
	private double rent;
	
	/**
	 * Constructs a RentalProperty object with a given address and rent.
	 * @param address the address of the RentalProperty
	 * @param rent the rent of the RentalProperty
	 */
	public RentalProperty(String address, double rent) {
		this.address = address;
		this.rent = rent;
	}
	
	@Override
	public double getMonthlyIncome() {
		return rent;
	}
	
	public String getAddress() {
		return address;
	}
	
	public double getRent() {
		return rent;
	}
}
