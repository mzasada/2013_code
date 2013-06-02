package pl.kaczanowscy.tomek.exc;

import org.testng.annotations.Test;

import static com.googlecode.catchexception.CatchException.catchException;
import static com.googlecode.catchexception.CatchException.caughtException;
import static org.fest.assertions.Assertions.assertThat;

@Test
public class ExceptionTest {

	@Test(expectedExceptions = IllegalArgumentException.class, expectedExceptionsMessageRegExp = ".*error.*")
	public void expectingException() {
		MyExceptionInvoker exc = new MyExceptionInvoker();

		exc.pretendToDoSth();
	}

	public void betterExc() {
		MyExceptionInvoker exc = new MyExceptionInvoker();

		catchException(exc).pretendToDoSth();

		assertThat(caughtException()).isInstanceOf(IllegalArgumentException.class);
		assertThat(caughtException().getMessage()).contains("error");
	}

	private class MyExceptionInvoker {

		public void pretendToDoSth() {
			throw new IllegalArgumentException("ah error occurred!");
		}
	}
}
