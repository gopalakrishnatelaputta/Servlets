package reqDis;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class ReqDispatcher extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public ReqDispatcher() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw =response.getWriter();
		String n=request.getParameter("Username");
		String p=request.getParameter("Password");
		if(p.equals("servlet"))
		{
			RequestDispatcher rd=request.getRequestDispatcher("Welcome");
			rd.forward(request, response);
		}
		else
		{
			pw.println("Sorry username or Password is Wrong");
			RequestDispatcher rd=request.getRequestDispatcher("Index.html");
			rd.include(request, response);
		}
		doGet(request, response);
	}

}
