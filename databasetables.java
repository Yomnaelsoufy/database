package eg.edu.alexu.csd.oop.db;

import java.util.Vector;

public class databasetables {
String name ;
Vector<table>dt;
public databasetables() {
	name=new String();
	dt=new Vector<table>();
}
public String getname() {
	return name;
}
public void setname(String n) {
	name=n;
}
public void setdatabase(Vector<table>dt) {
	this.dt=dt;
}
public Vector<table> getdatabase(){
	return dt;
	
}
public void addtable(table t) {
	dt.add(t);
}
public void removetable(String n) {
	for (int i = 0; i<dt.size(); i++) {
		if (dt.elementAt(i).getname().equals(n)) {
			dt.remove(i);
		}
	}
}
}
