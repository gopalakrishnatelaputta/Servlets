package cookie;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GetCookie
 */
public class GetCookie extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public GetCookie() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Cookie [] c=request.getCookies();
		PrintWriter pw=response.getWriter(); 
		pw.println("<html><body bgcolor=cyan text=blue>");
		pw.println("<h1><u>Selected books</u></h1>");
		for(Cookie v:c)
		{
			pw.println(v.getValue()+"<br> ");
		}
		pw.println("</body></html>");
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	

}
