package pack;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
public class FirstServlet extends HttpServlet
{
  public void doGet(HttpServletRequest req ,HttpServletResponse res)throws IOException
  {
	  
	PrintWriter  out=res.getWriter();  
	out.print("hello this is my first program");
  }
	  

}//outside classes  we have to put the webxml