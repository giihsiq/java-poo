package com.udemy.devsuperior.arrays.exercicios;

import java.util.Scanner;

public class MaisVelho {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Quantas nome voce vai digitar? ");
		int n = scanner.nextInt();
		
		String nome[] = new String[n];
		String nomeMaisVelho = null;
		int idade[] = new int[n];
		int i;
		int diferenca = 0;
		
		for (i = 0; i < nome.length; i++) {
			System.out.println("Dados da " + (i + 1) + "a pessoa:");
			System.out.print("Nome: ");
			scanner.nextLine();
			nome[i] = scanner.nextLine();
			
			System.out.print("Idade: ");
			idade[i] = scanner.nextInt();
		}
		
		for (i = 0; i < idade.length; i++) {
			if (idade[i] > diferenca) {
				nomeMaisVelho = nome[i];
				diferenca = idade[i];
			}
		}
		
		System.out.println("Pessoa mais velha: " + nomeMaisVelho);
		
		scanner.close();
		
	}

}
