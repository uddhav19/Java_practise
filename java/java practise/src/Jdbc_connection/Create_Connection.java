package Jdbc_connection;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Create_Connection {
    public static Connection createconnection() throws ClassNotFoundException, SQLException {
        Connection con=null;
        Class.forName("com.mysql.cj.jdbc.Driver");
        con= DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcex1","root","Redmi@8265");
        System.out.println("connection created");
        return con;

    }
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        createconnection();

    }
}
