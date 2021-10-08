package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.ResultSet;

public class SqlUtil {
	
	private static final String jdbcUrl = "jdbc:mysql://localhost:3306/mydb";
	private static final String user = "root";
	private static final String password="root";
	
	public static Object[][] readDB() {
        String query = "";
        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;
        Object result[][] = null;
        int row=0, col=0, i=0, j=0;

        try {
            // 1. create connection
            con = DriverManager.getConnection(jdbcUrl, user, password);

            // 2. create query
            stmt = con.createStatement();
            query = "SELECT name, job FROM users";

            // 3. execute query & store data in ResultSet
            rs = stmt.executeQuery(query);
            
            // create an Object[][] to store data
            col = rs.getMetaData().getColumnCount(); // Returns the number of columns in this ResultSet object.
            rs.last(); // Moves the cursor to the last row in this ResultSet object.
            row = rs.getRow(); // Retrieves the current row number. The first row is number 1, the second number 2, and so on. 
            result = new Object[row][col]; // create an Object array of given rows & columns
            rs.beforeFirst(); // Moves the cursor to the front of this ResultSet object, just before the first row

            // 4. store the fetched data into Object[][]
            while(rs.next()){
                for(j=0; j < col; j++) {
                	result[i][j] = rs.getString(i+1);
                }
                i++;
            }
        }
        
        catch (SQLException e) {
            e.printStackTrace();
        }
        
        finally{
            try {
                // 5. close the connection
                con.close();
            } 
            catch (SQLException e) {
                e.printStackTrace();
            }
        }
        
        return result;
	}
	
	public static void updateDB() {
		
		String query = "";
        boolean b;
        Connection con = null;
        Statement stmt = null;

        try {
            // 1. create connection
            con = DriverManager.getConnection(jdbcUrl, user, password);

            // 2. create query
            stmt = con.createStatement();
            query = "INSERT INTO users VALUES('smith','doctor')";

            // 3. execute query
            b = stmt.execute(query);
            if(b == true) {
            	System.out.println("Query Executed Successfully");
            }
        } 
        catch (SQLException e) {
            e.printStackTrace();
        }
        finally{
            try {
                // 4. close the connection
                con.close();
            } 
            catch (SQLException e) {
                e.printStackTrace();
            }
        }
		
	}
	

}
