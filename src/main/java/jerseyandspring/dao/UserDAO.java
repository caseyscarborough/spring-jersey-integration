package jerseyandspring.dao;

import jerseyandspring.dto.UserDTO;

import java.util.List;

public interface UserDAO {

  List<UserDTO> getAllUsers();

  UserDTO save(UserDTO userDTO);
}
