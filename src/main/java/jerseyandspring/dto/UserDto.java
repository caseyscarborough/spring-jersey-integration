package jerseyandspring.dto;

import java.io.Serializable;

public class UserDto implements Serializable {

  private static final long serialVersionUID = -4733194550960772819L;

  private String firstName;
  private String lastName;

  public UserDto() {}

  public UserDto(String firstName, String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    UserDto userDto = (UserDto) o;

    if (firstName != null ? !firstName.equals(userDto.firstName) : userDto.firstName != null) return false;
    if (lastName != null ? !lastName.equals(userDto.lastName) : userDto.lastName != null) return false;

    return true;
  }

  @Override
  public int hashCode() {
    int result = firstName != null ? firstName.hashCode() : 0;
    result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "UserDTO{" +
        "firstName='" + firstName + '\'' +
        ", lastName='" + lastName + '\'' +
        '}';
  }
}
