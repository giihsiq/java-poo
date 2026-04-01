package udemy.devsuperior.generics.curinga;

import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<Integer> myInts = Arrays.asList(5, 2, 10);
		printList(myInts);
	}

	public static void printList(List<?> list) { // <?> = tipo coringa, é o supertipo e pode armazenar qualquer tipo de dado
		
		for (Object obj : list) {
			System.out.println(obj);
		}
		
//		list.add(3) não pode ser executado - o compilador não sabe qual é o tipo da lista.

	}

}
