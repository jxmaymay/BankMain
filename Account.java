/**
 * Abstract bank account structure,
 * @author Mason Jenkins
 */

public class Account {
	private double balance;
	private int accNum;
	private int freeWithdraws;
	
	public Account(int aNum, double bal) {
		accNum = aNum;
		balance = bal;
		
	}
	
	public int getAccNum() {
		return accNum;
	}
	
	public void setBalance(double set) {
		balance = set;
	}
	
	public double getBalance() {
		balance = Math.round(balance * 100);
		balance = balance / 100;
		return balance;
	}
	
	public void deposit(double amt) {
		balance = balance + amt;
		balance = Math.round(balance * 100);
		setBalance(getBalance() / 100);
		System.out.println("ACCOUNT " + accNum
				+ "\n -- BALANCE: " + balance);
	}
	
	public void withdraw(double amt) {
		setBalance(getBalance() - amt);
		setBalance(Math.round(getBalance() * 100));
		setBalance(getBalance() / 100);
		System.out.println("ACCOUNT " + getAccNum()
				+ "\n -- BALANCE: " + getBalance());
		addWithdrawal();
		if (getFreeWithdrawsLeft() > 3) {
			setBalance(getBalance() - 1);
			setBalance(Math.round(getBalance() * 100));
			setBalance(getBalance() / 100);
			System.out.println("Account#" + getAccNum() + " charged processing fee.");
		}
	}
	
	public void displayBal() {
		System.out.println("ACCOUNT " + accNum
				+ "\n -- BALANCE: " + balance);
	}
	
	public int getFreeWithdrawsLeft() {
		return freeWithdraws;
	}
	
	public void addWithdrawal() {
		freeWithdraws++;
	}
	
	public void resetWithdrawals() {
		freeWithdraws = 0;
	}
	
	public void monthEnd() {
		freeWithdraws = 0;
		setBalance(Math.round(getBalance() * 100));
		setBalance(getBalance() / 100);
		displayBal();
	}
}
