package pl.kaczanowscy.tomek.builders;

import org.testng.annotations.Test;

import java.util.Date;

@Test
public class UserTest {

	public void shouldDoSomethingWithActiveUser() {
		User user = new UserBuilder().setFirstName("john").setLastName("doe").setPassword("pass").setEmail("john.doe@blah.com").setTimezone("UTC").setRegistered(new Date()).setState(UserState.ACTIVE).setAddress(null).createUser();

		// a lot of stuff here
	}

	public void shouldDoSomethingWithNotRegisteredUser() {
		User user = new UserBuilder().setFirstName("john").setLastName("doe").setPassword("pass").setEmail("john.doe@blah.com").setTimezone("UTC").setRegistered(new Date()).setState(UserState.NOT_REGISTERED).setAddress(null).createUser();

		// a lot of stuff here
	}

	public void shouldDoSthWithPacificMidwayTimeZone() {
		User user = new UserBuilder().setEmail("john@doe.com").setFirstName("john").setLastName("doe").setTimezone("Pacific/Midway").setPassword("pass").createUser();

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
		return new UserBuilder().setFirstName("john").setLastName("doe").setPassword("pass").setEmail("").setTimezone(timezone).setRegistered(new Date()).setState(UserState.ACTIVE).setAddress(null).createUser();
	}
}
