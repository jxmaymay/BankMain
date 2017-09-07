import java.util.*;

/**
 * Main bank operation.
 * @author Mason Jenkins
 */

public class BankMain {

	public static void main(String[] args) {
		
		ArrayList<Account> accountList = new ArrayList<Account>();
		SavingsAccount sa1 = new SavingsAccount(1, 0.0);
		accountList.add(sa1);
		Account ca1 = new Account(2, 0.0);
		accountList.add(ca1);
		String in;
		double param;
		Scanner scnr = new Scanner(System.in);
		System.out.println("Welcome to the bank terminal.");
		System.out.println("----------------");
		
		boolean q = false;
		while (q == false) {
			System.out.println(" A)dd Account   W)ithdraw   D)eposit   M)onth End   Q)uit");
			System.out.println("");
			in = scnr.next();
			
			if (in.equals("A") || in.equals("a")) {
				System.out.println("----------------");
				System.out.println(" C)eckings   S)savings");
				System.out.println("");
				in = scnr.next();
				if (in.equals("C") || in.equals("c")) {
					Account newAcc = new Account(accountList.size() + 1, 0.0);
					accountList.add(newAcc);
				}
				if (in.equals("S") || in.equals("s")) {
					SavingsAccount newAcc = new SavingsAccount(accountList.size() + 1, 0.0);
					accountList.add(newAcc);
				}
			}
			if (in.equals("W") || in.equals("w")) {
				System.out.println("How much to withdraw? ");
				System.out.println("");
				param = scnr.nextDouble();
				for (Account personInArrayList: accountList) {
					personInArrayList.withdraw(param);
			   }
			}
			
			if (in.equals("D") || in.equals("d")) {
				System.out.println("How much to deposit? ");
				System.out.println("");
				param = scnr.nextDouble();
				for (Account personInArrayList: accountList) {
					personInArrayList.deposit(param);
			   }
			}
			
            if (in.equals("M") || in.equals("m")) {
				
				System.out.println("Ending account month... ");
				System.out.println("");
				
				for (Account personInArrayList: accountList) {
					personInArrayList.monthEnd();
		       }
			}
			
			if (in.equals("Q") || in.equals("q")) {
				System.out.println("ENDING SESSION");
				q = true;
				scnr.close();
				
			   }
			}
		}
	}
