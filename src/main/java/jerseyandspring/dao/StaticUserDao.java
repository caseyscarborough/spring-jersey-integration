package jerseyandspring.dao;

import jerseyandspring.dto.UserDto;

import java.util.ArrayList;
import java.util.List;

public class StaticUserDao implements UserDao {

  List<UserDto> users = new ArrayList<UserDto>();

  public StaticUserDao() {
    users.add(new UserDto("John", "Doe"));
    users.add(new UserDto("Jane", "Doe"));
  }

  @Override
  public List<UserDto> getAllUsers() {
    return users;
  }

  @Override
  public UserDto save(UserDto userDto) {
    users.add(userDto);
    return userDto;
  }
}
