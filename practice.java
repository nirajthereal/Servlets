package pack;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
public class practice extends HttpServlet{
	Connection con;
	PreparedStatement ps;
	public void doPost(HttpServletRequest req,HttpServletResponse res){
		try{
		Class.forName("com.mysql.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql:///11ambatch,root,abcd");
		ps = con.prepareStatement("insert into opinion(?, ?, ?)");
		String fname = req.getParameter("fname");
		String learn = req.getParameter("learn");
		String eat = req.getParameter("eat");
		ps.setString(1,fname);
		ps.setString(2,learn);
		ps.setString(3,eat);
		ps.executeUpdate();
		//res.sendRedirect("pratice01.html");
		}
		catch(Exception e){}
	}
}
}