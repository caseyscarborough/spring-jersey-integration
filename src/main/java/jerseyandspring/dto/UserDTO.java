package jerseyandspring.dto;

import java.io.Serializable;

public class UserDTO implements Serializable {

  private String firstName;

  public UserDTO() {}

  public UserDTO(String firstName) {
    this.firstName = firstName;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    UserDTO userDTO = (UserDTO) o;

    if (firstName != null ? !firstName.equals(userDTO.firstName) : userDTO.firstName != null) return false;

    return true;
  }

  @Override
  public int hashCode() {
    int result = firstName != null ? firstName.hashCode() : 0;
    result = 31 * result;
    return result;
  }
}
