package pack;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
public class Fosev extends HttpServlet
{
  public void doPost(HttpServletRequest req ,HttpServletResponse res)throws IOException,ServletException
  {
	  
	PrintWriter  out=res.getWriter();  
	String email =req.getParameter("id");
	String pass =req.getParameter("string");
	if(email.equals("abc@gmail.com") && pass.equals("querty")){
		RequestDispatcher rd = req.getRequestDispatcher("kk");
	    rd.forward(req,res);
	
	}
	else{
		out.print("invalid");
		RequestDispatcher rd = req.getRequestDispatcher("index.html");
		rd.include(req,res);
    }
	
	
	
  }
	  
}
