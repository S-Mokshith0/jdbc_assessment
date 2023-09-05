package in.jdbc.practice.JDBCHandsOn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class delete_row {
	public static void main(String[] args) throws ClassNotFoundException,SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection cnt = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root","moks" );
		Statement smt = cnt.createStatement();
		Scanner sc = new Scanner(System.in);
		int count = 0,s1=0;
		while(count==0) {
			System.out.println("Enter 0 for continuing Dropping the record");
			System.out.println("Enter 1 for Stopping Dropping the record");
			count = sc.nextInt();
			sc.nextLine(); 
			if(count==0) {
				System.out.print("Give the Employee ID you want to delete: ");
				s1 = sc.nextInt();
				String s ="DELETE FROM emp_details WHERE emp_id = "+s1; 
				smt.executeUpdate(s);
				System.out.println("Done with Deleting");
			}
			else {
				System.out.println("Done with the Task");
			}
		}
	}

}
