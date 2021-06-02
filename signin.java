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

@WebServlet(urlPatterns = "/signin.do")
public class signin extends HttpServlet{
	
	ListUser LU = new ListUser();
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException  {
		
		Person PResult;
		PResult = LU.getRecord(request.getParameter("enteredname"),request.getParameter("enteredpassword"));
		if(PResult==null)
		{
			String err="The user is not registered";
			request.setAttribute("err",err);
			
		}
		else
		{
			request.setAttribute("username",PResult.username);
			request.setAttribute("password",PResult.password);
			request.setAttribute("Name",PResult.name);
			request.setAttribute("phno",PResult.phno);
			request.setAttribute("address",PResult.address);
			request.setAttribute("DOB",PResult.DOB);
			request.getRequestDispatcher("/WEB-INF/views/show.jsp").forward(request, response);
		}
		
	}

}
