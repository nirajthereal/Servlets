package pack;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class Formjdbc extends HttpServlet {
	    PreparedStatement ps;
		Connection con;
		ResultSet rs;

    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        PrintWriter out = res.getWriter();
        String email = req.getParameter("email");
        String pass = req.getParameter("pass");
		String address = req.getParameter("address");
        String phone = req.getParameter("phone");
        boolean valid =false;

        Connection con = null;
        PreparedStatement ps = null;
		String driver=getServletContext().getInitParameter("driver");
		String connect=getServletContext().getInitParameter("connect");
		String user=getServletContext().getInitParameter("user");
		String pwd=getServletContext().getInitParameter("pwd");
        
        try {
            Class.forName(driver);// register the driver
			con=DriverManager.getConnection(connect,user,pwd);
		     ps=con.prepareStatement("select email,pass from userdetails");
		     rs =ps.executeQuery();
		   while(rs.next())
		   {
			   
			   
			if(email.equals(rs.getString("email"))&& pass.equals(rs.getString("pass")))
			{
			    valid=true;
				break;
			}
			
		   }	
			if(valid)
			{ 
		     HttpSession session = req.getSession();
		     session.setAttribute("email",email);
			RequestDispatcher rd= req.getRequestDispatcher("kk");
			rd.include(req,res);
			}
			else{
            out.print("<html><font color=red><b>");
			out.print("email or password invalid");
			out.print("</b></font></html>");
			RequestDispatcher rd= req.getRequestDispatcher("index.html");
			rd.include(req,res);
            //res.sendRedirect("newuser.html");
			}
        } catch (Exception e) {
           out.print(e);
		}
	}
}