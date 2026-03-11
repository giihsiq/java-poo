package udemy.devsuperior.enums.exercicioresolvido.worker;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Enter department's name: ");
		String departmentName = scanner.next();
		
		System.out.println("Enter worker data:");
		System.out.print("Name: ");
		String name = scanner.next();
		
		System.out.print("Level: ");
		String workerLevel = scanner.next();
		
		System.out.print("Base salary: ");
		Double baseSalary = scanner.nextDouble();
		
		Worker worker = new Worker(name, WorkerLevel.valueOf(workerLevel), baseSalary, new Department(departmentName));
		
		System.out.print("How many contracts to this worker? ");
		int contracts = scanner.nextInt();
		
		for (int i = 1; i <= contracts; i++) {
			System.out.println("Enter contract #" + i + " data:");
			System.out.print("Date (DD/MM/YYYY): ");
			Date contractDate = simpleDateFormat.parse(scanner.next());
			
			System.out.print("Value per hour: ");
			Double valuePerHour = scanner.nextDouble();
			
			System.out.print("Duration (hours): ");
			int hours = scanner.nextInt();
			
			HourContract hourContract = new HourContract(contractDate, valuePerHour, hours);
			worker.addContract(hourContract);
			
		}
		
		System.out.print("Enter month and year to calculate income (MM/YYYY): ");
		String monthAndYear = scanner.next();
		int month = Integer.parseInt(monthAndYear.substring(0, 2));
		int year = Integer.parseInt(monthAndYear.substring(3));
		
		System.out.println("Name: " + worker.getName());
		System.out.println("Department: " + worker.getDepartament().getName());
		System.out.println("Income for " + monthAndYear + ": " + worker.income(month, year));
		
		scanner.close();
	}

}
