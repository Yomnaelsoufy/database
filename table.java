package eg.edu.alexu.csd.oop.db;

import java.util.Vector;

public class table {
	String name;
	Vector<column> t ;
	public table() {
		name=new String();
		t=new Vector<column>();
	}
	public String getname() {
		return name;
	}
	public void setname(String n) {
		name=n;
	}
	public void settable(Vector<column> t) {
		this.t = t;
	}
	
	public Vector<column> gettable() {
		return t;
	}
	
	public void addcolumn(column c) {
		t.add(c);
	}
	
	public void removecolumn(String n) {
		for (int i = 0; i<t.size(); i++) {
			if (t.elementAt(i).getname().equals(n)) {
				t.remove(i);
			}
		}
	}

}