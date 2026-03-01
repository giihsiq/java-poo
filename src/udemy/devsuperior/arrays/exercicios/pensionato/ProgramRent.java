package udemy.devsuperior.arrays.exercicios.pensionato;

import java.util.Scanner;

public class ProgramRent {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		Rent[] array = new Rent[10];
		
		int i;
		
		System.out.print("How many rooms will be rented? ");
		int n = scanner.nextInt();
		
		for(i = 1; i <= n; i++) {
			System.out.println("Rent #" + i);
			System.out.print("Name: ");
			scanner.nextLine();
			String name = scanner.nextLine();
			
			System.out.print("Email: ");
			String email = scanner.next(); // não pode ter espaço em branco
			
			System.out.print("Room: ");
			int roomNumber = scanner.nextInt();
			array[roomNumber] = new Rent(name, email);
			
		}
		
		System.out.println();
		System.out.println("Busy rooms:");
		for(i = 0; i < 10; i++) {
			if(array[i] != null) {
				System.out.println(i + ": " + array[i]);
			}
		}
		
		scanner.close();
		
	}
}
