package eg.edu.alexu.csd.oop.db;

import java.io.File;
import java.sql.SQLException;
import java.util.Stack;
import java.util.Vector;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class parse {

 private static boolean checkparentheses(String s) {
	Stack<Object>check=new Stack();;
	for(int i=0;i<s.length();i++) {
		if(s.charAt(i)=='(') {
			check.add(s.charAt(i));
	
		for(int j=i+1;j<s.length();j++) {
			if(s.charAt(j)==')'&&j!=i+1) {
				check.pop();
				break;
			}
		}	}
		if(!check.isEmpty())
			return false;
	}
	
	if(check.isEmpty())
		return true;
	return false;
}
	public static void check(String s) throws SQLException {
		databasee d = new databasee();
		Pattern p = Pattern.compile("UPDATE|INSERT|DELETE|update|dalete|insert");
		if (s.contains("SELECT") || s.contains("select")) {

			d.executeQuery(s);
		} else if (s.contains("CREATE") || s.contains("create")) {

			d.createDatabase(s, false);
		} else if (s.contains("DROP") || s.contains("drop")) {

			d.createDatabase(s, true);
		} else if (p.matcher(s).find()) {
			d.executeUpdateQuery(s);
		} else {
			System.out.println("Bad Query!");
		}
	}
	

	public static void main(String[] args) {
	gui g=new gui();
	
		}

	public static boolean parser(String s) {

		Pattern p = Pattern.compile("INSERT | UPDATE | DELETE | delete | update | insert | *");
		Matcher m = p.matcher(s);
		m.find();
		if (m.group().length() == 7 || s.contains("==")) {
			return false;
		}
		if(!checkparentheses(s))
			return false;

		// type string instead of integer
		// p instanceof Integer

		return true;
	}
}
