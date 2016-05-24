package com.shoikat.jerseytest;

import java.util.ArrayList;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;



@Path("/student")
public class JerseyRestService {

	/*@GET
	@Path("/print/{name}")
	@Produces(MediaType.APPLICATION_JSON)
	public Student produceJSON( @PathParam("name") String name ) {

		Student st = new Student(name, "Diaz",22,1);

		return st;

	}*/
	
	
	@GET	
	@Path("/getall")
	@Produces(MediaType.APPLICATION_JSON)
	public ArrayList<Student> getAllList() {
		ArrayList<Student> stDaoList= new StudentDAO().findAll();

		return stDaoList;
	
}
	
	@GET
	@Path("{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Student produceJSON( @PathParam("id") String id ) {
		int idNo=Integer.parseInt(id);
		StudentDAO dao=new StudentDAO();
		return dao.findById(idNo);
	}
	
	@POST
	@Path("/send")
	@Consumes(MediaType.APPLICATION_JSON)
	/*@Produces("text/html")*/
	public Response consumeJSON( Student student ) {

		String output = student.toString();
		
		System.out.print("In My Post Method:"+output);

		return Response.status(200).entity(output).build();
	}


}

