package ws;

import java.util.*;

import javax.ws.rs.core.Application;

@javax.ws.rs.ApplicationPath("rest")
public class ApplicationConfig extends Application {
	
	@Override
	public Set<Class<?>> getClasses() {		
		Set<Class<?>> resources = new java.util.HashSet<>();
		addResetResourceClasses(resources);		
		return resources;		
	}
	
	private void addResetResourceClasses(Set<Class<?>> resources ) {
		resources.add(ws.EmployeeRestful.class);
		resources.add(ws.VendorRestful.class);
		resources.add(ws.LoginRestful.class);
		
	}

}
