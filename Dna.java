package pack;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
public class Dna extends HttpServlet{
    public void doGet(HttpServletRequest req ,HttpServletResponse res)throws IOException,ServletException{
	res.sendRedirect("abc");
	}
	
}