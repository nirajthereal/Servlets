package pack;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
public class FirstServlet01 extends HttpServlet
{
  public void doGet(HttpServletRequest req,HttpServletResponse res)throws IOException 
  {
    PrintWriter out = res.getWriter();
	out.print("there is nothing worthy in this world");
	out.println("some one for everyone");
	
	
	
  }
}
