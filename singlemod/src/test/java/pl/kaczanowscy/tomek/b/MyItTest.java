package pl.kaczanowscy.tomek.b;

import org.testng.annotations.Test;

@Test
public class MyItTest {

	public void itTest() {
		System.out.println("IT tests " + getClass().getCanonicalName());
	}

}
