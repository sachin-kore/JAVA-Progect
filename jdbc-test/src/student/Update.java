package student;

import java.sql.*;


public class Update {

	public static void main(String[] args) throws SQLException{
		Connection myConn = null;
		Statement myStmt = null;
		ResultSet myRs = null;
		
		String dbUrl = "jdbc:mysql://localhost:3306/demo";
		String user = "root";		
		String pass = "root";

		try {
			// Get a connection to database
			myConn = DriverManager.getConnection(dbUrl, user, pass);
			
			// Create a statement
			myStmt = myConn.createStatement();

			// Call helper method to display the employee's information
			System.out.println("BEFORE THE DELETE...");
			displayEmployee(myConn, "John", "Doe");
			
			// UPDATE the employee
			System.out.println("\nEXECUTING THE UPDATE FOR: John Doe\n");
			
			int rowsAffected = myStmt.executeUpdate(
					"delete employees " +
					"where first_name='John' and last_name='Doe' ");
					
			
			// Call helper method to display the employee's information
			System.out.println("AFTER THE DELETE...");
			displayEmployee(myConn, "John", "Doe");
			
		}
		catch (Exception exc) {
			exc.printStackTrace();
		}
		finally {
			close(myConn, myStmt, myRs);
		}
	}

	private static void displayEmployee(Connection myConn, String firstName, String lastName) throws SQLException {
		PreparedStatement myStmt = null;
		ResultSet myRs = null;
	}
	private static void close(Connection myConn, Statement myStmt,
			ResultSet myRs) throws SQLException {
		if (myRs != null) {
			myRs.close();
		}

		if (myStmt != null) {
			myStmt.close();
		}

		if (myConn != null) {
			myConn.close();
		}
	}

	private static void close(Statement myStmt, ResultSet myRs)
			throws SQLException {

		close(null, myStmt, myRs);
	}	
	}
