package pack;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
import java.util.Date;
public class visiter extends HttpServlet implements Runnable{
	static int count =0;
	PreparedStatement pc;
	String dd;
	public void run(){
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con =DriverManager.getConnection("jdbc:mysql:///11ambatch","root","abcd");
			while(true){
				