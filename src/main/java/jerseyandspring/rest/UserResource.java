package jerseyandspring.rest;

import jerseyandspring.dao.UserDao;
import jerseyandspring.dto.UserDto;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("users")
public class UserResource {

  private UserDao userDao;

  public UserResource(UserDao userDao) {
    this.userDao = userDao;
  }

  @GET
  @Produces(MediaType.APPLICATION_JSON)
  public Response list() {
    return Response.status(200).entity(userDao.getAllUsers()).build();
  }

  @POST
  @Produces(MediaType.APPLICATION_JSON)
  @Consumes(MediaType.APPLICATION_JSON)
  public Response create(UserDto userDto) {
    userDao.save(userDto);
    return Response.status(201).entity(userDto).build();
  }
}
