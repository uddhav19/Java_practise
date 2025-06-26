package Jdbc_connection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.*;

public class Jdbc_connection_Ex{
    public static Connection createconnection() throws ClassNotFoundException, SQLException {
        // 1. Load the driver (optional for newer versions)
        // 2. Connect to the database
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbccon","root","Redmi@8265");

        if (conn != null) {
            System.out.println("Connection created successfully!");
        } else {
            System.out.println("Failed to create connection.");
        }

        return conn;
    }

    public void createtable() throws SQLException, ClassNotFoundException {
        //create a table
        Connection conn=Jdbc_connection_Ex.createconnection();
        Statement statement = conn.createStatement();
        String sql = "CREATE TABLE IF NOT EXISTS emploee (" +
                "id INT PRIMARY KEY AUTO_INCREMENT," +
                "name VARCHAR(50)," +
                "email VARCHAR(50)," +
                "age INT" +
                ")";
        statement.executeUpdate(sql);
        System.out.println("Table 'emploee' created successfully!");
        conn.close();
    }

    public  void insertintotable() throws SQLException, ClassNotFoundException {
        Connection conn=Jdbc_connection_Ex.createconnection();


        String insertQuery = "INSERT INTO emploee (name, email, age) VALUES (?,?,?)";
        PreparedStatement pstmt = conn.prepareStatement(insertQuery);
        pstmt.setString(1, "John");
        pstmt.setString(2,"uddhavhon@.com");
        pstmt.setInt(3, 22);
        pstmt.executeUpdate();
        System.out.println("emploee inserted.");
        conn.close();
    }

    public static void readdata() throws SQLException, ClassNotFoundException {
        Connection conn = Jdbc_connection_Ex.createconnection();
        String selectQuery = "SELECT * FROM emploee";
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(selectQuery);

        while (rs.next()) {
            System.out.println(rs.getInt("id") + " - " + rs.getString("name") +" - "+rs.getString("email")+ " - " + rs.getInt("age"));
        }

    }
    public static void deletedta() throws SQLException, ClassNotFoundException {
        Connection conn = Jdbc_connection_Ex.createconnection();
        String deleteQuery = "DELETE FROM emploee WHERE id = ?";
        PreparedStatement pstmt = conn.prepareStatement(deleteQuery);
        pstmt.setInt(1, 1);
        int rows = pstmt.executeUpdate();
        System.out.println(rows + " record(s) deleted.");

    }
public static void updatedta() throws SQLException, ClassNotFoundException {
        Connection con = Jdbc_connection_Ex.createconnection();
        String updaatequery="update emploee set email= ? where id= ?";
        PreparedStatement statement = con.prepareStatement(updaatequery);

        statement.setString(1,"fdgdgdh");
    statement.setInt(2,2);
    int rows = statement.executeUpdate();
    System.out.println(rows + " record(s) updated.");
}


    public static void main(String[] args) throws IOException, SQLException, ClassNotFoundException {
        //readdata();
        //deletedta();
        updatedta();
























    }
}
