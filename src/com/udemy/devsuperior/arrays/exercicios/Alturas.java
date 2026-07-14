package com.udemy.devsuperior.arrays.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Alturas {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serao digitadas? ");
		int n = scanner.nextInt();
		
		String nome[] = new String[n];
		int idade[] = new int[n];
		double altura[] = new double[n];
		
		int i;
		
		for (i = 0; i < n; i++) {
			System.out.println("Dados da " + (i + 1) + "a pessoa:");
			System.out.print("Nome: ");
			scanner.nextLine();
			nome[i] = scanner.nextLine();
			
			System.out.print("Idade: ");
			idade[i] = scanner.nextInt();
			
			System.out.print("Altura: ");
			altura[i] = scanner.nextDouble();
		}
		
		System.out.println();
		double soma = 0.0;
		
		for (i = 0; i < n; i++) {
			soma += altura[i];
		}
		
		double media = soma / n;
		
		System.out.printf("Altura média: %.2f%n", media);
		
		double porcentagem = 0.0;
		
		for (i = 0; i < n; i++) {
			if (idade[i] < 16) {
				porcentagem++;
			}
		}
		
		double calculoPorcentagem = porcentagem / n * 100;
		System.out.println("Pessoas com menos de 16 anos: " 
		+ String.format("%.1f", calculoPorcentagem)
		+ "%");
		
		for (i = 0; i < n; i++) {
			if (idade[i] < 16) {
				System.out.println(nome[i]);
			}
		}
		
		scanner.close();
		
	}

}
