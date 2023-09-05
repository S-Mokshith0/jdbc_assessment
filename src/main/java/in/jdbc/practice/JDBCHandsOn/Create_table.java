package in.jdbc.practice.JDBCHandsOn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;



public class Create_table {
	public static void main(String[]args) throws ClassNotFoundException,SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection cnt = DriverManager.getConnection("jdbc:mysql://localhost:3306/", "root", "moks");
		Statement smt = cnt.createStatement();
		String s = "CREATE TABLE employee.emp_details(emp_id INT NOT NULL, emp_name VARCHAR(45), designation VARCHAR(19), qualification VARCHAR(19), dob DATE, contact VARCHAR(10), city VARCHAR(15), salary INT, experience INT)";
		smt.executeUpdate(s);
		System.out.println("created table");	
		}
}
