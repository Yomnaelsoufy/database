package eg.edu.alexu.csd.oop.db;

import java.io.File;
import java.sql.SQLException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class databasee implements Database {
	String dataname;

	
private String getname(String s) {
	String[] arr = s.split(" ");    

String x = "";
for(int i=0;i<arr[2].indexOf("(");i++) {
x+=arr[2].charAt(i);
}
	return x;
	
}
	@Override
	public String createDatabase(String databaseName, boolean dropIfExists) {
		dataname=databaseName;
		Files y = new Files();
		try {
			if (y.isDatabaseExist(databaseName) && dropIfExists) {
				executeStructureQuery("DROP database " + databaseName);
			} else if (y.isDatabaseExist(databaseName) && !dropIfExists) {
				executeStructureQuery("DROP database " + databaseName);
				executeStructureQuery("CREATE database " + databaseName);
			} else {
				executeStructureQuery("CREATE database " + databaseName);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println(y.getpathof(databaseName));
		return y.getpathof(databaseName);
	}

	@Override
	public boolean executeStructureQuery(String query) throws SQLException {
		query=	query.toLowerCase();
		
		
		if (query.contains("create") && query.contains("database")) {
			
			String databasename =getname(query);
			Files f=new Files();
			f.createDatabase(databasename);
			System.out.println( f.isDatabaseExist(databasename));
			return f.isDatabaseExist(databasename);

		}
		if(query.contains("create") && query.contains("table")) {
			Files f=new Files();
			System.out.println(f.isDatabaseExist(dataname));
			/*if(!f.isDatabaseExist(dataname)) {
				return false;
			}*/
			String tablename=getname(query);
			f.createtable(tablename, dataname);
			System.out.println(f.isTableExist(tablename, dataname));
			System.out.println(dataname);
			return f.isTableExist(tablename, dataname);
			
		}
		if(!query.contains("create") || !query.contains("database")||!query.contains("drop") || !query.contains("table")){
			return false;
		} 
		return false;
	}

	@Override
	public Object[][] executeQuery(String query) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int executeUpdateQuery(String query) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

}
