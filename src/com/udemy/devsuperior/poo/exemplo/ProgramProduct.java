package com.udemy.devsuperior.poo.exemplo;

import java.util.Locale;
import java.util.Scanner;

public class ProgramProduct {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter product data:");
		System.out.print("Name: ");
		String name = scanner.nextLine();
		
		System.out.print("Price: ");
		double price = scanner.nextDouble();
		
		System.out.print("Quantity: ");
		int quantity = scanner.nextInt();
		
		// Iniciando o construtor da classe Product
		Product product = new Product(name, price, quantity);
		
		System.out.println();
		System.out.println("product data " + product);
		
		System.out.println();
		System.out.print("Enter the number of product to be added in stock: ");
		quantity = scanner.nextInt();
		product.addProducts(quantity);
		
		System.out.println();
		System.out.println("Updated data " + product);
		
		System.out.println();
		System.out.print("Enter the number of product to be removed in stock: ");
		quantity = scanner.nextInt();
		product.removeProducts(quantity);
		
		System.out.println();
		System.out.println("Udapted data " + product);
		
		scanner.close();
		
	}

}
