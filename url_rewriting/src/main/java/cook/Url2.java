package cook;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


public class Url2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public Url2() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
		
		String s1=request.getParameter("book1");
		String s2=request.getParameter("book2");
		String s3=request.getParameter("book3");
		
		PrintWriter pw= response.getWriter();
		pw.println("<html><body bgcolor=yellow text=blue><center><br>");
		pw.println("Your books are dded to cart  ");
		pw.println("<br><a href=get ? book1="+s1+"&book2="+s2+"&book3="+s3+">Next</a>");
		pw.println("</center></body></html>");
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	

}
