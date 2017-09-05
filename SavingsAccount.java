/** 
 * Savings account operational definition.
 * @author Mason Jenkins
 */


public class SavingsAccount extends Account {
	private static final double interestRate = 0.0314; 
	//3.14 percent interest rate
	private int freeWithdraws = 0;
	
	public SavingsAccount(int aNum, double bal) {
		super(aNum, bal);
	}
	
	public void withdraw(double amt) {
		setBalance(getBalance() - amt);
		System.out.println("ACCOUNT " + getAccNum()
				+ "\n -- BALANCE: " + getBalance());
		freeWithdraws++;
		if (freeWithdraws > 3) {
			setBalance(getBalance() - 1);
			System.out.println("Account#" + getAccNum() + " charged processing fee.");
		}
	}
	
	public void monthEnd() {
		freeWithdraws = 0;
		setBalance(getBalance() + (getBalance() * interestRate));
		setBalance(Math.round(getBalance() * 100));
		setBalance(getBalance() / 100);
		displayBal();
	}
}
