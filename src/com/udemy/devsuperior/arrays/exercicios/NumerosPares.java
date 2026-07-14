package com.udemy.devsuperior.arrays.exercicios;

import java.util.Scanner;

public class NumerosPares {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int n = scanner.nextInt();
		
		int numeros[] = new int[n];
		int i;
		
		for (i = 0; i < numeros.length; i++) {
			System.out.print("Digite um numero: ");
			numeros[i] = scanner.nextInt();
		}
		
		System.out.println();
		System.out.print("NUMEROS PARES = ");
		
		int pares = 0;
		
		for (i = 0; i < numeros.length; i++) {
			if(numeros[i] % 2 == 0) {
				pares++;
				System.out.print(numeros[i] + " ");
			}
		}
		
		System.out.println();
		System.out.println("QUANTIDADE DE PARES = " + pares);
		
		scanner.close();
		
	}

}
