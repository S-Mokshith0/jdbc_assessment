package assessments.Problems;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Dropcolumn {
	public void beginn() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection cnt = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root","moks" );
		Statement smt = cnt.createStatement();
		Scanner sc = new Scanner(System.in);
		int count = 0;
		String s1;
		while(count==0) {
			System.out.println("Enter 0 for continuing Dropping the columns");
			System.out.println("Enter 1 for Stopping Dropping the columns");
			count = sc.nextInt();
			sc.nextLine(); 
			if(count==0) {
				System.out.println("Give the column you want to Drop");
				s1 = sc.nextLine();
				String s ="ALTER TABLE emp_details DROP COLUMN "+s1; 
				smt.executeUpdate(s);
				System.out.println("Done with updating");
			}
			else {
				System.out.println("Done with the Task");
			}
		}
	}

}
