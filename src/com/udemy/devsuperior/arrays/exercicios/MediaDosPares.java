package com.udemy.devsuperior.arrays.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class MediaDosPares {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		double par = 0.0;
		double media = 0.0;
		int npar= 0;
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = scanner.nextInt();
		
		int vetor[] = new int[n];
		int i;
		
		for (i = 0; i < vetor.length; i++) {
			System.out.print("Digite um numero: ");
			vetor[i] = scanner.nextInt();
		}
		
		for (i = 0; i < vetor.length; i++) {
			if (vetor[i] % 2 == 0) {
				par += vetor[i];
				npar++;
			}
		}
		
		System.out.println();
		
		if (par == 0) {
			System.out.println("NENHUM NUMERO PAR");
		} else {
			media = par / npar;
			System.out.printf("MEDIA DOS PARES = %.1f%n", media);
		}
		
		scanner.close();
		
	}

}
