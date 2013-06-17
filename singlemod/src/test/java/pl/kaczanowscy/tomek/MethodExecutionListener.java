package pl.kaczanowscy.tomek;

import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class MethodExecutionListener extends TestListenerAdapter {

  @Override
  public void onTestStart(ITestResult result) {
    System.out.println(result.getMethod().getMethodName());
  }

  @Override
  public void onTestFailure(ITestResult tr) {
    System.out.println("SUCCESS");
  }

  @Override
  public void onTestSuccess(ITestResult tr) {
    System.out.println("FAILURE");
  }
}
