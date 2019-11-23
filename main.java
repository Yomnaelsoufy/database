package eg.edu.alexu.csd.oop.db;

import java.sql.SQLException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class main {

	public static void main(String[] args) {
		
		
	/*	String s ="CREATE TABLE table_name4(column_name1 varchar, column_name2 int, column_name3 varchar)";
		String[] arr = s.split(" ");    
		System.out.println();
String x = "";
for(int i=0;i<arr[2].indexOf("(");i++) {
	x+=arr[2].charAt(i);
}System.out.println(x);
	
		    System.out.println(arr[2]);*/
		
		databasee d=new databasee();
		d.createDatabase( "TestDB", true);
		
	/*	Files f=new Files();
		f.createDatabase("TestDB");*/
		}

}
