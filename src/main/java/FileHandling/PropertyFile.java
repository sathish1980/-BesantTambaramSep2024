package FileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyFile {
	
	String filepath = "C:\\Users\\DELL\\eclipse-workspace\\BesantTambaramSep2024\\Input\\env.properties";
	
	public void readData() throws IOException
	{
		File F = new File(filepath);
		FileInputStream FI = new FileInputStream(F);
		Properties P = new Properties();
		P.load(FI);
		System.out.println(P.getProperty("age"));
		System.out.println(P.getProperty("batch"));
		P.setProperty("age", "30");
		System.out.println(P.getProperty("age"));
		int nage = Integer.parseInt(P.getProperty("age1"))+Integer.parseInt(P.getProperty("age2"));
		System.out.println(nage);
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		PropertyFile P = new PropertyFile();
		P.readData();
	}

}
