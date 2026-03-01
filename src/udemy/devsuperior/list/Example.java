package udemy.devsuperior.list;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Example {

	public static void main(String[] args) {
		
		// Criando a lista com tipo, instanciando a classe ArrayList()
		List<String> list = new ArrayList<>();
		
		list.add("Giovanna");
		list.add("Alex");
		list.add("Marley");
		list.add("Anne");
		
		// Adicionando o elemento na posição desejada
		list.add(3, "Gabriel");
		
		// Imprime o tamanho da lista
		System.out.println(list.size());
		
		System.out.println();
		
		// laço for each, cria uma variável e armazena o valor de list
		for (String x : list) {
			System.out.println(x);
		}
		
		System.out.println("--------------");
		
		// Remove o elemento fazendo a comparação, removendo caso esse valor exista
		list.remove("Marley");
		
		// Expressão lambda/predicado, remove a letra na posição 0 se for igual a A
		list.removeIf(x -> x.charAt(0) == 'A');
		
		for (String x : list) {
			System.out.println(x);
		}
		System.out.println("--------------");
		
		// list.indexOf = Mostra em qual posição está o elemento indicado
		System.out.println(list.indexOf("Giovanna"));
		System.out.println(list.indexOf("Anne")); // -1 = não existe na lista
		
		System.out.println("--------------");
		
		/* Criando nova lista para consumir a lista antiga
		 * fazendo um stream() para filtar e buscar elementos que comecem com a letra G
		   retornando isso para o collect, para consumir na nova lista e imprimir com o for each */
		List<String> filter = list.stream().filter(x -> x.charAt(0) == 'G').collect(Collectors.toList());
		for (String x : filter) {
			System.out.println(x);
		}
		
		System.out.println("--------------");
		
		// Variavel para buscar na lista o primeiro nome que comece com a letra G, ou nulo caso não exista
		String name = list.stream().filter(x -> x.charAt(0) == 'G').findFirst().orElse(null);
		System.out.println(name);
		
	}

}
