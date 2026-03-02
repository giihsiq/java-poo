package udemy.devsuperior.list.exercicio;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ProgramEmployee {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		int i;
		
		System.out.print("How many employees will be registered? ");
		int n = scanner.nextInt();
		
		List<Employee> register = new ArrayList<>();
		
		for (i = 0; i < n; i++) {
			System.out.println("Emplyoee #" + (i + 1));
			System.out.print("Id: ");
			Integer id = scanner.nextInt();
			/* Método estático hasId fazendo a validação para buscar se o id digitado já existe ou não */
			while (hasId(register, id)) {
				System.out.println("Id already taken, try again: ");
				System.out.print("Id: ");
				id = scanner.nextInt();
			}
			
			System.out.print("Name: ");
			scanner.nextLine();
			String name = scanner.next();
			
			System.out.print("Salary: ");
			Double salary = scanner.nextDouble();
			
			Employee employee = new Employee(id, name, salary);
			register.add(employee);
		}
		
		System.out.print("Enter the employee id that will have salary increase: ");
		int id = scanner.nextInt();
		Employee employee = register.stream().filter(x -> x.getId() == id).findAny().orElse(null);
		if (employee != null) {
			System.out.print("Enter the percentage: ");
			double percentage = scanner.nextDouble();
			employee.increaseSalary(percentage);
		} else {
			System.out.println("This id does not exist!");
		}
		
		System.out.println();
		System.out.println("List of employees:");
		for (Employee emp : register) {
			System.out.println(emp);
		}
		
		scanner.close();
	}
	
	public static boolean hasId(List<Employee> register, int id) {
		Employee employee = register.stream().filter(x -> x.getId() == id).findAny().orElse(null);
		return employee != null;
	}

}
