package jdbcDemo;
import java.sql.*;


/**
 * downloaded the JAR from https://dev.mysql.com/downloads/connector/j/ and added it to classpath.
 */

public class JdbcDemonstration {
	 // JDBC URL, username and password of MySQL server
    static final String JDBC_URL = "jdbc:mysql://localhost:3306/temp"; 
    static final String USER = "root"; 
    static final String PASSWORD = "123456"; 
    
    
    public static void main(String[] args) {
        Connection connection = null;

        try {
            // Loading MySQL JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establishing the connection
            connection = DriverManager.getConnection(JDBC_URL, USER, PASSWORD);
            System.out.println("Connected to MySQL database!");

            // Creating a Statement object to execute queries
            Statement stmt = connection.createStatement();

            // Creating table
            String createTableSQL = "CREATE TABLE IF NOT EXISTS students ("
                    + "id INT AUTO_INCREMENT PRIMARY KEY,"
                    + "name VARCHAR(100),"
                    + "age INT)";
            stmt.executeUpdate(createTableSQL);
            System.out.println("Table 'students' created.");

            // Inserting a row
            String insertSQL = "INSERT INTO students (name, age) VALUES ('Ilham', 21)";
            stmt.executeUpdate(insertSQL);
            System.out.println("Inserted one row into 'students'.");

            // Selecting rows
            String selectSQL = "SELECT * FROM students";
            ResultSet rs = stmt.executeQuery(selectSQL);

            System.out.println("Data from table:");
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int age = rs.getInt("age");

                System.out.println(id + ", " + name + ", " + age);
            }

            // Closing ResultSet and Statement
            rs.close();
            stmt.close();
        } catch (ClassNotFoundException e) {
            System.out.println("MySQL JDBC Driver not found.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Database error:");
            e.printStackTrace();
        } finally {
            // Closing connection
            try {
                if (connection != null && !connection.isClosed()) {
                    connection.close();
                    System.out.println("Disconnected from database.");
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }
}
