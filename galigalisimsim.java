package pack;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;
public class galigalisimsim extends HttpServlet{
	public void doPost(HttpServletRequest req, HttpServletResponse res)throws IOException{
		PrintWriter out = res.getWriter();
		out.print("there is nothing worthy in this world and there is only cruel and filthy people living in this world");
	}
}


