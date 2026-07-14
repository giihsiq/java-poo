package com.udemy.devsuperior.arrays.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Aprovados {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Quantos alunos serao digitados? ");
		int n = scanner.nextInt();
		
		String nome[] = new String[n];
		double nota1[] = new double[n];
		double nota2[] = new double[n];
		double calculoDasNotas = 0.0;
		int i;
		
		for (i = 0; i < n; i++) {
			System.out.println("Digite nome, primeira e segunda nota do " + (i + 1) + "o aluno:");
			scanner.nextLine();
			nome[i] = scanner.nextLine();
			nota1[i] = scanner.nextDouble();
			nota2[i] = scanner.nextDouble();
		}
		
		System.out.println("Alunos aprovados:");
		
		for (i = 0; i < n; i++) {
			calculoDasNotas = nota1[i] + nota2[i] / 2;
			if (calculoDasNotas >= 6) {
				System.out.println(nome[i]);
			}
		}
		
		scanner.close();
		
	}

}
