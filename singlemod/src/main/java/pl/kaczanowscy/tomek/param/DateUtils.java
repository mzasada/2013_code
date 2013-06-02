package pl.kaczanowscy.tomek.param;

import java.util.Calendar;
import java.util.Date;

public class DateUtils {

	public static Day getDayOfWeek(Date date) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		int day = cal.get(Calendar.DAY_OF_WEEK);
		return Day.values()[day - 1];
	}
}
