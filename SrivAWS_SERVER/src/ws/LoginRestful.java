package ws;

import entity.Login;
import model.LoginModel;

import java.util.List;
import javax.ws.rs.*;
import javax.ws.rs.core.*;

@Path("login")
public class LoginRestful {
	
	 @GET
	   @Produces(MediaType.APPLICATION_JSON)
	   @Path("/loggedinuser/{name}/{pass}")
	   public Response showLoggedInUser(@PathParam("name") String name,@PathParam("pass") String pass) throws Exception 
	   {		
			LoginModel loginModel = new LoginModel();
			Login login = new Login();
			login.setUsername(name);
			login.setPassword(pass);
			System.out.println("Inside LoginRestful ---Login----------");
			return Response
					.ok()
					.entity(new GenericEntity<List<Login>>(loginModel.findLoggedInUser(login.getUsername(),login.getPassword())){})
					.header("Access-Control-Allow-Origin", "*")
					.header("Access-Control-Allow-Methods", 
							"GET,POST,DELETE,PUT,OPTIONS,HEAD").build();				
	   }
	   
}
