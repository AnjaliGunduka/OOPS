package TimeZoneOffsets;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Example1 {

	
	public static void main(String[] args)
	{
		LocalDate l=LocalDate.now();
		LocalDate minusDays = l.minusDays(1);
		LocalDate plusDays = l.plusDays(1);
	
		System.out.println(l);
		System.out.println("yesterday Date"+minusDays);
		System.out.println("Tommorow Date"+plusDays);
		
		String format = l.format(DateTimeFormatter.ISO_DATE);		
		System.out.println(format);

	}
}
