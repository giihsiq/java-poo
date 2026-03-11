package udemy.devsuperior.enums.composition;

import java.util.Date;
import java.util.Scanner;

public class ProgramOrder {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		Order order = new Order(1000, new Date(), OrderStatus.PROCESSING);
		
		System.out.println(order);
		
		scanner.close();
	}

}
