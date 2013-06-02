package pl.kaczanowscy.tomek.param;

import org.testng.annotations.Test;

import java.util.Calendar;

import static org.testng.Assert.assertEquals;

@Test
public class DateUtilsTest {

	public void secondJuneWasSunday() {
		Calendar cal = Calendar.getInstance();
		cal.set(2013, 5, 2);

		Day day = DateUtils.getDayOfWeek(cal.getTime());

		assertEquals(day, Day.Sunday);
	}

	public void thirdMayWasFriday() {
		Calendar cal = Calendar.getInstance();
		cal.set(2013, 4, 3);

		Day day = DateUtils.getDayOfWeek(cal.getTime());

		assertEquals(day, Day.Friday);
	}

	public void tenthAprilWasWednesday() {
		Calendar cal = Calendar.getInstance();
		cal.set(2013, 3, 10);

		Day day = DateUtils.getDayOfWeek(cal.getTime());

		assertEquals(day, Day.Wednesday);
	}
}
