import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

class FirstServlet extends HttpServlet
{
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException 
	{
		PrintWriter pw=res.getWriter();
		string username=getServletConfig().getInitParameter("username");
				string password=getServletConfig().getInitParameter("password");

		pw.println("<h1>username: "+username);
				pw.println("password: "+password</h1>);

		

	

	}
}
