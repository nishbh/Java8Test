package dateNew;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DifferentTimeZoneEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  DateTimeFormatter format = DateTimeFormatter.ofPattern("HHmm, dd MMM yyyy");

	        LocalDateTime ldt = LocalDateTime.of(2019, Month.MAY, 10, 23, 27);
	        System.out.println("LocalDateTime : " + format.format(ldt));

	        //UTC+8
	        ZonedDateTime klDateTime = ldt.atZone(ZoneId.of("Europe/Paris"));
	        System.out.println("Depart : " + format.format(klDateTime));

	        //UTC+9 and flight duration = 7 hours
	        ZonedDateTime japanDateTime = klDateTime.withZoneSameInstant(ZoneId.of("Asia/Tokyo")).plusHours(7);
	        System.out.println("Arrive : " + format.format(japanDateTime));

	        System.out.println("\n---Detail---");
	        System.out.println("Depart : " + klDateTime);
	        System.out.println("Arrive : " + japanDateTime);
	}

}
