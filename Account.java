/**
 * Abstract bank account structure,
 * @author Mason Jenkins
 */

public class Account {
	private double balance;
	private int accNum;
	
	public Account(int aNum, double bal) {
		accNum = aNum;
		balance = bal;
		
	}
	
	public int getAccNum() {
		return accNum;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void setBalance(double set) {
		balance = set;
	}
	
	public void deposit(double amt) {
		balance = balance + amt;
		System.out.println("ACCOUNT " + accNum
				+ "\n -- BALANCE: " + balance);
	}
	
	public void withdraw(double amt) {
		balance = balance - amt;
		System.out.println("ACCOUNT " + accNum
				+ "\n -- BALANCE: " + balance);
	}
	
	public void displayBal() {
		System.out.println("ACCOUNT " + accNum
				+ "\n -- BALANCE: " + balance);
	}
}
