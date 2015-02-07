package com.picapp.resources;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class Hello {

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String sayHello() {
		return "Hello";
	}

	/*@POST
	@Produces(MediaType.TEXT_HTML)
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	public void newTodo(@FormParam("id") String id,
			@FormParam("summary") String summary,
			@FormParam("description") String description,
			@Context HttpServletResponse servletResponse) throws IOException {
		Todo todo = new Todo(id, summary);
		if (description != null) {
			todo.setDescription(description);
		}
		TodoDao.instance.getModel().put(id, todo);

		servletResponse.sendRedirect("../create_todo.html");
	}*/

}
