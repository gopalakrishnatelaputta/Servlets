

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

@WebServlet("GfgRegister")
public class GfgRegister extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public GfgRegister() {
        super();
        
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
     
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String pass = request.getParameter("pass");
       // out.print(name);
        try { 
        	Class.forName("oracle.jdbc.driver.OracleDriver");
            //creating connection with the database
            Connection con = DriverManager.getConnection
                        ("jdbc:oracle:thin:@localhost:1521:ORCL","c##batch4pm","nareshit");
 
            PreparedStatement ps = con.prepareStatement
                        ("insert into Gfglogin values(?,?,?)");
           
            ps.setString(1, name);
            ps.setString(2, email);
            ps.setString(3, pass);
            int i = ps.executeUpdate();
             
            if(i > 0) {
                out.println("You are successfully registered at geeksforgeeks");
            }
         
        }
        catch(Exception se) {
            se.printStackTrace();
        }
		//doGet(request, response);
	}

}
