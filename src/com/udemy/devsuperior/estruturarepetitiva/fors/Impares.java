package com.udemy.devsuperior.estruturarepetitiva.fors;

import java.util.Scanner;

public class Impares {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int x = scanner.nextInt();
		
		if (1 < x && x <= 100) {
			for (int i = 1; i <= x; i++) {
				if (i % 2 != 0) {
					System.out.println(i);
				}
			}
		}
		
		scanner.close();
		
	}

}
