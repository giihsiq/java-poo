package com.udemy.devsuperior.poo.membrosestaticos.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ProgramConverter {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("What is the dollar price? ");
		double dollarPrice = scanner.nextDouble();
		
		System.out.println("How many dollars will be bought? ");
		double dollarBought = scanner.nextDouble();
		
		double result = Converter.converterDollarToReal(dollarBought, dollarPrice);
		
		System.out.println(("Amount to be paid in reais = " + String.format("%.2f", result)));
		
		scanner.close();
		
	}

}
