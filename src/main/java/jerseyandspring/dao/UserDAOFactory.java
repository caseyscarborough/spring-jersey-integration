package jerseyandspring.dao;

// This class would be used to retrieve a
// UserDAO implementation if not using Spring
public class UserDAOFactory {

  private static UserDAO instance;

  public static void setInstance(UserDAO userDAO) {
    instance = userDAO;
  }

  public static UserDAO getInstance() {
    return new StaticUserDAO();
  }
}
