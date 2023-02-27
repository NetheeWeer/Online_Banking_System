package pack1;

import java.sql.Connection;
import java.sql.DriverManager;

public class DB {
	
	 //creating connection
	private static String url = "jdbc:mysql://localhost:3306/cardandaccount";
	private static String user = "root";
	private static String password = "lasitha";
	private static Connection con;
	
	public static Connection getConnection() {
		
		try {
			//establishing the connection
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(url,user,password);
			System.out.println("Succcessful");
	    }
		
		catch(Exception e){
			//detecting errors in the connection
			System.out.println("Unsuccessful");	
		}
		
		return con;
	
}
}
