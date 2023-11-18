package pack;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class newuser extends HttpServlet {
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

        MyBean bean = new MyBean();
		bean.setEmail("email");
		bean.setPass("pass");
		bean.setAddress("address");
		bean.setPhone("phone");
		
			if(bean.getUser())
			{
			out.print("<html><font color=red><b>");
			out.print("already exist");
			out.print("</b></font></html>");
			RequestDispatcher rd= req.getRequestDispatcher("newuser.html");
			rd.include(req,res);
			}
			
	}
}
