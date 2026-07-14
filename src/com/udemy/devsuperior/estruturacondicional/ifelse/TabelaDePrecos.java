package com.udemy.devsuperior.estruturacondicional.ifelse;

import java.util.Locale;
import java.util.Scanner;

public class TabelaDePrecos {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		int codigo = scanner.nextInt();
		int quantidade = scanner.nextInt();
		
		double conta = 0;
		
		if (codigo == 1) {
			conta = quantidade * 4.00;
		} else if (codigo == 2) {
			conta = quantidade * 4.50;
		} else if (codigo == 3) {
			conta = quantidade * 5.00;
		} else if (codigo == 4) {
			conta = quantidade * 2.00;
		} else if (codigo == 5) {
			conta = quantidade * 1.50;
		} else {
			System.out.println("Produto não existe.");
		}
		
		System.out.println("Total: R$ " + String.format("%.2f", conta));
		
		scanner.close();
		
	}

}
