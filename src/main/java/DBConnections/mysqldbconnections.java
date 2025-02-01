package DBConnections;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class mysqldbconnections {
	
	public void readData()
	{
		try{  
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/fitaannanagar","root","Admin@123");  
			//here sonoo is database name, root is username and password  
			Statement stmt=con.createStatement();  
			DatabaseMetaData dbms = con.getMetaData();
			System.out.println(dbms.getDriverName());
			
			//DESCRIBE studentinfo;
			ResultSet rs=stmt.executeQuery("select * from course");  
			while(rs.next())  
			{
			//System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
			//System.out.println(rs.getString(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+"  "+rs.getString(4)+"  "+rs.getString(5));  
				if(rs.getInt(1)==2)
				{
					System.out.println("the course: " +rs.getString(2)+" already exist");
					break;
				}
			}
			
			con.close();  
			}catch(Exception e){ System.out.println(e);}  
			System.out.println("repo check");
			System.out.println("repo check2");
			System.out.println("repo check3");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mysqldbconnections m = new mysqldbconnections();
		m.readData();
	}

}
