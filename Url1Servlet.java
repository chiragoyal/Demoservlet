import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import javax.servlet.annotation.*;
import java.util.*;
@WebServlet("/test1")
public class Url1Servlet extends HttpServlet
{
public void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException, IOException
	{
	String username=req.getParameter("uname");
	PrintWriter pw=res.getWriter();
	pw.println("<h1>username: "+username+"</h1>");
	pw.println("<h1>session id from url="+req.isRequestedSessionIdFromURL()+"</h1>");

	}

}