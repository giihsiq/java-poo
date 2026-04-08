package udemy.devsuperior.generics.set.exercicio;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		Set<Students> students = new HashSet<>();

		System.out.print("How many students for course A? ");
		Integer studentsA = scanner.nextInt();

		for (int i = 0; i < studentsA; i++) {

			Integer studentId = scanner.nextInt();
			students.add(new Students(studentId));

		}
		
		System.out.println();

		System.out.print("How many students for course B? ");
		Integer studentsB = scanner.nextInt();

		for (int i = 0; i < studentsB; i++) {

			Integer studentId = scanner.nextInt();
			students.add(new Students(studentId));

		}
		
		System.out.println();
		
		System.out.print("How many students for course C? ");
		Integer studentsC = scanner.nextInt();

		for (int i = 0; i < studentsC; i++) {

			Integer studentId = scanner.nextInt();
			students.add(new Students(studentId));

		}
		
		System.out.print("Total students: " + students.size());

		scanner.close();
	}

}
