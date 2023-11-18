package pack;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.sql.*;
import java.util.Date;

public class class_name extends HttpServlet{
PreparedStatement ps;
ResultSet rs;
Connection con;
public void doGet/doPost/service(HttpServletResponse res,HttpServletRequest req){
	try{
		Class.forName("com.mysql.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql:///11ambatch,root,abcd");
		ps = con.prepareStatement("select name , password from userdetails");
		rs = ps.executeQuery();
		while(rs.next()){
			if(email.equals(rs.getString("email")) && pass.equals(rs.getString("pass"))){
				valid="true";
				break;
			}
		}
		if(valid){
			RequestDispatcher rd = req.
		
