package jerseyandspring.rest;

import jerseyandspring.dao.UserDAO;
import jerseyandspring.dto.UserDTO;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("users")
public class UserResource {

  private UserDAO userDAO;

  @Inject
  public UserResource(UserDAO userDAO) {
    this.userDAO = userDAO;
  }

  @GET
  @Produces(MediaType.APPLICATION_JSON)
  public Response list() {
    return Response.status(200).entity(userDAO.getAllUsers()).build();
  }

  @POST
  @Produces(MediaType.APPLICATION_JSON)
  @Consumes(MediaType.APPLICATION_JSON)
  public Response create(UserDTO userDTO) {
    return Response.status(201).entity(userDTO).build();
  }
}
