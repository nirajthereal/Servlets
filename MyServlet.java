package pack;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
public class MyServlet extends HttpServlet{
	protected void doGet(HttpServletRequest req ,HttpServletResponse res)throws IOException
  {
	  
	PrintWriter  out=res.getWriter();  
	out.print("hii");
	
	ServletContext ctx = getServletContext();
	String str = ctx.getInitParameter("name");
	out.println("str");
  }
}