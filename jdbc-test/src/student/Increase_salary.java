package student;

public class Increase_salary {
	//public static class Array_reverse {
		   public int[] reversenum(int[] nums) {		  
			   int start_index=0;
			   int end_index=nums.length-1;
			   while (end_index<start_index) {
				   int temp=nums[start_index];
					nums[start_index]=nums[end_index];
					nums[end_index]=temp;
				start_index++;
				end_index--;
			}
			   return nums;
		}
		   
		public static void main(String[] args) {
			int[] arr= {1,2,3,4,5};
			 Increase_salary a=new  Increase_salary();
			System.out.println(a.reversenum(arr));

	//public static void main(String[] args) throws Exception {

		/*Connection myConn = null;
		CallableStatement myStmt = null;

		try {
			// Get a connection to database
			myConn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/demo", "root", "root");

			String theDepartment = "Engineering";
			int theIncreaseAmount = 10000;
			
			// Show salaries BEFORE
			System.out.println("Salaries BEFORE\n");
			showSalaries(myConn, theDepartment);

			// Prepare the stored procedure call
			myStmt = (CallableStatement) myConn
					.prepareCall("{call increase_salaries_for_department(?, ?)}");

			// Set the parameters
			myStmt.setString(1, theDepartment);
			myStmt.setDouble(2, theIncreaseAmount);

			// Call stored procedure
			System.out.println("\n\nCalling stored procedure.  increase_salaries_for_department('" + theDepartment + "', " + theIncreaseAmount + ")");
			myStmt.execute();
			System.out.println("Finished calling stored procedure");

			// Show salaries AFTER
			System.out.println("\n\nSalaries AFTER\n");
			showSalaries(myConn, theDepartment);

		} catch (Exception exc) {
			exc.printStackTrace();
		} finally {
			close(myConn, myStmt, null);
		}
	}

	private static void close(Connection myConn, CallableStatement myStmt, Object myRs) {
		// TODO Auto-generated method stub
		
	}

	private static void showSalaries(Connection myConn, String theDepartment) throws SQLException {
		PreparedStatement myStmt = null;
		ResultSet myRs = null;

		try {
			// Prepare statement
			myStmt = myConn
					.prepareStatement("select * from employees where department=?");

			myStmt.setString(1, theDepartment);
			
			// Execute SQL query
			myRs = myStmt.executeQuery();

			// Process result set
			while (myRs.next()) {
				String lastName = myRs.getString("last_name");
				String firstName = myRs.getString("first_name");
				double salary = myRs.getDouble("salary");
				String department = myRs.getString("department");
				
				System.out.printf("%s, %s, %s, %.2f\n", lastName, firstName, department, salary);
			}
		} catch (Exception exc) {
			exc.printStackTrace();
		} finally {
			close(myStmt, myRs);
		}

	}

	private static void close(PreparedStatement myStmt, ResultSet myRs) {
		// TODO Auto-generated method stub
		
	}

	private static void close(Connection myConn, Statement myStmt,
			ResultSet myRs) throws SQLException {
		if (myRs != null) {
			myRs.close();
		}

		if (myStmt != null) {
			((java.sql.Statement) myStmt).close();
		}

		if (myConn != null) {
			myConn.close();
		}
	}

	private static void close(Statement myStmt, ResultSet myRs)
			throws SQLException {

		close(null, myStmt, myRs);*/
	}
}
