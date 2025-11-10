
public class SavingsAccount extends Account implements ProvidesMonthlyIncome {
	private double interestRate; // percentage
	private double lastInterest; // track last calculated interest
	
	public SavingsAccount() {
		super();
		interestRate = 0.0;
		lastInterest = 0.0;
	}
	
	public void setInterestRate(double rate) {
		if (rate >= 0) {
			interestRate = rate;
		}
	}
	
	public double getInterestRate() {
		return interestRate;
	}
	
	private double calculateInterest() {
		return getBalance() * (interestRate / 100.0);
	}
	
	@Override
	public void monthEnd() {
		lastInterest = calculateInterest();
		deposit(lastInterest);
	}
	
	@Override
	public double getMonthlyIncome() {
		// Return the interest that will be/was earned this month
		// If monthEnd() was called, return that interest
		// Otherwise calculate what it would be
		if (lastInterest > 0) {
			return lastInterest;
		}
		return calculateInterest();
	}
}
