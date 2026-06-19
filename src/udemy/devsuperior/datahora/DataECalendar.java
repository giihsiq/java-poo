package udemy.devsuperior.datahora;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class DataECalendar {

	public static void main(String[] args) {
		
		// Somando uma unidade de tempo
		System.out.println("Somando uma unidade de tempo: ");

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date date = Date.from(Instant.parse("2026-03-10T15:27:35Z"));
		
		System.out.println(sdf.format(date));
		
		Calendar calendar = Calendar.getInstance();
		
		// Instancia a data a ser manipulada
		calendar.setTime(date);
		calendar.add(Calendar.HOUR_OF_DAY, 4);
		
		// Precisar chamar o método get para imprimir a data com 4 horas a mais
		date = calendar.getTime();

		// Passa o sdf para imprimir no formato definido anteriormente
		System.out.println(sdf.format(date));
		
		System.out.println();
		
		// Obtendo uma unidade de tempo
		System.out.println("Obtendo uma unidade de tempo:");
		
		int minutes = calendar.get(Calendar.MINUTE);
		System.out.println(minutes);
		
		int month = 1 + calendar.get(Calendar.MONTH);
		System.out.println(month);
		
	}

}
