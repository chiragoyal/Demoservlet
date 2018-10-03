import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import javax.servlet.annotation.*;
@WebServlet("/test")
public class FourthServlet extends HttpServlet
{
public void doGet(HttpServletRequesst req,HttpServletResponse res)throws ServletException, IOException
	{
	string name=req.getParameter();
	string value=req.getParameter();
	Cookie c=new Cookie(name,value);
		res.addCookie(c);
	RequestDispatcher rd=req.getRequestDispatcher("login.html");
	rd.include(req,res);
	}

}