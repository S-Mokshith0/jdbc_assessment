package assessments.Problems;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Alter_Data {
	public void beginn() throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection cnt = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root","moks" );
		Statement smt = cnt.createStatement();
		Scanner sc = new Scanner(System.in);
		int count = 0;
		int u=0;
		String x,y;
		while(count==0) {
			System.out.println("Enter 0 for continuing updates");
			System.out.println("Enter 1 for Stopping the update");
			count = sc.nextInt();
			if(count==0) {
				System.out.println("Give the employee ID");
				u=sc.nextInt();
				sc.nextLine();
				System.out.println("GIVE THE employee Data you want to change");
				x=sc.nextLine();
				System.out.println("give the value");
				y=sc.nextLine();
				String s ="UPDATE emp_details SET "+x+"='"+y+"' where emp_id ="+u; 
				smt.executeUpdate(s);
				System.out.println("Done with updating the ");
	        }
			else {
				System.out.println("Done with the Task");
			}
			}
		}
	}
