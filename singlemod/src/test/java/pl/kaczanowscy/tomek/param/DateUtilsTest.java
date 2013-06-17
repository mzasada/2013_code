package pl.kaczanowscy.tomek.param;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

@Test
public class DateUtilsTest {

  @Test(dataProvider = "testCases")
  public void shouldCreateValidDate(Date given, Day expected) {
    Day day = DateUtils.getDayOfWeek(given);

    assertEquals(day, expected);
  }

  private static Date createDate(int year, int month, int day) {
    Calendar cal = Calendar.getInstance();
    cal.set(year, month, day);
    return cal.getTime();
  }

  @DataProvider(name = "testCases")
  public Object[][] prepareTestCaseData() {
    List<Object[]> testCases = new ArrayList<Object[]>();
    testCases.add(new Object[] { createDate(2013, 5, 2), Day.Sunday });
    testCases.add(new Object[] { createDate(2013, 4, 3), Day.Friday });
    testCases.add(new Object[] { createDate(2013, 3, 10), Day.Wednesday });

    return testCases.toArray(new Object[testCases.size()][]);
  }
}
