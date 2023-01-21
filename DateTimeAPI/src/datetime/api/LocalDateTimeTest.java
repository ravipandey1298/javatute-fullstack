package datetime.api;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeTest {
	public static void main(String[] args) {
		LocalDateTime currentDate = LocalDateTime.now();
		System.out.println(currentDate); // output in default format eg. 2020-03-06T16:25:10.257251100
				
		System.out.println(currentDate.getDayOfWeek()); // will give today's day eg. FRIDAY

		
		LocalDateTime currentDate1 = LocalDateTime.now();
		System.out.println(currentDate1);
				
		DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy/ hh:mm:ss a");  // a is used to display 12 hr clock
		System.out.println(df.format(currentDate1)); //output in specified format eg. 06/03/2020/ 04:32:35 PM
		
		
		
		DateTimeFormatter df2 = DateTimeFormatter.ofPattern("eeee dd/MM/yyyy/ hh:mm:ss a");
		System.out.println(df2.format(currentDate)); 
		//output :- Friday 06/03/2020/ 04:50:54 PM
				
		DateTimeFormatter dfNew = DateTimeFormatter.ofPattern("eee dd/MM/yyyy/ hh:mm:ss a");
		System.out.println(df.format(currentDate));
		//output :- Fri 06/03/2020/ 04:50:54 PM

		/*
		"eee” – Displays starting three letters of Day of the week such as “Mon”, “Tue”, etc.
		“eeee” – Displays the full name of the Day of the week such as “Monday”, “Tuesday” etc.
		*/
	}
}
