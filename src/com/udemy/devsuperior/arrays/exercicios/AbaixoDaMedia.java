package com.udemy.devsuperior.arrays.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class AbaixoDaMedia {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = scanner.nextInt();
		
		double vetor[] = new double[n];
		int i;
		
		for (i = 0; i < vetor.length; i++) {
			System.out.print("Digite um numero: ");
			vetor[i] = scanner.nextDouble();
		}
		
		double media = 0.0;
		
		for (i = 0; i < n; i++) {
			media += vetor[i];
		}
		
		media = media / n;
		
		System.out.printf("MEDIA DO VETOR = %.3f%n", media);
		System.out.println("ELEMENTOS ABAIXO DA MEDIA:");
		
		for (i = 0; i < n; i++) {
			if (vetor[i] < media) {
				System.out.printf("%.1f", vetor[i]);
			}
		}
		
		scanner.close();
		
	}
}
