package assessments.Problems;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Create_Database {
	public void beginn() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection cnt = DriverManager.getConnection("jdbc:mysql://localhost:3306/", "root", "moks");
		Statement smt = cnt.createStatement();
		String s = "CREATE DATABASE EMPLOYEE";
		smt.executeUpdate(s);
		System.out.println("created database");
		
	}
	
}

