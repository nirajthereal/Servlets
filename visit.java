package pack;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;
import java.util.Date;
public class visit extends HttpServlet implements Runnable
{
 static int count=0;

PreparedStatement ps;

String dd;

public void run()
{
	try
	{
   Class.forName("com.mysql.jdbc.Driver");
   Connection con =DriverManager.getConnection("jdbc:mysql:///11ambatch","root","abcd");
while(true)
{
Date d=new Date();
dd=d.getHours()+":"+d.getMinutes()+":"+d.getSeconds();
	ps=con.prepareStatement("insert into counterdetails values(?,?)");
ps.setInt(1,count);
ps.setString(2,dd);
ps.executeUpdate();
Thread.sleep(1000*60);
}
}catch(Exception ae)
{
	
}

}
public void init()
{
	visit c= new visit();
    Thread t= new Thread (c);
     t.start();	
	
}

public void doGet(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException
{
    PrintWriter out=res.getWriter();
	getServletContext().setAttribute("count",++count);
	
	out.print("visitor : "+getServletContext().getAttribute("count"));



}

}