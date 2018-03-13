package ws;

import entity.Vendor;
import model.VendorModel;

import java.util.List;
import javax.ws.rs.*;
import javax.ws.rs.core.*;

@Path("vendor")
public class VendorRestful {
	
	 @GET
	   @Produces(MediaType.APPLICATION_JSON)
	   @Path("/vendordetails")
	   public Response showVendors() throws Exception 
	   {		
			VendorModel vendorModel = new VendorModel();
			System.out.println("Inside EmployeeRestful ---Vendor-Employees---------");
			return Response
					.ok()
					.entity(new GenericEntity<List<Vendor>>(vendorModel.findVendorDetails()){})
					.header("Access-Control-Allow-Origin", "*")
					.header("Access-Control-Allow-Methods", 
							"GET,POST,DELETE,PUT,OPTIONS,HEAD").build();				
	   }
	   
}
