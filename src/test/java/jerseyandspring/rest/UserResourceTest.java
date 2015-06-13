package jerseyandspring.rest;

import jerseyandspring.RestApplication;
import jerseyandspring.dto.UserDTO;
import org.glassfish.jersey.test.JerseyTest;
import org.junit.Test;

import javax.ws.rs.client.Entity;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;
import java.net.URI;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class UserResourceTest extends JerseyTest {

  @Override
  protected Application configure() {
    return new RestApplication();
  }

  @Override
  protected URI getBaseUri() {
    return UriBuilder.fromUri(super.getBaseUri()).path("users").build();
  }

  @Test
  public void testClientStringResponse() {
    Response s = target().path("users").request().get(Response.class);
    assertEquals(s.readEntity(List.class).size(), 2);
  }

  @Test
  public void testCreateUser() {
    Response r = target().path("users").request().post(Entity.entity(new UserDTO("Test"), MediaType.APPLICATION_JSON));
    assertEquals(r.getStatus(), 201);
    assertEquals(r.readEntity(UserDTO.class).getFirstName(), "Test");
  }

}
