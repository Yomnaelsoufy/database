package eg.edu.alexu.csd.oop.db;

import java.util.Vector;

public class column {
String name;
Vector<cell>c;
public column() {
	name=new String();
	c=new Vector<cell>();
}
public String getname() {
	return name;
}
public void setname(String n) {
	name=n;
}
public Vector<cell>  getcolumn() {
	return c;
}
public void setcolumn(Vector<cell>c) {
this.c=c;
}
public void addcell(cell x) {
	c.add(x);
}
}
