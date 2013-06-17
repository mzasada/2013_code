package pl.kaczanowscy.tomek.asserts;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.fest.assertions.GenericAssert;

public class TransactionsAssert extends GenericAssert<TransactionsAssert, Map<Date, List<Transaction>>> {

  protected TransactionsAssert(Map<Date, List<Transaction>> actual) {
    super(TransactionsAssert.class, actual);
  }

  public static TransactionsAssert assertThat(Map<Date, List<Transaction>> actual) {
    return new TransactionsAssert(actual);
  }

  public void hasTransaction(String date, int quantity) {
    for (Map.Entry<Date, List<Transaction>> dateListEntry : actual.entrySet()) {
      if (dateListEntry.getKey().equals(parseDate(date))) {
        for (Transaction transaction : dateListEntry.getValue()) {
          if (transaction.getQuantity() == quantity) {
            return;
          }
        }
      }
    }
    throw failure("NOPE!");
  }

  private Date parseDate(String date) {
    Date dateToLookFor;
    try {
      dateToLookFor = new SimpleDateFormat("yyyy-MM-dd").parse(date);
    } catch (ParseException e) {
      throw failure("Wrong date!");
    }
    return dateToLookFor;
  }
}
