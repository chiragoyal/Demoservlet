import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import javax.servlet.annotation.*;
@WebServlet("/test")
public class MyServlet extends HttpServlet
{
	public void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException, IOException
	{
		String name=req.getParameter("name");
		String pwd=req.getParameter("pwd");
		PrintWriter pw=res.getWriter();
		pw.println("<h1>hi my name is chirag</h1>");
}
}