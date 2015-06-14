package jerseyandspring.dao;

import jerseyandspring.dto.UserDto;

import java.util.List;

public interface UserDao {

  List<UserDto> getAllUsers();

  UserDto save(UserDto userDto);
}
