package webapp;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


import javax.servlet.annotation.WebServlet;
import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/welcome.do")
public class uservalidation extends HttpServlet {

	Sendsms S1 = new Sendsms();
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException  {
		if(request.getParameter("phno")!=null)
		{
			int OTPSENT=S1.sendSms(request.getParameter("phno"));
			request.setAttribute("OTPSENT", OTPSENT);
			request.getRequestDispatcher("/WEB-INF/views/verify.jsp").forward(request, response);
		}
		else {
			System.out.println("Invalid phone number");
			request.getRequestDispatcher("/WEB-INF/views/login.do").forward(request, response);
		}
	}
}
