package assessments.Problems;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class InsertData {
	public void beginn() throws ClassNotFoundException, SQLException, ParseException {
		Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "moks");
        String query = "INSERT INTO emp_details (emp_id, emp_name, designation, qualification, dob, contact, city, salary, experience) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement smt = con.prepareStatement(query);
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
        	System.out.println("Enter the employee id");
        	int id = sc.nextInt();
        	sc.nextLine();
            System.out.println("Enter the employee Name: ");
            String name = sc.nextLine();
            System.out.println("Enter the employee Designation: ");
            String designation = sc.nextLine();
            System.out.println("Enter the employee Qualification: ");
            String qualification = sc.nextLine();
            System.out.println("Enter the employee Date of Birth(in the format of YYYY-MM-DD): ");
            String date = sc.nextLine();
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            java.util.Date utilDate = dateFormat.parse(date);
            java.sql.Date dob = new java.sql.Date(utilDate.getTime());
            System.out.println("Enter the employee Contact Number: ");
            String contact = sc.nextLine();
            System.out.println("Enter the employee City: ");
            String city = sc.nextLine();
            System.out.println("Enter the employee Salary: ");
            int salary = Integer.parseInt(sc.nextLine());
            System.out.println("Enter the employee Year of Experience: ");
            int experience = Integer.parseInt(sc.nextLine());
            
            smt.setInt(1, id);
            smt.setString(2, name);
            smt.setString(3, designation);
            smt.setString(4, qualification);
            smt.setDate(5, dob);
            smt.setString(6, contact);
            smt.setString(7, city);
            smt.setInt(8, salary);
            smt.setInt(9, experience);

            smt.executeUpdate();
            
            System.out.println(i + 1 + " employee data is inserted");
        }
        
	}

}
