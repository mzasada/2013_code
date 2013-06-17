package pl.kaczanowscy.tomek.builders;

import java.util.Date;

public class UserBuilder {
  private String firstName;
  private String lastName;
  private String password;
  private String email;
  private String timezone;
  private Date registered = null;
  private UserState state = UserState.NOT_REGISTERED;
  private Address address = null;

  public UserBuilder setFirstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  public UserBuilder setLastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  public UserBuilder setPassword(String password) {
    this.password = password;
    return this;
  }

  public UserBuilder setEmail(String email) {
    this.email = email;
    return this;
  }

  public UserBuilder setTimezone(String timezone) {
    this.timezone = timezone;
    return this;
  }

  public UserBuilder setRegistered(Date registered) {
    this.registered = registered;
    return this;
  }

  public UserBuilder setState(UserState state) {
    this.state = state;
    return this;
  }

  public UserBuilder setAddress(Address address) {
    this.address = address;
    return this;
  }

  public User createUser() {
    return new User(firstName, lastName, password, email, timezone, registered, state, address);
  }
}