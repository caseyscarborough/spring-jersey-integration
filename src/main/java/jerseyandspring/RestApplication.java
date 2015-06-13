package jerseyandspring;

import jerseyandspring.rest.UserResource;

import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

public class RestApplication extends Application {

  @Override
  public Set<Class<?>> getClasses() {
    Set<Class<?>> classes = new HashSet<Class<?>>();
    classes.add(UserResource.class);
    return classes;
  }
}
