

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/RegistrationServlet")
public class RegistrationServlet extends HttpServlet {
	
     
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	String name = request.getParameter("name");
	String email = request.getParameter("emailid");
    String password = request.getParameter("password");
	
    request.getRequestDispatcher("Display").forward(request, response);
}

}
