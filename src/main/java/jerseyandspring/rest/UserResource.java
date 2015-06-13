package jerseyandspring.rest;

import jerseyandspring.dao.UserDAO;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("users")
public class UserResource {

  @Inject
  private UserDAO userDAO;

  @GET
  @Produces(MediaType.APPLICATION_JSON)
  public Response list() {
    return Response.status(200).entity(userDAO.getAllUsers()).build();
  }
}
