/** 
 * Savings account operational definition.
 * @author Mason Jenkins
 */

public class SavingsAccount extends Account {
	private static final double interestRate = 0.0314; 
	//3.14 percent interest rate
	
	public SavingsAccount(int aNum, double bal) {
		super(aNum, bal);
	}
	
	public void monthEnd() {
		setBalance(getBalance() + (getBalance() * interestRate));
		displayBal();
	}
}
