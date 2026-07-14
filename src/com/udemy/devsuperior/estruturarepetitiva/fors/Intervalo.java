package com.udemy.devsuperior.estruturarepetitiva.fors;

import java.util.Scanner;

public class Intervalo {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int x = 0;
		int in = 0;
		int out = 0;
		
		int n = scanner.nextInt();
		
		for (int i = 1; i <= n; i++) {
			x = scanner.nextInt();
			if (x >= 10 && x <= 20) {
				in += 1;
			} else {
				out += 1;
			}
		}
		
		System.out.println(in + " in");
		System.out.println(out + " out");
		
		scanner.close();
		
	}

}
