package finalexam;

	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.sql.Statement;
	import java.util.ArrayList;

	public class ListDAO {

		private String jdbcURL = "jdbc:mysql://localhost:3306/book_store";
		private String jdbcUsername = "root";
		private String jdbcPassword = "";
		private Connection jdbcConnection;
		
		public void connect() throws ClassNotFoundException {
			try {
				if (jdbcConnection == null || jdbcConnection.isClosed()) {
					Class.forName("com.mysql.jdbc.Driver");
					jdbcConnection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
					System.out.println("MySQL Connection Established");
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		public void disconnect() {
			try {
				if (jdbcConnection != null && !jdbcConnection.isClosed()) {
					jdbcConnection.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}


	
		
	}

