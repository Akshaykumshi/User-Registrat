package webapp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/login.do")
public class LoginServlet extends HttpServlet{

	//uservalidation uservalid = new uservalidation();
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException  {
		
		//request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String phno = request.getParameter("Phone number");
		String address = request.getParameter("Address");
		String Name = request.getParameter("Name");
		String DOB = request.getParameter("DOB");
		System.out.println("The values of name in get are"+username+password+phno);
		request.getRequestDispatcher("/WEB-INF/views/welcome.jsp").forward(request, response);	
		
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
		String username= request.getParameter("username");
		String password = request.getParameter("passwprd");
		String phno = request.getParameter("Phone number");
		String address = request.getParameter("Address");
		String Name = request.getParameter("Name");
		String DOB = request.getParameter("DOB");
		//System.out.println("The values of name in post are"+username+password+phno);
		request.getRequestDispatcher("/WEB-INF/views/welcome.jsp").forward(request, response);	
		
		
	}

}
