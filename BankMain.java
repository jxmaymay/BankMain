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
		int param1;
		double param2;
		Scanner scnr = new Scanner(System.in);
		System.out.println("Welcome to the bank terminal.");
		System.out.println("----------------");
		
		boolean q = true;
		boolean adv = false;
		while (adv == false) {
			System.out.println("A)dd Account   R)emove Account   C)ontinue to console");
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
			
			if (in.equals("C") || in.equals("c")) {
				q = false;
				adv = true;
			}
		}
		while (q == false) {
			System.out.println("W)ithdraw   D)eposit   M)onth End   Q)uit");
			System.out.println("");
			in = scnr.next();
			
			if (in.equals("W") || in.equals("w")) {
				System.out.println("Querry Acc #: ");
				System.out.println("");
				param1 = scnr.nextInt();
				System.out.println("How much to withdraw? ");
				System.out.println("");
				param2 = scnr.nextDouble();
				accountList.get(param1).withdraw(param2);
			}
			
			if (in.equals("D") || in.equals("d")) {
				System.out.println("How much to deposit? ");
				System.out.println("");
				param2 = scnr.nextDouble();
				for (Account personInArrayList: accountList) {
					personInArrayList.deposit(param2);
			   }
			}
			
            if (in.equals("M") || in.equals("m")) {
				
				System.out.println("Ending account month... ");
				System.out.println("");
				
				for (Account personInArrayList: accountList) {
					personInArrayList.monthEnd();
		       }
			}
            
            if (in.equals("L") || in.equals("l")) {
				
				System.out.println("Displaying accountList... ");
				System.out.println("");
				
				for (Account personInArrayList: accountList) {
					personInArrayList.displayBal();
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
