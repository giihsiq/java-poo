package udemy.devsuperior.interfaces.exercicioresolvido;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		System.out.println("Enter the rental details");
		
		System.out.print("Car Model: ");
		String carModel = scanner.nextLine();
		
		System.out.print("Start (dd/MM/yyyy hh:mm): ");
		LocalDateTime start = LocalDateTime.parse(scanner.nextLine(), dtf);
		
		System.out.print("Finish (dd/MM/yyyy hh:mm): ");
		LocalDateTime finish = LocalDateTime.parse(scanner.nextLine(), dtf);
		
		CarRental carRental = new CarRental(start, finish, new Vehicle(carModel));
		
		System.out.print("Price per hour: ");
		Double pricePerHour = scanner.nextDouble();
		
		System.out.print("Price per day: ");
		Double pricePerDay = scanner.nextDouble();
		
		RentalService rentalService = new RentalService(pricePerHour, pricePerDay, new BrazilTaxService());
		rentalService.processInvoice(carRental);
		
		System.out.println();
		System.out.println("Invoice:");
		
		System.out.println("Basic payment: " + String.format("%.2f", carRental.getInvoice().getBasicPayment()));
		System.out.println("Tax: " + String.format("%.2f", carRental.getInvoice().getTax()));
		System.out.println("Total payment: " + String.format("%.2f", carRental.getInvoice().getTotalPayment()));
		
		scanner.close();
		
	}

}
