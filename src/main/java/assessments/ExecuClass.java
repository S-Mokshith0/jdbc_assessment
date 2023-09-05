package assessments;

import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.Scanner;

import assessments.Problems.Alter_Data;
import assessments.Problems.Create_Database;
import assessments.Problems.Create_table;
import assessments.Problems.DeleteRow;
import assessments.Problems.Dropcolumn;
import assessments.Problems.InsertData;
import assessments.Problems.RetriveData;
import assessments.Problems.TrancateData;



public class ExecuClass implements begin {

	public void beginn() throws ClassNotFoundException, SQLException, ParseException, IOException {
		Scanner sc = new Scanner(System.in);
		System.out.print("Give the day no you want to access the questions: ");
		int DayNo = sc.nextInt();
		switch (DayNo) {
		case 1:
			Create_Database createdatabase = new Create_Database();
			createdatabase.beginn();
		case 2:
			Create_table create_table =new Create_table();
			create_table.beginn();
		case 3:
			InsertData insertdata = new InsertData();
			insertdata.beginn();
		case 4:
			Alter_Data alter_data = new Alter_Data();
			alter_data.beginn();
		case 5:
			Dropcolumn dropcolumn = new Dropcolumn();
			dropcolumn.beginn();
		case 6:
			RetriveData retrivedata = new RetriveData();
			retrivedata.beginn();
		case 7:
			DeleteRow deleterow = new DeleteRow();
			deleterow.beginn();
		case 8:
			TrancateData trancatedata = new TrancateData();
			trancatedata.beginn();
		}
	}
}
