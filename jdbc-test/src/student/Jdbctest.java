package student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbctest {

	public static void main(String[] args) throws SQLException {
		Connection conn=null;
		Statement stmt=null;
		 
		try {
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc-test","root","root");
			System.out.println("database connection successful");
			stmt=conn.createStatement();
			ResultSet res=stmt.executeQuery("show databases");
			
			while(res.next()) {
				System.out.println(res.getString("Database"));
			}
		}
		catch (Exception exc) {
			exc.printStackTrace();
		
		
		}
	}

}
