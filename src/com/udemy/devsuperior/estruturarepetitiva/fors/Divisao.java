package com.udemy.devsuperior.estruturarepetitiva.fors;

import java.util.Scanner;

public class Divisao {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		
		for (int i = 0; i < n; i++) {
			double a = scanner.nextDouble();
			double b = scanner.nextDouble();
			
			double divisao = a / b;
			
			if (b == 0) {
				System.out.println("divisao impossivel");
			} else {
				System.out.println(divisao);
			}
		}
		
		scanner.close();
		
	}

}
