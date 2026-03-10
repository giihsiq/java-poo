package udemy.devsuperior.data;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class CalculosDataHora {

	public static void main(String[] args) {
		
		// Data-hora - tempo
		System.out.println("Data-hora - tempo:");

		LocalDate d4 = LocalDate.parse("2026-03-10");
		
		LocalDate pastWeekLocalDate = d4.minusDays(7);
		System.out.println(pastWeekLocalDate);
		
		LocalDate nextWeekLocalDate = d4.plusDays(7);
		System.out.println(nextWeekLocalDate);
		
		System.out.println();
		
		LocalDateTime d5 = LocalDateTime.parse("2026-03-10T02:50:35");
		
		LocalDateTime pastWeekLocalDateTime = d5.minusDays(7);
		System.out.println(pastWeekLocalDateTime);
		
		LocalDateTime nextWeekLocalDateTime = d5.plusDays(7);
		System.out.println(nextWeekLocalDateTime);
		
		System.out.println();
		
		Instant d6 = Instant.parse("2026-03-10T02:50:35Z");
		
		Instant pastWeekInstant = d6.minus(7, ChronoUnit.DAYS);
		System.out.println(pastWeekInstant);
		
		Instant nextWeekInstant = d6.plus(7, ChronoUnit.DAYS);
		System.out.println(nextWeekInstant);
		
		System.out.println();
		
		// Data-hora - duração
		System.out.println("Data-hora - duração:");
		
		Duration t1 = Duration.between(pastWeekLocalDateTime, d5);
		System.out.println(t1.toDays());
		
		// Convertendo LocalDate para LocalDateTime, para ter o tempo em horas, minutos e segundos
		Duration t2 = Duration.between(pastWeekLocalDate.atStartOfDay(), d4.atStartOfDay());
		System.out.println(t2.toDays());
		
		Duration t3 = Duration.between(pastWeekInstant, d6);
		System.out.println(d6);
	}

}
