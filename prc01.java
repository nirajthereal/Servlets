package pack;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
public class prc01 extends HttpServlet{
	PreparedStatement ps;
	Connection con;
	ResultSet rs;
	public void doPost(HttpServletRequest req,HttpServletResponse res)throws IOException{
		PrintWriter out = res.getWriter();
		 String fname = req.getParameter("fname");
		 String learn = req.getParameter("learn");
		 String eat = req.getParameter("eat");
		 boolean valid = false;
		 try{
			 Class.forName("com.mysql.jdbc.Driver");
			 con = DriverManager.getConnection("jdbc:mysql:///11ambatch","root","abcd");
			 ps= con.prepareStatement("select fname ,eat from opinion");
			 rs=ps.executeQuery();
			 while(rs.next()){
				 
				 if(fname.equals(rs.getString("fname"))&& eat.equals(rs.getString("eat"))){
					 valid = true;
					 break;
				 }
			 }
		 
			 if(valid){
				 RequestDispatcher rd = req.getRequestDispatcher("qqq");
				 rd.include(req,res);
			 }
			 else{
				 out.print("<html><font color=red>");
				 out.print("what the hell you entered you are unautherised to move further");
				 out.print("</font></html>");
				 RequestDispatcher rd = req.getRequestDispatcher("prcsecond.html");
				 rd.include(req,res);
			 }
		 }
		
	       catch(Exception e ){
				out.print("exception is caught");
			}
		 
	}
}
				 
				 
				 
				 
		
			