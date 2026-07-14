package com.udemy.devsuperior.estruturarepetitiva.whiles;

import java.util.Scanner;

public class PostoDeCombustivel {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		
		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;
		
		while (n >= 1 || n <= 4) {
			
			if (n == 1) {
				alcool += 1;
			} else if (n == 2) {
				gasolina += 1;
			} else if (n == 3) {
				diesel += 1;
			} else if (n == 4) {
				System.out.println("MUITO OBRIGADO");
				System.out.println("Alcool: " + alcool);
				System.out.println("Gasolina: " + gasolina);
				System.out.println("Diesel: " + diesel);
			}
			
			n = scanner.nextInt();
		}
		
		scanner.close();
	}
}
