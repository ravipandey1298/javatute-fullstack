package datetime.api;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class LocalDateTest {
	public static void main(String[] args) {
		LocalDate today = LocalDate.now(); // now() returns the current date from system clock
		System.out.println(today); // output will be today's date
				
		LocalDate dateObj = LocalDate.of(1997, 8, 29); // of() returns the instance of LocalDate 
		                                               //with specified arguements
		System.out.println(dateObj); // output : 1997-08-29
		
		
		
		LocalDate dateObj1 = LocalDate.of(1997, 8, 29);
		
		DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yy"); //ofPattern() creates a formatter using the specified pattern.
				
		System.out.println(df.format(dateObj1)); //output 29/08/97
		
		
		LocalDate newDate = LocalDate.now();
		newDate = newDate.plusDays(34); 
		System.out.println(newDate);   // 2020-04-09
				
		newDate = newDate.plusYears(45); // 2065-04-09
				
		newDate = newDate.minusWeeks(87); // 2063-08-09
		
		
		LocalDate today1 = LocalDate.now();
		LocalDate newDateObj = today1.minusWeeks(39);
		System.out.println(ChronoUnit.DAYS.between(newDateObj,today));  //273
		//between() calculates the amount of time between specified date objects
		System.out.println(ChronoUnit.MONTHS.between(newDateObj,today)); //8
		//compareTo() compares this date with specified date
		System.out.println(newDateObj.compareTo(today)); //-1 

		
	}
}
