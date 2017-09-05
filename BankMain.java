import java.util.*;

/**
 * Main bank operation.
 * @author Mason Jenkins
 */

public class BankMain {

	public static void main(String[] args) {
		SavingsAccount sa1 = new SavingsAccount(1, 0.0);
		String in;
		double param;
		Scanner scnr = new Scanner(System.in);
		System.out.println("Welcome to the bank terminal.");
		System.out.println("----------------");
		
		boolean q = false;
		while (q == false) {
			System.out.println("W)ithdraw   D)eposit   M)onth   Q)uit");
			System.out.println("");
			in = scnr.next();
			if (in.equals("W") || in.equals("w")) {
				System.out.println("How much to withdraw? ");
				System.out.println("");
				param = scnr.nextDouble();
				sa1.withdraw(param);
			}
			
			if (in.equals("D") || in.equals("d")) {
				System.out.println("How much to deposit? ");
				System.out.println("");
				param = scnr.nextDouble();
				sa1.deposit(param);
			}
			
			if (in.equals("Q") || in.equals("q")) {
				System.out.println("ENDING SESSION");
				q = true;
			
			if (in.equals("M") || in.equals("m")) {
				System.out.println("Ending account month... ");
				System.out.println("");
				sa1.monthEnd();
			}
		}
		//ArrayList<Account> accountList = new ArrayList<Account>();
		//for (Account personInArrayList: accountList) {
			//System.out.println(personInArrayList.getBalance() + "\n");
	//}
	}
  }
}
