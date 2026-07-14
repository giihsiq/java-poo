package com.udemy.devsuperior.heranca.sobreposicao.polimorfismo.exercicio;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		SimpleDateFormat manufactureDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		
		List<Product> productList = new ArrayList<>();
		
		System.out.print("Enter the number of products: ");
		int n = scanner.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.println("Product #" + i + " data:");
			
			System.out.print("Common, used or imported (c/u/i)? ");
			char c = scanner.next().charAt(0);
			
			if (c == 'i') {
				System.out.print("Name: ");
				String name = scanner.next();
				
				System.out.print("Price: ");
				Double price = scanner.nextDouble();
				
				System.out.print("Customs fee: ");
				Double customsFee = scanner.nextDouble();
				
				ImportedProduct importedProduct = new ImportedProduct(name, price, customsFee);
				productList.add(importedProduct);
				
			} else if (c == 'c') {
				System.out.print("Name: ");
				String name = scanner.next();
				
				System.out.print("Price: ");
				Double price = scanner.nextDouble();
				
				Product product = new Product(name, price);
				productList.add(product);
				
			} else if (c == 'u') {
				System.out.print("Name: ");
				String name = scanner.next();
				
				System.out.print("Price: ");
				Double price = scanner.nextDouble();
				
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				Date manufactureDate = manufactureDateFormat.parse(scanner.next());
				
				UsedProduct usedProduct = new UsedProduct(name, price, manufactureDate);
				productList.add(usedProduct);
				
			}
		}
		
		System.out.println();
		
		System.out.println("PRICE TAGS:");
		
		for (Product p : productList) {
			System.out.println(p);
		}
		
		scanner.close();
	}

}
