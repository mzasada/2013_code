package pl.kaczanowscy.tomek;

import org.testng.TestNG;

public class Main {

	public static void main(String[] args) {
		TestNG testng = new TestNG();
		testng.setTestClasses(new Class[] {
				pl.kaczanowscy.tomek.a.MyE2ETest.class,
				pl.kaczanowscy.tomek.b.MyE2ETest.class,
				pl.kaczanowscy.tomek.c.MyE2ETest.class,
				pl.kaczanowscy.tomek.a.MyItTest.class,
				pl.kaczanowscy.tomek.b.MyItTest.class,
				pl.kaczanowscy.tomek.c.MyItTest.class,
				pl.kaczanowscy.tomek.a.MyUnitTest.class,
				pl.kaczanowscy.tomek.b.MyUnitTest.class,
				pl.kaczanowscy.tomek.c.MyUnitTest.class
		});
		testng.run();
	}
}
