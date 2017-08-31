import java.util.ArrayList;

/**
 * Main bank operation.
 * @author Mason Jenkins
 */

public class BankMain {
	public static void main(String[] args) {
		ArrayList<Object> accounts = new ArrayList<Object>();
		
		SavingsAccount sa1 = new SavingsAccount(1, 0.0);
		accounts.add(sa1);
		//initialize new savings account + add to registry
		
		sa1.deposit(101.25);
		
		sa1.deposit(87.68);
		sa1.withdraw(62.93);
		
		
	}
}
