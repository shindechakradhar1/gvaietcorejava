package batchpractices;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DateTimeAPI {

	public static void main(String[] args) {
		LocalDate localdate=LocalDate.now();
		System.out.println(localdate);
		
		int day=localdate.getDayOfYear();
		System.out.println(day);
		
		SimpleDateFormat simpleDate = new SimpleDateFormat("dd-MM-yy");
		
		LocalDate finalDate=LocalDate.parse("1990-02-01");
		
		
		Period p=Period.between(localdate, finalDate);
		System.out.println(p.getYears());
		System.out.println(p.getMonths());
		System.out.println(p.getDays());
		
		LocalDate localDate3=localdate.plus(2,ChronoUnit.DAYS);
		System.out.println(localDate3);
		
		LocalDateTime usaDateTime = LocalDateTime.now(ZoneId.of("America/Sao_Paulo"));
		System.out.println(usaDateTime);
		
		LocalDateTime indianDateTime = LocalDateTime.now();
		
//		Period.between(indianDateTime, usaDateTime);
		
		int time=indianDateTime.compareTo(usaDateTime);
		System.out.println(time);
		
		indianDateTime.toLocalDate();
	}
}
