package com.udemy.devsuperior.estruturacondicional.ifelse;

import java.util.Locale;
import java.util.Scanner;

public class Eixos {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		double x = scanner.nextDouble();
		double y = scanner.nextDouble();
		
		if (x > 0 && y > 0) {
			System.out.println("Q1");
		} else if (x < 0 && y > 0) {
			System.out.println("Q2");
		} else if (x < 0 && y < 0) {
			System.out.println("Q3");
		} else if (x > 0 && y < 0) {
			System.out.println("Q4");
		} else {
			System.out.println("Origem");
		}
		
		scanner.close();
		
	}

}
