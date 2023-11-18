package pack;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
import java.util.Date;
public class visiting extends HttpServlet{
	static int count =0;
	PreparedStatement ps;
	Connection con;
	public void run(){
		try{
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql:///11ambatch","root","abcd");
			ps = con.prepareStatement("insert into count values(?, ?)");
			ps.setInt(1,