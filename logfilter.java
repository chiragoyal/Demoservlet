import javax.servlet.*;
import java.io.*;
import javax.servlet.http.*;

public class LogFilter implements Filter 
{
	public void destroy()
	{
	}
	ServletConfig config=null;
	public void init(ServletConfig config)throws ServletException
	{
		this.config=config;
	}
	public void doFilter(ServletRequest req,ServletResponse res,FilterChain fc)throws ServletException IOException
	{
		ServletContext context=config.getServletContext();
		PrintWriter pw=res.getWriter();
		pw.println("<h1>logfilter</h1><br/>");
		fc.doFilter(req,res);
	}
}