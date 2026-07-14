package com.udemy.devsuperior.estruturarepetitiva.fors;

import java.util.Scanner;

public class Fatorial {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		int fatorial = 1;
		
		for (int i = 1; i <= n; i++) {
			fatorial *= i;
		}
		
		System.out.println(fatorial);
		
		if (n == 0) {
			n = 1;
			System.out.println(n);
		}
		
		scanner.close();
		
	}
}
