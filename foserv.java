package pack;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
public class foserv extends HttpServlet
{
  public void doPost(HttpServletRequest req ,HttpServletResponse res)throws IOException,ServletException
  {
	  
	PrintWriter  out=res.getWriter();  
	out.print("hello this is my first program");
	String name1 =req.getParameter("num1");
	String name2 =req.getParameter("num2");
	if(num1.equals("nkts") && num2.equals("querty")){
		RequestDispatcher rd = req.getRequestDispatcher("in");
	   rd.forward(req,res);
	
	}
	else{
		out.print("invalid");
		RequestDispatcher rd = req.getRequestDispatcher("in");
		rd.include(req,res);
		
		
  }
  
  }
}
		
		
		
		
		
		
		
		
	
	
	
	
	
		
		
		
		
		
		
		
		
	
	
  
	  

