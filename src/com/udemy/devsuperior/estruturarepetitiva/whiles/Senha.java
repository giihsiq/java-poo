package com.udemy.devsuperior.estruturarepetitiva.whiles;

import java.util.Scanner;

public class Senha {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int senhaCorreta = 2002;
		int senhaInserida = scanner.nextInt();
		
		while (senhaInserida != senhaCorreta) {
			System.out.println("Senha Invalida");
			senhaInserida = scanner.nextInt();
		}
		
		System.out.println("Acesso Permitido");
		
		scanner.close();
		
	}

}
