package udemy.devsuperior.file.exercicio;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		List<Product> products = new ArrayList<>();
		
		System.out.print("Enter number of items to add a list: ");
		int n = scanner.nextInt();
		
		scanner.nextLine();
		
		for (int i = 0; i < n; i++) {
			
			try {
				
				String product = scanner.nextLine();
				String[] productSplit = product.split(",\\s*");
				
				String name = productSplit[0];
				Double price = Double.parseDouble(productSplit[1]);
				Integer quantity = Integer.parseInt(productSplit[2]);
				
				products.add(new Product(name, price, quantity));
				
			} catch (NumberFormatException e) {
				
				System.out.print("Error: " + e.getMessage());
				
			}
			
		}
		
		String createFile = "C:\\products\\out\\summary.csv";
		
		try (BufferedWriter b = new BufferedWriter(new FileWriter(createFile))){
			
			for (Product p : products) {
				b.write(p.toString());
				b.newLine();
			}
			
		} catch (IOException e) {
			
			System.out.println("Error: " + e.getMessage());
			
		}
		
		scanner.close();
	}

}
