package in.jdbc.practice.JDBCHandsOn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateDatabase {
	public static void main(String[] args) throws ClassNotFoundException,SQLException{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection cnt = DriverManager.getConnection("jdbc:mysql://localhost:3306/", "root", "moks");
		Statement smt = cnt.createStatement();
		String s = "CREATE DATABASE EMPLOYEE";
		smt.executeUpdate(s);
		System.out.println("created database");
		
	}

	public void beginn() {
		// TODO Auto-generated method stub
		
	}

}
