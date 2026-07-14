package com.udemy.devsuperior.arrays.exercicios;

import java.util.Scanner;

public class SomaDeVetoresAB {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Quantos valores vai ter cada vetor? ");
		int n = scanner.nextInt();
		
		int vetorA[] = new int[n];
		int vetorB[] = new int[n];
		int i;
		
		System.out.println("Digite os valores do vetor A:");
		for (i = 0; i < vetorA.length; i++) {
			vetorA[i] = scanner.nextInt();
		}
		
		System.out.println("Digite os valores do vetor B:");
		for (i = 0; i < vetorB.length; i++) {
			vetorB[i] = scanner.nextInt();
		}
		
		int somaVetores[] = new int[n];
		
		System.out.println();
		System.out.println("VETOR RESULTANTE: ");
		for (i = 0; i < somaVetores.length; i++) {
			somaVetores[i] = vetorA[i] + vetorB[i];
			System.out.println(somaVetores[i]);
		}
		
		scanner.close();
		
	}

}
