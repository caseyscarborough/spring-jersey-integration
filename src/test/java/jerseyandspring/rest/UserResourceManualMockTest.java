package jerseyandspring.rest;

import jerseyandspring.dao.UserDao;
import jerseyandspring.dto.UserDto;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.test.JerseyTest;
import org.junit.Test;

import javax.ws.rs.client.Entity;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class UserResourceManualMockTest extends JerseyTest {

  private class MockUserDao implements UserDao {

    @Override
    public List<UserDto> getAllUsers() {
      return testUserList();
    }

    @Override
    public UserDto save(UserDto userDto) {
      return userDto;
    }
  }

  @Override
  protected Application configure() {
    UserDao userDao = new MockUserDao();
    UserResource userResource = new UserResource(userDao);
    ResourceConfig config = new ResourceConfig();
    config.registerInstances(userResource);
    return config;
  }

  @Override
  protected URI getBaseUri() {
    return UriBuilder.fromUri(super.getBaseUri()).path("users").build();
  }

  @Test
  public void testClientStringResponse() {
    Response s = target().path("users").request().get(Response.class);
    assertEquals(s.readEntity(List.class).size(), 3);
  }

  @Test
  public void testCreateUser() {
    UserDto testUserDto = new UserDto("Test", "User");

    Response r = target().path("users").request().post(Entity.entity(testUserDto, MediaType.APPLICATION_JSON));
    assertEquals(r.getStatus(), 201);
    assertEquals(r.readEntity(UserDto.class).toString(), testUserDto.toString());
  }

  private List<UserDto> testUserList() {
    List<UserDto> users = new ArrayList<UserDto>();
    users.add(new UserDto("Test", "User1"));
    users.add(new UserDto("Test", "User2"));
    users.add(new UserDto("Test", "User3"));
    return users;
  }

}
