package FileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyFile {
	
	String filepath = "C:\\Users\\DELL\\eclipse-workspace\\BesantTambaramSep2024\\Input\\envtest.properties";
	
	public void readData() throws IOException
	{
		File F = new File(filepath); // inbuild class in java 
		
		FileInputStream FI = new FileInputStream(F); // inbuild class in java 
		
		Properties P = new Properties(); // inbuild class in java 
		
		P.load(FI);
		
		System.out.println(P.getProperty("name"));
		System.out.println(P.getProperty("age"));
		P.setProperty("gender", "male");
		System.out.println(P.getProperty("gender"));
//		/int nage = Integer.parseInt(P.getProperty("age1"))+Integer.parseInt(P.getProperty("age2"));
		//System.out.println(nage);
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		PropertyFile P = new PropertyFile();
		P.readData();
	}

}
