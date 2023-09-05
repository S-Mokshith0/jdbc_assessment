package in.jdbc.practice.JDBCHandsOn;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class Retrive_Data {

	public static void main(String[] args) throws ClassNotFoundException,SQLException, IOException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection cnt = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root","moks" );
		Statement smt = cnt.createStatement();
		Scanner sc = new Scanner(System.in);
		int count = 0;

		while(count==0) {
			System.out.println("Enter 0 for continuing Retriving the Data");
			System.out.println("Enter 1 for Stopping Retriving the Data");
			count = sc.nextInt();
			sc.nextLine();
			if(count==0) {
				System.out.println("Give the EMPLOYEE ID: ");
				int id = sc.nextInt();
				String s ="SELECT * FROM emp_details where emp_id="+id; 
				PreparedStatement ps = cnt.prepareStatement(s);
				ResultSet rs = ps.executeQuery();
				while(rs.next()) {
					int id1=rs.getInt("emp_id");
					String name=rs.getString("emp_name");
					String designation= rs.getString("designation");
					String qualification=rs.getString("qualification");
					Date dateOfBirth = rs.getDate("dob");
					String contact=rs.getString("contact");
					int salary=rs.getInt("salary");
					int experience=rs.getInt("experience");
					System.out.println("The Employee id is "+id1);
					System.out.println("The Employee Name is "+name );
					System.out.println("The Employee Designation is"+designation);
					System.out.println("The Employee Qualification is "+qualification);
					System.out.println("The Employee Date of birth(YYYY-MM-DD) is "+dateOfBirth);
					System.out.println("The Employee Contact is "+contact);
					System.out.println("The Employee Slary is "+salary);
					System.out.println("The Employee Experiance is "+experience);
					
					 FileWriter writ = new FileWriter("C:\\Users\\senku.mokshith\\eclipse-workspace\\JDBCHandsOn\\src\\main\\java\\in\\jdbc\\practice\\JDBCHandsOn\\emp_data", false); 		     
					 BufferedWriter output = new BufferedWriter(writ);
				     LocalDateTime dateTime = LocalDateTime.now();
				     DateTimeFormatter forma = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
					 String formaDate = dateTime.format(forma);
					 
					 output.write("The Employee id is "+id1 + "\n");
					 output.write("The Employee Name is "+name + "\n");
					 output.write("The Employee Designation is"+designation + "\n");
					 output.write("The Employee Qualification is "+qualification + "\n");
					 output.write("The Employee Date of birth(YYYY-MM-DD) is "+dateOfBirth + "\n");
					 output.write("The Employee Contact is "+contact + "\n");
					 output.write("The Employee Slary is "+salary + "\n");
				     output.write("The Employee Experiance is "+experience + "\n");
				     output.write("   " + "\n");
				     output.write(formaDate + "\n");
				     output.close();
				}
				
				System.out.println();
				
			}
			else {
				System.out.println("Done with Task");
			}
			
		}
		
	}

}
