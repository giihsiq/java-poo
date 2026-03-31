package udemy.devsuperior.interfaces.exercicio;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class ContractProgram {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);

		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.println("Contract details:");
		System.out.print("Number: ");
		Integer number = scanner.nextInt();
		
		System.out.print("Date (dd/MM/yyyy): ");
		LocalDate date = LocalDate.parse(scanner.next(), dtf);
		
		System.out.print("Contract value: ");
		Double contractValue = scanner.nextDouble();
		
		Contract contract = new Contract(number, date, contractValue);
		
		System.out.print("Number of installment:");
		Integer numberInstallment = scanner.nextInt();
		
		ContractService contractService = new ContractService(new PaypalService());
		contractService.processContract(contract, numberInstallment);
		
		System.out.println();
		
		System.out.println("Installment:");
		for (Installment installments : contract.getInstallment()) {
			System.out.println(installments);
		}

		scanner.close();
	
	}
}
