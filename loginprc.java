package pack;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
public class loginprc extends HttpServlet{
	PreparedStatement ps;
	ResultSet rs;
	Connection con;
	
	
	public void doPost(HttpServletRequest req, HttpServletResponse res)throws IOException{
		String fname = req.getParameter("fname");
		String eat = req.getParameter("eat");
		 PrintWriter out = res.getWriter();
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql:///11ambatch","root","abcd");
			ps = con.prepareStatement("select fname,eat from opinion");
			rs = ps.executeQuery();
			boolean valid = false;
			while(rs.next()){
				if(fname.equals(rs.getString("fname"))&&eat.equals(rs.getString("eat"))){
					valid = true;
					break;
				}
			}
		if(valid){
				RequestDispatcher rd = req.getRequestDispatcher("opi");
				rd.forward(req,res);
			}
			else{
				out.print("<font color=red>this is the invalid answer<b>");
				out.print("</b></font>");
				RequestDispatcher rd = req.getRequestDispatcher("prcsecond.html");
				rd.include(req,res);
			}
		}
		catch(Exception e){
			out.print("there is an exception is caught");
		}
	}
}
			
			
					
			