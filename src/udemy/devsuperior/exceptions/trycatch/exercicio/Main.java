package udemy.devsuperior.exceptions.trycatch.exercicio;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		try {

			Locale.setDefault(Locale.US);
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("Enter account data");
			
			System.out.print("Number: ");
			Integer number = scanner.nextInt();
			
			System.out.print("Holder: ");
			scanner.nextLine();
			String holder = scanner.next();
			
			System.out.print("Initial balance: ");
			Double balance = scanner.nextDouble();
			
			System.out.print("Withdraw limit: ");
			Double withdrawLimit = scanner.nextDouble();
			
			Account account = new Account(number, holder, balance, withdrawLimit);
		
			System.out.println();
			
			System.out.print("Enter amount for withdraw: ");
			Double withdraw = scanner.nextDouble();
			account.withdraw(withdraw);
			
			System.out.println("New balance: " + String.format("%.2f", account.getBalance()));
			
			scanner.close();
		}
		
		catch (AccountException e) {
			System.out.println("Withdraw error: " + e.getMessage());
		}
		
		catch (RuntimeException e) {
			System.out.println("Unexpected error, try again");
		}
		
	}

}
