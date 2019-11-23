package eg.edu.alexu.csd.oop.db;

import java.io.File;
import java.io.IOException;

public class Files {
	private File path;
	private String fs = System.getProperty("file.separator");

	Files() {
		path = new File("DD");
		path.mkdirs();
	}

	public String getpathof(String n) {
		return path.getAbsolutePath() + fs + n;
	}

	public boolean isDatabaseExist(String n) {
		File f = new File(path + fs + n);
		return f.exists();
	}

	public void createDatabase(String n) {
		File newDataBase = new File(path + fs + n);
		newDataBase.mkdirs();
		System.out.println(newDataBase.exists());
	}

	public void DropDatabase(String n) {
		File p = new File(path + fs + n);
		File[] f = p.listFiles();
		for (File c : f) {
			c.delete();
		}
		p.delete();
	}

	public void createtable(String tn, String dtn) {
		File xml = new File(path + fs + dtn + fs + tn + ".xml");
		File dtd = new File(path + fs + dtn + fs + tn + ".dtd");
		try {
			xml.createNewFile();
			dtd.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public boolean isTableExist(String tn, String dtn) {
		File xml = new File(path + fs + dtn + fs + tn + ".xml");
		File dtd = new File(path + fs + dtn + fs + tn + ".dtd");
		return xml.exists() && dtd.exists();
	}

	public void dropTable(String tn, String dtn) {
		File xml = new File(path + fs + dtn + fs + tn + ".xml");
		File dtd = new File(path + fs + dtn + fs + tn + ".dtd");
		xml.delete();
		dtd.delete();
	}

}
