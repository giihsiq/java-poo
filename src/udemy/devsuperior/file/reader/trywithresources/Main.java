package udemy.devsuperior.file.reader.trywithresources;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {

		String path = "C:\\teste.txt";
		
		// Instancia o BufferedReader e o FileReader já passando o path para leitura
		try (BufferedReader b = new BufferedReader(new FileReader(path))){
			
			String line = b.readLine();
			
			while (line != null) {
				System.out.println(line);
				line = b.readLine();
			}
			
		} catch (IOException e) {
			
			System.out.println("Error: " + e.getMessage());
		
		}
			
	}
}
