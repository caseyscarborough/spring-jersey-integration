package jerseyandspring.dao;

import jerseyandspring.dto.UserDTO;

import java.util.ArrayList;
import java.util.List;

public class StaticUserDAO implements UserDAO {

  List<UserDTO> users = new ArrayList<UserDTO>();

  public StaticUserDAO() {
    users.add(new UserDTO("John", "Doe"));
    users.add(new UserDTO("Jane", "Doe"));
  }

  @Override
  public List<UserDTO> getAllUsers() {
    return users;
  }

  @Override
  public UserDTO save(UserDTO userDTO) {
    users.add(userDTO);
    return userDTO;
  }
}
