package pl.kaczanowscy.tomek.exc;

import static org.fest.assertions.Assertions.assertThat;

import org.testng.annotations.Test;

import com.googlecode.catchexception.CatchException;

@Test
public class ExceptionTest {

  @Test
  public void expectingException() {
    // given:
    MyExceptionInvoker exc = new MyExceptionInvoker();

    // when:
    CatchException.catchException(exc).pretendToDoSth();

    // then:
    assertThat(CatchException.caughtException() instanceof IllegalArgumentException);
    assertThat(CatchException.caughtException().getMessage()).matches(".*error.*");
  }

  private class MyExceptionInvoker {

    public void pretendToDoSth() {
      throw new IllegalArgumentException("ah error occurred!");
    }
  }
}
