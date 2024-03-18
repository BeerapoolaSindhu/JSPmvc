package pack;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {
	
	private static final String URL="jdbc:oracle:thin:@localhost:1521:xe";
	private static final String USER="system";
	private static final String PASSWORD="sindhu";
	
	public static Connection getConnection() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			return DriverManager.getConnection(URL,USER,PASSWORD);
			
			}
		catch(Exception e) {
			//handles connection errors
			e.printStackTrace();
			return null;
		}
	}

}
