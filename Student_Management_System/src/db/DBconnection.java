package db;
import java.sql.*;

public class DBconnection {
	private static final String url="jdbc:mysql://localhost:3306/student_db";
	private static final String user="root";
	private static final String pass="manju2512";
	
	public static Connection getConnection() throws SQLException{
		return DriverManager.getConnection(url,user,pass);
	}

}
