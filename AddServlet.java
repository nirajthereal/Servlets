package pack;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class AddServlet extends HttpServlet
{
	public void service(HttpServletRequest req ,HttpServletResponse res)throws IOException
	{
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		int k= i+j;
		PrintWriter out = res.getWriter();
		out.println("result is k"+k);
		//req.setAttributes
	}
}