package file;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import oracle.sql.BFILE;

/**
 * Servlet implementation class FileDBSTORAGE
 */
public class FileDBSTORAGE extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FileDBSTORAGE() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
/*	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try{  
			Class.forName("oracle.jdbc.driver.OracleDriver");  
			Connection con=DriverManager.getConnection(  
			"jdbc:oracle:thin:@localhost:1521:orcl","c##batch4pm","nareshit");  
			              
			PreparedStatement ps=con.prepareStatement(  
			"insert into city_history values(?,?,?)");  
			              
			File f=new File("C:\\New folder\\myfile.txt.txt");  
			FileReader fr=new FileReader(f);  
			              
			ps.setInt(1,101);  
			ps.setString(2, "Delhi");
			//ps.setCharacterStream(3, fr, (int)city_his.length());
			int i=ps.executeUpdate();  
			System.out.println(i+" records affected");  
			              
			con.close();  
			              
			}catch (Exception e) {e.printStackTrace();}  
		doGet(request, response);
	}

}
