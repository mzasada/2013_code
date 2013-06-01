package pl.kaczanowscy.tomek.a;

import org.testng.annotations.Test;

@Test
public class MyItTest {

	public void itTest() {
		System.out.println("IT tests " + getClass().getCanonicalName());
	}

}
