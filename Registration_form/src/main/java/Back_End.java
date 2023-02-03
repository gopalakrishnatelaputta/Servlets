

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class Back_End extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public Back_End() {
        super();
        
    }

	
	/*protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}*/

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		String name = request.getParameter("Name");
        String phone = request.getParameter("Phone_number");
        String gender = request.getParameter("Gender");
        String duration = request.getParameter("Duration");
        String batch = request.getParameter("Batch");
        String batch_time = request.getParameter("Batch_Time");
        String address = request.getParameter("Address");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String Email = request.getParameter("Email");
		try { 
        	Class.forName("oracle.jdbc.driver.OracleDriver");
            //creating connection with the database
            Connection con = DriverManager.getConnection
                        ("jdbc:oracle:thin:@localhost:1521:ORCL","c##batch4pm","nareshit");
 
            PreparedStatement ps = con.prepareStatement
                        ("insert into student values(?,?,?,?,?,?,?,?,?,?)");
           
            ps.setString(1, name);
            ps.setString(2, phone);
            ps.setString(3, gender);
            ps.setString(4, duration);
            ps.setString(5, batch);
            ps.setString(6, batch_time);
            ps.setString(7, address);
            ps.setString(8, username);
            ps.setString(9, password);
            ps.setString(10, Email);
            
            
            int i = ps.executeUpdate();
            
            if(i > 0) {
            	out.println();
                out.println("You are successfully registered at ONLINE TRAINING PLATFORM  :");
                out.println();
            }
         
        }
        catch(Exception se) {
            se.printStackTrace();
        }
            out.println("<html><body>");
            
            //out.println("Details Submitted and Successfully registered  :");
            out.println("<table border=1><tr>"+"<td><b>name</b></td>"+"<td><b>Phone Number</b></td>"+
            "<td><b>Gender</b></td>"+"<td><b>Duration</b></td>"+"<td><b>Batch</b></td>"+
            		"<td><b>Batch_Time</b></td>"+"<td><b>Address</b></td>"+"<td><b>Username</b></td>"+
            "<td><b>Password</b></td>"+"<td><b>Email Id</b></td>");
            
            out.println("<tr>"+"<td>"+name+"</td>"+"<td>"+phone+"</td>"+"<td>"+gender+"</td>"+"<td>"+duration+"</td>"
            		+"<td>"+batch+"</td>"+"<td>"+batch_time+"</td>"+"<td>"+address+"</td>"+"<td>"+username+"</td>"
            		+"<td>"+password+"</td>"+"<td>"+Email+"</td>");
            
            
            out.println(name);
            
             
		//doGet(request, response);
	}
	
}

