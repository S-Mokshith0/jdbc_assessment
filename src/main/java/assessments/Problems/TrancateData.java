package assessments.Problems;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TrancateData {
	public void beginn() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection cnt = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root","moks" );
		Statement smt = cnt.createStatement();
		String s = "TRUNCATE TABLE emp_details";
		smt.executeUpdate(s);
		System.out.println("Table is trancated");
	}

}
