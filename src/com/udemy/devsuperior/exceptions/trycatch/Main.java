package com.udemy.devsuperior.exceptions.trycatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		/*
		 * try = roda o código normalmente
		 * catch = roda uma mensagem personalizada tratando a classe de erro exibida no console
		 */
		
		try {
			String vetor[] = scanner.next().split(" ");
			int n = scanner.nextInt();
			System.out.println(vetor[n]);
		}
		catch (ArrayIndexOutOfBoundsException a) {
			System.out.println("Invalid position.");
		}
		catch (InputMismatchException i) {
			System.out.println("Input error.");
		}
		
		System.out.println("Bye!");
		
		scanner.close();
		
	}

}
