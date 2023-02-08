package conecion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class ClassA {
public static void main(String[] args) {
	System.out.println("hiii");
	try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL", "c##batch4pm", "nareshit");
		PreparedStatement ps=con.prepareStatement
                ("insert into Gfglogin values('tanis','jjshsh','megham')");
		//System.out.println("Successfully connected to database");
		
		int num=ps.executeUpdate();
		System.out.println("Successfully connected to database"+num);
		con.close();
	} catch (Exception e) {
		
		e.printStackTrace();
	}
}
}
