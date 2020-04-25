package miniproject;

import java.sql.*;

public class db_helper {
	private static final String url = "jdbc:mysql://localhost:3306/ok";
	 static Connection con;
	 public static Connection getConnection() throws SQLException, ClassNotFoundException  {
        // Class.forName("com.mysql.jdbc.Driver");
		 java.sql.Connection con=null;
		 con=DriverManager.getConnection(url,"root","root123");
		// System.out.println("Get it");
		return con;

	 }
}
