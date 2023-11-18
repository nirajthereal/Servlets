package pack;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
public class bhejna extends HttpServlet
{
  public void doPost(HttpServletRequest req ,HttpServletResponse res)throws IOException,ServletException
  {
	  
	PrintWriter  out=res.getWriter();  
	String email =req.getParameter("email");
	String pass =req.getParameter("pass");  
	
	
	
	
	
	
	
	