package pack;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;
public class prc extends HttpServlet{
	PreparedStatement ps;
	ResultSet rs;
	Connection con;
	public void doPost(HttpServletRequest req,HttpServletResponse res)throws  IOException{
		PrintWriter out = res.getWriter();
		String fname = req.getParameter("fname");
		String learn = req.getParameter("learn");
		String eat = req.getParameter("eat");
		boolean valid = false;
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql:///11ambatch","root","abcd");
			ps = con.prepareStatement("select fname from opinion");
			rs = ps.executeQuery();
			while(rs.next()){
				if(fname.equals(rs.getString("fname"))){
					valid = true;
					break;
				}
			}
			if(valid){
				out.print("<html><font color=red>");
				out.print("already exists");
				out.print("</font></html>");
				RequestDispatcher rd = req.getRequestDispatcher("practice.html");
			rd.include(req,res);
			}
			else{
			ps = con.prepareStatement("insert into opinion values(?, ?, ?)");
			ps.setString(1,fname);
			ps.setString(2,learn);
			ps.setString(3,eat);
			ps.executeUpdate();
			out.print("inserted succesfully");
			}
		}
		catch(Exception e){
			out.print("exception is caught");
		}
	}
}