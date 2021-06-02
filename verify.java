package webapp;

import javax.servlet.http.HttpServlet;
import javax.servlet.annotation.WebServlet;

import java.io.IOException;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/verify.do")
public class verify extends HttpServlet {

	ListUser LU = new ListUser();
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException  {
	
		if(request.getParameter("OTPSENT")==request.getParameter("OTP"))
		{
			String msg="Otp is valid and successfully logged in";
			Person P1 = new Person(request.getParameter("username"),request.getParameter("password"),request.getParameter("name"),request.getParameter("phno"),request.getParameter("address"),request.getParameter("DOB"));
			LU.addUser(P1);
			request.setAttribute("msg",msg);
			request.getRequestDispatcher("/WEB-INF/views/signin.jsp").forward(request, response);
		}
		else
		{
			String msg="Incorrect OTP";
			request.setAttribute("msg",msg);
			request.getRequestDispatcher("/WEB-INF/views/verify.jsp").forward(request, response);
		}
	}	
}
