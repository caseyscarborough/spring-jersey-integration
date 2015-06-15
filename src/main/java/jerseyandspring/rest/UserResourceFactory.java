package jerseyandspring.rest;

import jerseyandspring.dao.UserDaoFactory;

public class UserResourceFactory {

  public UserResource getInstance() {
    return new UserResource(new UserDaoFactory().getInstance());
  }
}
