package udemy.devsuperior.file.writer;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {

		String[] lines = new String[] {"Hello", "World!"};
		
		String path = "C:\\new.txt";
		
		// true adiciona novas linhas sem apagar/recriar conteúdo contido
		try (BufferedWriter b = new BufferedWriter(new FileWriter(path, true))) {
			
			for (String line : lines) {
				b.write(line);
				b.newLine();
			}
			
		} catch (IOException e) {
			
			e.printStackTrace();
			
		}
	}

}
