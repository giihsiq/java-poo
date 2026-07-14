package com.udemy.devsuperior.estruturarepetitiva.fors;

import java.util.Scanner;

public class CasosDeTeste {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		double casoDeTeste = 0;
		double produto = 0;
		double mediaPonderada = 0;
		double a, b, c;
		
		int i = 0;
		int j = 0;
		
		int n = scanner.nextInt();
		
		for(j = 1; j <= n; j++) {
			for (i = 1; i <= 3; i++) {
				casoDeTeste = scanner.nextDouble();
				if (i == 1) {
					a = casoDeTeste * 2;
					produto += a;
				} else if (i == 2) {
					b = casoDeTeste * 3;
					produto += b;
				} else if ( i == 3) {
					c = casoDeTeste * 5;
					produto += c;
				}
			}
			mediaPonderada = produto / 10;
			System.out.println(String.format("%.1f", mediaPonderada));
			produto = 0;
	    }
		
		scanner.close();
		
	}
}
