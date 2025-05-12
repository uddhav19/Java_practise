package Jdbc_connection;
import java.sql.*;

public class Create_Connection {
    public static Connection createconnection() throws ClassNotFoundException, SQLException {
        Connection con=null;
        Class.forName("com.mysql.cj.jdbc.Driver");
        con= DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcex1","root","Redmi@8265");
        System.out.println("connection created");
        return con;

    }

    public void createtable() throws SQLException, ClassNotFoundException {
        Connection con=Create_Connection.createconnection();
        Statement s = con.createStatement();
        boolean status=s.execute("create table stud(id int, name varchar(200), city varchar(200))");
        if (status==true){
            System.out.println("table not created");
        }else {
            System.out.println("table created");
        }
        con.close();
    }
    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        Create_Connection obj = new Create_Connection();
        obj.createtable();

    }
}
