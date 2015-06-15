package jerseyandspring;

import jerseyandspring.rest.UserResourceFactory;
import org.glassfish.jersey.jackson.JacksonFeature;

import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

public class RestApplication extends Application {

  private Set<Object> singletons = new HashSet<Object>();
  private Set<Class<?>> classes = new HashSet<Class<?>>();

  public RestApplication() {
    singletons.add(new UserResourceFactory().getInstance());
    classes.add(JacksonFeature.class);
  }

  @Override
  public Set<Object> getSingletons() {
    return singletons;
  }

  @Override
  public Set<Class<?>> getClasses() {
    return classes;
  }
}
