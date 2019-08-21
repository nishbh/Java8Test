package dateNew;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class DifferentTimeZone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		   // LocalDateTime  ldt = LocalDateTime.of(2014, Month.JUNE,  21,   16,   30);
		    Instant nowUtc = Instant.now();

		    ZoneId  usCentral = ZoneId.of("America/Chicago"); 
		    ZonedDateTime zdt   = ZonedDateTime.ofInstant(nowUtc, usCentral); 
		    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
		    String formattedString = zdt.format(formatter);
		    System.out.println("In US  Central Time Zone:"  + formattedString);

		    ZoneId  losAngeles = ZoneId.of("America/Los_Angeles"); 
		    ZonedDateTime zdt2   = zdt.withZoneSameInstant(losAngeles); 
		    System.out.println("In  America/Los_Angeles Time Zone:"  + zdt2);
		    
		    ZonedDateTime zoneDate= ZonedDateTime.now();
		    System.out.println(" zone date time is "  + zoneDate);
		    
		    Calendar calendarFromZonedDateTime = GregorianCalendar.from(zoneDate);
		    //calendarFromZonedDateTime.set
		    //calendarFromZonedDateTime.setT
		    
		    System.out.println(" Calendar  "  + calendarFromZonedDateTime);

	}

}
