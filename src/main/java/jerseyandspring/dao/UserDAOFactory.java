package jerseyandspring.dao;

// This class would be used to retrieve a
// UserDAO implementation if not using Spring
public class UserDaoFactory {

  private static UserDao instance;

  public static void setInstance(UserDao userDao) {
    instance = userDao;
  }

  public static UserDao getInstance() {
    return new StaticUserDao();
  }
}
