package com.udemy.devsuperior.poo.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ProgramRectangle {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		Rectangle rectangle = new Rectangle();
		
		System.out.println("Enter rectangle width and height:");
		rectangle.width = scanner.nextDouble();
		rectangle.height = scanner.nextDouble();
		
		System.out.println("AREA = " + String.format("%.2f", rectangle.area()));
		System.out.println("PERIMETER = " + String.format("%.2f", rectangle.perimeter()));
		System.out.println("DIAGONAL = " + String.format("%.2f", rectangle.diagonal()));
		
		scanner.close();

	}

}
