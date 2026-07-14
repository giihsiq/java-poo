package com.udemy.devsuperior.poo.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ProgramNotas {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		Notas notas = new Notas();
		
		notas.name = scanner.nextLine();
		notas.n1 = scanner.nextDouble();
		notas.n2 = scanner.nextDouble();
		notas.n3 = scanner.nextDouble();
		
		System.out.println("FINAL GRADE = " + String.format("%.2f", notas.media()));
		
		if (notas.media() >= 60) {
			System.out.println("PASS");
		} else {
			System.out.println("FAILED");
			System.out.println("MISSING " + String.format("%.2f", 60 - notas.media()) + " POINTS");
		}
		
		
		scanner.close();
		
	}

}
