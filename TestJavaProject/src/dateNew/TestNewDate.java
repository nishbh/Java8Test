package dateNew;

import java.time.Clock;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class TestNewDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalDate now= LocalDate.of(2014, Month.MARCH, 12);
		LocalDate now2= LocalDate.now();
		Period per= Period.between(now, now2);
		System.out.println(per.getYears());

		
		Instant inst= Instant.now();
		Instant inst2= Instant.now(Clock.systemDefaultZone());
		Duration dur= Duration.between(inst2, inst);
		System.out.println(dur.toDays());
		
		/*
		 * ZoneId zoneId = ZoneId.of("Europe/Paris"); Set<String> allZoneIds =
		 * ZoneId.getAvailableZoneIds(); ZonedDateTime zonedDateTime =
		 * ZonedDateTime.of(localDateTime, zoneId);
		 */
	}

}
