package pack ;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.Date;
public class counter extends HttpServlet implements Runnable
{
static  count = 0;
public void init (){
	Counter c = new Counter();
	
	
public void doGet(HttpServletRequest req, HttpServletResponse res)throws IOException,ServletException{
	try
	{
	while(true)
		
		Class.forName("com.mysql.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql:///11ambatch,root,abcd");
		ps = con.prepareStatement("insert into visiter values(?, ?, ?)");
		Date a = new Date();
		String hours = a.getHours();
		String minutes = a.getMinutes();
		String seconds = a.getSecond();
		String time = "hours "+"minutes"+"seconds";
		while(true){
			Thread.sleep(24*60*10);
			
		
		
	
	getServletContext().setAttribute("count",++count);
	PrintWriter out = res.getWriter();
	out.print("<html><font color = blue ><b>");
	out.print("visitor:"+getServletContext().getAttribute("count"));
	out.print("</b></font></html>");
}
}