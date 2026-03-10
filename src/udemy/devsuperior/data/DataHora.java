package udemy.devsuperior.data;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DataHora {

	public static void main(String[] args) {

		// .toString() está sendo chamado de cada Objeto
		// Instant = precisa formatar especificando o fuso horário
		
		// Instanciação
		System.out.println("Instanciação:");
		
		// Data-hora (agora)
		LocalDate d1 = LocalDate.now();
		System.out.println(d1);
		
		LocalDateTime d2 = LocalDateTime.now();
		System.out.println(d2);
		
		Instant d3 = Instant.now();
		System.out.println(d3);
		
		// ISO 8601
		LocalDate d4 = LocalDate.parse("2026-03-10");
		System.out.println(d4);
		
		LocalDateTime d5 = LocalDateTime.parse("2026-03-10T02:50:35");
		System.out.println(d5);
		
		Instant d6 = Instant.parse("2026-03-10T02:50:35Z"); // Horário de londres
		System.out.println(d6);
		
		Instant d7 = Instant.parse("2026-03-10T02:50:35-03:00"); // Adicionando fuso horário
		System.out.println(d7);
		
		LocalDate d8 = LocalDate.of(2026, 3, 10);
		System.out.println(d8);
		
		LocalDateTime d9 = LocalDateTime.of(2026, 3, 10, 03, 55);
		System.out.println(d9);
		
		System.out.println();
		
		// Formatação
		System.out.println("Formatação:");
		
		// Data personalizada
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate d10 = LocalDate.parse("10/03/2026", fmt1); // LocalDateTime aceita sobrecarga de método, para específicar o tipo de data a ser armazenado.
		System.out.println(d10);
		
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		LocalDateTime d11 = LocalDateTime.parse("10/03/2026 03:25", fmt2); // Pode passar o pattern como argumento
		System.out.println(d11);
		
		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
		System.out.println(d5.format(fmt3));
		
		DateTimeFormatter fmt4 = DateTimeFormatter.ISO_INSTANT;
		Instant d12 = Instant.parse("2026-03-10T02:50:35Z");
		System.out.println(fmt4.format(d12));
	}

}
