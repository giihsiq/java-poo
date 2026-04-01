package udemy.devsuperior.generics.genericosdelimitados;

import java.util.List;

public class CalculationService {
	
	public static <T extends Comparable<T>> T max(List<T> list) {
		if (list.isEmpty()) {
			throw new IllegalStateException("List can't be empty");
		} 
		T max = list.get(0);
		for (T item : list) {
			if (item.compareTo(max) > 0) { //compara se o primeiro elemento passado é maior que o segundo (0)
				max = item;
			}
		}
		return max;
	}

}
