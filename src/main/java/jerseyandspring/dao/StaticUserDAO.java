package jerseyandspring.dao;

import jerseyandspring.dto.UserDTO;

import java.util.ArrayList;
import java.util.List;

public class StaticUserDAO implements UserDAO {

  @Override
  public List<UserDTO> getAllUsers() {
    List<UserDTO> users = new ArrayList<UserDTO>();
    users.add(new UserDTO("John"));
    users.add(new UserDTO("Jane"));
    return users;
  }
}
