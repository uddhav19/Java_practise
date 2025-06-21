package Jdbc_connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Connection_creation {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/jdbccon";
        String user = "root";
        String password = "Redmi@8265";

        Connection con= null;
        Statement statement = null;
        con= DriverManager.getConnection(url,user,password);
        if (con != null) {
            System.out.println("Connection created successfully!");
        } else {
            System.out.println("Failed to create connection.");
        }

        statement = con.createStatement();
        String sql = "CREATE TABLE IF NOT EXISTS student (" +
                "id INT PRIMARY KEY AUTO_INCREMENT," +
                "name VARCHAR(50)," +
                "email VARCHAR(50)," +
                "age INT" +
                ")";
        statement.executeUpdate(sql);
        System.out.println("Table 'student' created successfully!");


    }
}
