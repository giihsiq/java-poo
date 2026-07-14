package com.udemy.devsuperior.estruturacondicional.ifelse;

import java.util.Scanner;

public class DuracaoDoJogo {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int inicioDoJogo = scanner.nextInt();
		int finalDoJogo = scanner.nextInt();
		int duracao;
		
		if (inicioDoJogo < finalDoJogo) {
			duracao = finalDoJogo - inicioDoJogo;
		} else {
			duracao = 24 - inicioDoJogo + finalDoJogo;
		}
		
		System.out.println("O jogo durou " + duracao + " hora(s).");
		
		scanner.close();
		
	}

}
