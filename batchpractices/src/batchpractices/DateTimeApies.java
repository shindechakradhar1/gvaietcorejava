package batchpractices;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateTimeApies {

	public static void main(String[] args) {
		
		SimpleDateFormat simpleDate = new SimpleDateFormat("dd.MM.yyyy");
		try {
			Date bDate=simpleDate.parse("01.02.1990");
			System.out.println(bDate.toString());
			
			LocalDateTime lDate = bDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
			
			String Bdate=lDate.format(DateTimeFormatter.ofPattern("dd.MM.yyyy"));
			System.out.println(Bdate);
			
			String day=lDate.getDayOfWeek().toString();
			System.out.println(day);
			
			LocalDate lDate1=LocalDate.parse("01.02.1990", DateTimeFormatter.ofPattern("dd.MM.yyyy"));
			System.out.println(lDate);
			
			
			
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}
