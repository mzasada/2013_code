package pl.kaczanowscy.tomek.asserts;

import java.text.ParseException;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.testng.annotations.Test;

public class AssertionsTest {

  @Test
  public void shouldReturnTxFrom12MayWithQuantity7() throws ParseException {
    ProductService service = new ProductService();

    Map<Date, List<Transaction>> transactions = service.getTransactions(new Product());

    TransactionsAssert.assertThat(transactions).hasTransaction("2012-05-12", 7);
  }
}
