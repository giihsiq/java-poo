package com.udemy.devsuperior.arrays.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class MaiorValor {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int n = scanner.nextInt();
		
		double valores[] = new double[n];
		int i;
		
		for (i = 0; i < valores.length; i++) {
			System.out.print("Digite um numero: ");
			valores[i] = scanner.nextDouble();
		}
		
		double maiorValor = valores[0];
		int posicao = 0;
		
		for (i = 0; i < n; i++) {
			if (valores[i] > maiorValor) {
				maiorValor = valores[i];
				posicao = i;
			}
		}
		
		System.out.println();
		System.out.println("MAIOR VALOR = " + String.format("%.1f", maiorValor));
		System.out.println("POSICAO DO MAIOR VALOR = " + posicao);
		
		scanner.close();
		
	}

}
