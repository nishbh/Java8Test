package dateNew;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;

public class ConvertUtilDateToZonedDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	

			    System.out.println(toZonedDateTime(new Date()));
			  }

			  public static ZonedDateTime toZonedDateTime(Date utilDate) {
			    if (utilDate == null) {
			      return null;
			    }
			    final ZoneId systemDefault = ZoneId.of("Europe/Berlin");//systemDefault();
			    return ZonedDateTime.ofInstant(utilDate.toInstant(), systemDefault);
			  
	}

}
