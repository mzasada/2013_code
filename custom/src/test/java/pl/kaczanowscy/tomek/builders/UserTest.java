package pl.kaczanowscy.tomek.builders;

import org.testng.annotations.Test;

import java.util.Date;

@Test
public class UserTest {

	public void shouldDoSomethingWithActiveUser() {
		User user = new User("john", "doe", "pass", "john.doe@blah.com", "UTC", new Date(), UserState.ACTIVE, null);

		// a lot of stuff here
	}

	public void shouldDoSomethingWithNotRegisteredUser() {
		User user = new User("john", "doe", "pass", "john.doe@blah.com", "UTC", new Date(), UserState.NOT_REGISTERED, null);

		// a lot of stuff here
	}

	public void shouldDoSthWithPacificMidwayTimeZone() {
		User user = new User("john@doe.com", "john", "doe", "Pacific/Midway", "pass");

		// a lot of stuff here
	}

	public void shouldDoSthWithPacificGalapagosTimezone() {
		User user = validActiveUser("Pacific/Galapagos");

		// a lot of stuff here
	}

	public void shouldDoSthWithPolishTimezone() {
		User user = validActiveUser("Europe/Warsaw");

		// a lot of stuff here
	}

	public void shouldDoSomethingWithNotRegisteredUserWithPolishTimezone() {
		User user = validActiveUser("Europe/Warsaw");
		user.setState(UserState.NOT_REGISTERED);

		// a lot of stuff here
	}

	private User validActiveUser(String timezone) {
		return new User("john", "doe", "pass", "", timezone, new Date(), UserState.ACTIVE, null);
	}
}
