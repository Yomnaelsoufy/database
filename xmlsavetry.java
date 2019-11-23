package eg.edu.alexu.csd.oop.db;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Vector;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;



public class xmlsavetry {
	
	static Vector<String[]> s = new Vector<String[]>();

    public static void save() {
   
     
         String path= "C:\\Users\\Dell\\Desktop\\v.xml";
      
        try {
            FileOutputStream Route = new FileOutputStream(new File(path));
            XMLEncoder input = new XMLEncoder(Route);
            input.writeObject(s.size());
            for (int i = 0; i < s.size(); i++) {
                input.writeObject(s.get(i));
            }
            input.close();
            Route.close();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Try again.");
            e.printStackTrace();
        }
    }
 
    public void load(String path) {
       
        try {
            String type = "";
            int j = path.lastIndexOf('.');
            if (j >= 0) {
                type = path.substring(j + 1);
            }
            if (!type.equals("xml")) {
                JOptionPane.showMessageDialog(null, "Invalid file type, Try again.");
            } else {
           
                FileInputStream Route = new FileInputStream(new File(path));
                XMLDecoder op = new XMLDecoder(Route);
                String x = op.readObject().toString();
                for (int i = 0; i < Integer.parseInt(x); i++) {
                s.add( (String[]) op.readObject());          }
            }  
        }
        catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Try again.");
            e.printStackTrace();
        }
 
    }
	
	public static void add2dvector(Vector<String[]> s ) {
		String []t=new String[3];
		t[0]="er";
		t[1]="ervv";
		s.add(t);
System.out.println(s.size());

		
	}
	public static void main(String[] args) {
	databasee d=new databasee();
	d.createDatabase("ervv", true);

	}

}
