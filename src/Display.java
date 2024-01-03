

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Display")
public class Display extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter p = response.getWriter();
		String name = request.getParameter("name");
		String email = request.getParameter("emailid");
	    String password = request.getParameter("password");
		
		p.print("<h3>User Information </h3>");
		p.print("<p>Name: "+name+"</p>");
		p.print("<p>EmailId : "+email+"</p>");
	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
