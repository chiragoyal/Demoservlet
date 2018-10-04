import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
public class FirstFilter implements Filter
{
	public void destroy()
	{
	}
	public void init(ServletConfig Config) throws ServletException
	{
	}
	public void doGet(ServletRequest req,ServletResponsse res,FilterChain fc) throws ServletExceotion IOException
	{
		PrintWriter pw=res.getWriter();
		pw.println("<h1>filter</h1><br/>");
		fc.doFilter(req,res);
		pw.println("<h1>filter again</h1><br/>");
	}
}