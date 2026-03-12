package udemy.devsuperior.heranca.sobreposicao.polimorfismo;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		List<Employee> employeeList = new ArrayList<>();
		
		System.out.print("Enter the number of employees: ");
		int n = scanner.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.println("Employee #" + i + " data:");
			System.out.print("Outsourced (y/n)? ");
			char c = scanner.next().charAt(0);
			
			System.out.print("Name: ");
			scanner.nextLine();
			String name = scanner.next();
			
			System.out.print("Hours: ");
			Integer hours = scanner.nextInt();
			
			System.out.print("Value per hour: ");
			Double valuePerHour = scanner.nextDouble();
			
			if (c == 'y') {
				System.out.print("Additional charge: ");
				Double additionalCharge = scanner.nextDouble();
				
				Employee employee = new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge);
				employeeList.add(employee);
				
			} else {
				
				Employee employee = new Employee(name, hours, valuePerHour);
				employeeList.add(employee);
				
			}
		}
		
		System.out.println();
		System.out.println("PAYMENTS:");
		
		for (Employee e : employeeList) {
			System.out.println(e.getName() + " - $ " + String.format("%.2f", e.payment()));
		}
		
		scanner.close();
	}

}
