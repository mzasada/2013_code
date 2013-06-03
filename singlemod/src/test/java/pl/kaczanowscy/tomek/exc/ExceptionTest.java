package pl.kaczanowscy.tomek.exc;

import org.testng.annotations.Test;
import static org.fest.assertions.Assertions.assertThat;

@Test
public class ExceptionTest {

	@Test(expectedExceptions = IllegalArgumentException.class, expectedExceptionsMessageRegExp = ".*error.*")
	public void expectingException() {
		MyExceptionInvoker exc = new MyExceptionInvoker();

		exc.pretendToDoSth();
	}

	private class MyExceptionInvoker {

		public void pretendToDoSth() {
			throw new IllegalArgumentException("ah error occurred!");
		}
	}
}
