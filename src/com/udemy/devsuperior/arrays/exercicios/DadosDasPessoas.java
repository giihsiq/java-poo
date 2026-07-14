package com.udemy.devsuperior.arrays.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class DadosDasPessoas {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serao digitadas? ");
		int n = scanner.nextInt();
		
		char genero[] = new char[n];
		double altura[] = new double[n];
		double maiorAltura = 0, menorAltura = 0, somaAlturaMulheres = 0, mediaAlturaMulheres = 0;
		int somaHomens = 0, somaMulheres = 0;
		int i;
		
		for(i = 0; i < n; i++) {
			System.out.print("Altura da " + (i + 1) + "a pessoa: ");
			altura[i] = scanner.nextDouble();
			System.out.print("Genero da " + (i + 1) + "a pessoa: ");
			genero[i] = scanner.next().charAt(0);
		}
		
		menorAltura = altura[0];
		
		for(i = 0; i < n; i++) {
			if(altura[i] > maiorAltura) {
				maiorAltura = altura[i];
			}
			if(altura[i] < menorAltura) {
				menorAltura = altura[i];
			}
		}
		
		for(i = 0; i < n; i++) {
			if(genero[i] == 'F') {
				somaAlturaMulheres += altura[i];
				somaMulheres++;
			} else {
				somaHomens++;
			}
		}
		
		mediaAlturaMulheres = somaAlturaMulheres / somaMulheres;
		
		System.out.printf("Menor altura = %.2f%n", menorAltura);
		System.out.printf("Maior altura = %.2f%n", maiorAltura);
		System.out.printf("Media das alturas das mulheres = %.2f%n", mediaAlturaMulheres);
		System.out.println("Numero de homens = " + somaHomens);
		
		scanner.close();
		
		
	}

}
