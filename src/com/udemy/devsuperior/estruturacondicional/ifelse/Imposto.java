package com.udemy.devsuperior.estruturacondicional.ifelse;

import java.util.Locale;
import java.util.Scanner;

public class Imposto {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		double salario = scanner.nextDouble();
		
		if (salario > 0.00 && salario < 2000.00) {
			System.out.println("Isento");
		} else if (salario > 2000.01 && salario < 3000.00) {
			System.out.println("8%");
		} else if (salario > 3000.01 && salario < 4500.00) {
			System.out.println("18%");
		} else if (salario > 4500.00) {
			System.out.println("28%");
		}
		
		scanner.close();
		
	}

}
