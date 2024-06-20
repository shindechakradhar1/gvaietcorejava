package inputouptpackage.util.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateExample {
	public static void main(String[] args) {
//		int[] arr = {5,4,1,3,2};
//		sort(arr);
//		System.out.println(Arrays.toString(arr));
//		
//		int index = binarySearch(arr, 3);
//		System.out.println(index);
		
		Date currentDate = new Date();
		System.out.println(currentDate);
		
		Calendar calendar = Calendar.getInstance();
		calendar.add(calendar.MONTH, 9);
		System.out.println(calendar.getTime().toString());
		
		SimpleDateFormat dateFormat1 = new SimpleDateFormat("dd-MM-yyyy");
		String formatedDate = dateFormat1.format(currentDate);
		System.out.println(formatedDate);
		
		SimpleDateFormat dateFormat2 = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
		formatedDate = dateFormat2.format(currentDate);
		System.out.println(formatedDate);
		
		SimpleDateFormat dateFormat3 = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss a");
		formatedDate = dateFormat3.format(currentDate);
		System.out.println(formatedDate);
		
		
		try {
			String newDate = dateFormat3.format(calendar.getTime());
			Date newDate1 = dateFormat3.parse(newDate);
			System.out.println(newDate1);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.printf("Date is: %1$td-%1$tm-%1$tY %1$tH:%1$tM:%1$tS %1$tp \n", currentDate);
		System.out.printf("CDate is: %1$td-%1$tm-%1$tY %1$tH:%1$tM:%1$tS %1$tp", calendar);
		
	}
}
