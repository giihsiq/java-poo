package com.udemy.devsuperior.enums.composition.exercicio;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		SimpleDateFormat birthDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat momentDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		System.out.println("Enter cliente data:");
		System.out.print("Name: ");
		String clientName = scanner.next();
		
		System.out.print("Email: ");
		String email = scanner.next();
		
		System.out.print("Birth date (DD/MM/YYYY): ");
		Date birthDate = birthDateFormat.parse(scanner.next());
		
		Client client = new Client(clientName, email, birthDate);
		
		System.out.println();
		
		System.out.println("Enter order data:");
		System.out.print("Status: ");
		String orderStatus = scanner.next();
		
		Date moment = Date.from(Instant.now());
		Order order = new Order(moment, OrderStatus.valueOf(orderStatus), client);
		
		System.out.println();
		
		System.out.print("How many items to this order? ");
		int n = scanner.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.println("Enter #" + i + " item data:");
			System.out.print("Product name: ");
			String productName = scanner.next();
			
			System.out.print("Product price: ");
			Double productPrice = scanner.nextDouble();
			
			System.out.print("Quantity: ");
			int productQuantity = scanner.nextInt();
			
			Product product = new Product(productName, productPrice);
			OrderItem orderItem = new OrderItem(productQuantity, productPrice, product);
			order.addItem(orderItem);
			
		}
		
		System.out.println();
		
		System.out.println("ORDER SUMMARY:");
		System.out.println("Order moment: " + momentDateFormat.format(moment));
		System.out.println("Order status: " + OrderStatus.valueOf(orderStatus));
		System.out.println("Client: " + client);
		System.out.println("Total price: " + order);
		
		scanner.close();
	}

}
