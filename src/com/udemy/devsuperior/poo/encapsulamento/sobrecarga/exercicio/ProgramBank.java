package com.udemy.devsuperior.poo.encapsulamento.sobrecarga.exercicio;

import java.util.Locale;
import java.util.Scanner;

public class ProgramBank {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		Account account;
		
		System.out.print("Enter account number: ");
		int number = scanner.nextInt();
		scanner.nextLine();
		
		System.out.print("Enter account holder: ");
		String name = scanner.nextLine();
		
		char q;
		
		do {
			System.out.print("Is there na initial deposit (y/n)? ");
			q = scanner.next().charAt(0);
		} while (q != 'y' && q != 'n');
		
		if (q == 'y') {
			System.out.print("Enter initial deposit value: ");
			double amount = scanner.nextDouble();
			account = new Account(number, name, amount);
		} else {
			account = new Account(number, name);
		}
		
		System.out.println();
		System.out.println("Account data:");
		System.out.println(account);
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		double amount = scanner.nextDouble();
		account.deposit(amount);
		
		System.out.println();
		System.out.println("Updated data:");
		System.out.println(account);
		
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		amount = scanner.nextDouble();
		account.withdraw(amount);
		
		System.out.println();
		System.out.println("Updated data:");
		System.out.println(account);
		
		scanner.close();
		
	}

}
