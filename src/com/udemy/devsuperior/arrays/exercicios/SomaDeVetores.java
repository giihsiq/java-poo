package com.udemy.devsuperior.arrays.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class SomaDeVetores {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int n = scanner.nextInt();
		
		double vetor[] = new double[n];
		int i;
		
		for (i = 0; i < vetor.length; i++) {
			System.out.print("Digite um numero: ");
			vetor[i] = scanner.nextDouble();
		}
		
		System.out.println();
		System.out.print("VALORES = ");
		
		for (i = 0; i < vetor.length; i++) {
			System.out.print(vetor[i] + " ");
		}
		
		double soma = 0.0;
		
		for (i = 0; i < vetor.length; i++) {
			soma += vetor[i];
		}
		
		double media = soma / n;
		
		System.out.println();
		System.out.println("SOMA = " + soma);
		System.out.println("MEDIA = " + media);
		
		scanner.close();
				
		
	}

}
