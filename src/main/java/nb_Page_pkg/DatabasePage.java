
// On Saturday, July 30, 2023, BDD class 3, sess 3 with MS Islam


package nb_Page_pkg;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class DatabasePage {

	
	
	
	
	// info.cukes : back in the days, it only works with .....
		// before cucumber came, there used to another plugin called "natural"...
	
	// io.cucumber : is newer plugin they use it instead of the older one

	
	// start with double quote then add backslash in front of it and add small brace, then add square brace inside of that small brace...
		// then ^\  
		// \"([^\"]*)\"
	
	
	// =========== ============ ============== ============= ================ ============ =======
	
	
	// Globally declaring 3 different interfaces we would be needing to deal with this mysql 
			Connection connection;
			Statement statement;
			ResultSet resultSet;
			String columnValue;
	
	
	public String getDataFromMySQLDb(String columnName) {   
		
		
		// Set properties of mySQL : 
		try {
		
			Class.forName("com.mysql.cj.jdbc.Driver");    // which database and driver you want to insert goes inside that small parenthesis
				// it returns com.mysql.jdbc.Driver class and register the driver only
			
			// Formula:
//			String sqlUrl = "jdbc:mysql://hostName:portNumber/dbName";    // do this exactly if you are doing with local mysql
			String sqlUrl = "jdbc:mysql://localhost:3306/feb23BDD";
			String sqlUsername = "root";
			String sqlPassword = "password";
			String sqlQuery = "Select * from users;";
			
			// Create connection to the local database:
			connection = DriverManager.getConnection(sqlUrl, sqlUsername, sqlPassword);
			
			// Empower the connection reference variable to execute queries:
			statement = connection.createStatement();
			
			// Deliver the query:
			resultSet = statement.executeQuery(sqlQuery);
			
			while(resultSet.next()) {
				// .next will get the data from the first row, and afterwards, it goes automatically to the next row to get its data
				columnValue = resultSet.getString(columnName);
					// this will help us to just enter whatever we needed while we execute the method....instead of specifying the columnNames here
				
			}
			
			
		/*
		} catch (Exception e) {
			e.printStackTrace();
		}
		*/
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}   
		
		finally {
			if(resultSet != null) {
				try {
					resultSet.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			
			if(connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		
		
		return columnValue;
	}
	
	
}
