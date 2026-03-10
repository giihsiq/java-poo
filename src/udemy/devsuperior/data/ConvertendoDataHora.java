package udemy.devsuperior.data;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class ConvertendoDataHora {

	public static void main(String[] args) {
		
		// Converter data-hora global para local
		System.out.println("Data-hora global para local:");
		
		LocalDate d4 = LocalDate.parse("2026-03-10");
		LocalDateTime d5 = LocalDateTime.parse("2026-03-10T02:50:35");
		Instant d6 = Instant.parse("2026-03-10T02:50:35Z");
		
		/* LocalDate recebendo uma data no formato Instant e transformando 
		 * em um pattern no meu horário local, no timezone de Londres */
		LocalDate r1 = LocalDate.ofInstant(d6, ZoneId.systemDefault());
		System.out.println(r1);
		
		LocalDate r2 = LocalDate.ofInstant(d6, ZoneId.of("Portugal"));
		System.out.println(r2);
		
		LocalDateTime r4 = LocalDateTime.ofInstant(d6, ZoneId.systemDefault());
		System.out.println(r4);
		
		LocalDateTime r5 = LocalDateTime.ofInstant(d6, ZoneId.of("Portugal"));
		System.out.println(r5);
		
		System.out.println();
		
		// Obter dados de uma data-hora local
		System.out.println("Obter dados da data-hora local:");
		
		// Obtendo dados de uma data
		System.out.println(d4.getDayOfMonth());
		System.out.println(d4.getDayOfYear());
		System.out.println(d4.getYear());
	}

}
