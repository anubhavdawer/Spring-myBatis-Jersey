package com.anubhav.resources;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.anubhav.service.LoginImpl;

/**
 * Resource class for this application.
 * "@component" makes it auto scan eligible bean by the application context
 * Registered it as a bean and injected the service class dependency in it by using autowired annotation 
 * @author adawer
 *
 */
@Component
@Path("/select")
public class LoginResource {
	
	//this annotation injects it in here
	@Autowired
	LoginImpl loginImpl;
	
	/**
	 * This method is the API to get the login details of the user
	 * @param userId
	 * @return
	 */
	@GET
	@Path("/{userId}")
	@Produces(MediaType.APPLICATION_JSON)
	public String selectLogin(@PathParam ("userId") String userId){
		System.out.println(loginImpl.selectLogin(userId));
		return loginImpl.selectLogin(userId).getPassword();
		
	}
}
