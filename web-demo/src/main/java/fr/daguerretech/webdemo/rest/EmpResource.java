package fr.daguerretech.webdemo.rest;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;

@Path("/employees/{firstname}.{lastname}@{domain}.com")
public class EmpResource {

	@GET
	@Produces("text/xml")
	public String getEmployeelastname(@PathParam("lastname") String lastName) {
		return lastName;
	}
}