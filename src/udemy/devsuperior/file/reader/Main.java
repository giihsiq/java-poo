package udemy.devsuperior.file.reader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {

		String path = "C:\\teste.txt";
		
		FileReader f = null;
		BufferedReader b = null;
		
		try {
			
			f = new FileReader(path);
			b = new BufferedReader(f); // Instancia o file reader e deixa a leitura mais rápida
			
			String line = b.readLine();
			
			while (line != null) {
				System.out.println(line);
				line = b.readLine();
			}
			
		} catch (IOException e) {
			
			System.out.println("Error: " + e.getMessage());
		
		// para fechar as streams
		} finally {
			// Pode ocorrer uma exception, assim tendo que iniciar um novo bloco try para ler a stack trace
			try {
				
				if (b != null) {
					b.close();
				}
				
				if (f != null) {
					f.close();
				}
				
			} catch (IOException e) {
				
				e.printStackTrace();
				
			}
			
		}
	}

}
