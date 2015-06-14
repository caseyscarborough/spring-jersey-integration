package jerseyandspring.dao;

// This class would be used to retrieve a
// UserDAO implementation if not using Spring
public class UserDaoFactory {

 public static UserDao getInstance() {
   return new StaticUserDao();
 }
}
