import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import javax.servlet.annotation.*;
import java.util.*;
@WebServlet("/test1")
public class Hidden1Servlet extends HttpServlet
{
public void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException, IOException
	{
	String username=req.getParameter("username");
	String age=req.getParameter("age");
	PrintWriter pw=res.getWriter();
	pw.println("<h1>username: "+username+"</h1>");
	pw.println("<h1>age: "+age+"</h1>");
}

}
