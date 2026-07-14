package com.udemy.devsuperior.estruturacondicional.ifelse;

import java.util.Scanner;

public class NegativoOuNaoNegativo {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		
		if (n >= 0) {
			System.out.println("NAO NEGATIVO");
		} else {
			System.out.println("NEGATIVO");
		}
		
		scanner.close();
		
	}
}
