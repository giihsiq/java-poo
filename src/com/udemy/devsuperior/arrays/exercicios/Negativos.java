package com.udemy.devsuperior.arrays.exercicios;

import java.util.Scanner;

public class Negativos {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int n = scanner.nextInt();
		
		if (n <= 10) {
			
			int numeros[] = new int[n];
			int i;
			
			for (i = 0; i < numeros.length; i++) {
				System.out.print("Digite um numero: ");
				numeros[i] = scanner.nextInt();
			}
			
			System.out.println();
			System.out.println("NUMEROS NEGATIVOS:");
			
			for (i = 0; i < numeros.length; i++) {
				if(numeros[i] < 0) {
					System.out.println(numeros[i]);
				}
			}
			
		} else {
			System.out.println("Digite até 10 números.");
		}
		
		scanner.close();
		
	}
}
