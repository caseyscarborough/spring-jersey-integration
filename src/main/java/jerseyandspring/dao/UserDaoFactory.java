package jerseyandspring.dao;

// This class would be used to retrieve a
// UserDAO implementation if not using Spring
public class UserDaoFactory {

  public UserDao getInstance() {
    return new StaticUserDao();
  }

  public UserDao getInstance(String type) {
    if (type.equals("static")) {
      return new StaticUserDao();
    }
    return null;
  }
}
