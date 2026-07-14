package com.udemy.devsuperior.heranca.sobreposicao.polimorfismo.classesabstratas.exercicio;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		List<TaxPayer> taxPayer = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int n = scanner.nextInt();
		
		System.out.println();
		
		for (int i = 1; i <= n; i++) {
			
			System.out.println("Tax payer #" + i + " data: ");
			System.out.print("Individual or company (i/c)? ");
			char c = scanner.next().charAt(0);
			
			if (c == 'i') {
				
				System.out.print("Name: ");
				String name = scanner.next();
				
				System.out.print("Anual income: ");
				Double anualIncome = scanner.nextDouble();
				
				System.out.print("Health expenditures: ");
				Double healthExpenditures = scanner.nextDouble();
				
				taxPayer.add(new Individual(name, anualIncome, healthExpenditures));
				
			} else if (c == 'c') {
				
				System.out.print("Name: ");
				String name = scanner.next();
				
				System.out.print("Anual income: ");
				Double anualIncome = scanner.nextDouble();
				
				System.out.print("Number of employees: ");
				int numberEmployees = scanner.nextInt();
				
				taxPayer.add(new Company(name, anualIncome, numberEmployees));
				
			}
		}
		
		System.out.println();
		
		double sum = 0.0;
		
		System.out.println("TAXES PAID:");
		for (TaxPayer tp : taxPayer) {
			System.out.println(tp);
			
			double tax = tp.tax();
			sum += tax;
		}
		
		System.out.println();
		
		System.out.printf("TOTAL TAXES: $ %.2f%n", sum);
		
		scanner.close();
	}

}
