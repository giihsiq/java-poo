package udemy.devsuperior.file.folders;

import java.io.File;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Folder path: ");
		String folderPath = scanner.nextLine();
		
		File path = new File(folderPath);
		
		// Cria um array para registrar as pastas encontradas no path passado na variável folderPath
		File[] folders = path.listFiles(File::isDirectory);
		
		System.out.println();
		System.out.println("Folders:");
		
		for (File folder: folders) {
			System.out.println(folder);
		}
		
		System.out.println();
		System.out.println("Files:");
		
		File[] files = path.listFiles(File::isFile);
		for (File file : files) {
			System.out.println(file);
		}
		
		System.out.println();
		
		// Cria nova pasta e retorna true ou false
		boolean createDirectiory = new File(path + "\\newFolder").mkdir();
		System.out.println("Create new directory? " + createDirectiory);
		
		scanner.close();
		
	}

}
