
public interface ProvidesMonthlyIncome {
	double getMonthlyIncome();
	
	// Question 6: Default method
	default boolean isIncomeAboveThreshold(double threshold) {
		return getMonthlyIncome() > threshold;
	}
}
