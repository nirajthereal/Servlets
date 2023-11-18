package pack;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
public class inbox extends HttpServlet{
      //int hitcount = 1;
	  int count = 0;
    public void doPost(HttpServletRequest req ,HttpServletResponse res)throws IOException,ServletException{
	     PrintWriter out=res.getWriter();
		 //String email =req.getParameter("email");
	     String password =req.getParameter("pass");
		 out.print("inbox is opened succesfully");
		 HttpSession session = req.getSession();
		 out.print("session"+session.getId());
		 /*Cookie c = new Cookie("visit",String.valueOf(i));
		 res.addCookie(c);
		 int j = Integer.parseInt(c.getValue());
		 if(j==1){
			out.println("welcome user ");
		 }
		 else
		 {
			out.println("welcome user "+ j+"times");
		 }
		 i++;*/
		 /*Integer hitcount = (Integer)req.getAttribute("hitcounter");
		 if(hitcount == 1){
			 out.print("the visiter is visiting the site for the first time");
		}
		else{
		 out.print("the visiter is visiting "+hitcount +"times");
		 hitcount +=1;
		 }
		 req.setAttribute("hitcounter",hitcount);*/
		 getServletContext().setAttribute("count",++count);
		 out.print("<html><font color = blue ><b>");
	     out.print("visitor:"+getServletContext().getAttribute("count"));
	     out.print("</b></font></html>");
		 
		 String email=(String)req.getAttribute("email");
		 String address = getServletConfig().getInitParameter("address");
		 String phone = getServletConfig().getInitParameter("mobile");
		 out.print("<html><font color=blue><b>");
		 out.print("Hi "+email+" this is ur inbox ");
		 out.print("Address : "+address+" Phone: "+phone);
		 out.print("</b></font></html>");
		 
		 
		 }
	}
		 
		 
		 
		 
		 
		 
		 
		 
 