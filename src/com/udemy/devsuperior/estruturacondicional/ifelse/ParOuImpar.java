package com.udemy.devsuperior.estruturacondicional.ifelse;

import java.util.Scanner;

public class ParOuImpar {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		
		if (n % 2 == 0) {
			System.out.println("PAR");
		} else {
			System.out.println("IMPAR");
		}
		
		scanner.close();
		
	}

}
