package com.udemy.devsuperior.estruturarepetitiva.fors;

import java.util.Scanner;

public class QuadradoECubo {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		int quadrado, cubo;
		
		for (int i = 1; i <= n; i++) {
			quadrado = i * i;
			cubo = i * i * i;
			System.out.println(i + " " + quadrado  + " " + cubo);
		}
		
		scanner.close();
		
	}
}
