package Jdbc_connection;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

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

    //insert data
    public void savedata() throws SQLException, ClassNotFoundException {
        Connection con=Create_Connection.createconnection();
        Statement s = con.createStatement();
        int status=s.executeUpdate("insert into stud values(1,'uddhav', 'nashik')");
        if(status==1){
            System.out.println("data inserted successfully");
        }else {
            System.out.println("data is not inserted");
        }
        con.close();
    }

    //getsingledata
    public void getsingledata() throws SQLException, ClassNotFoundException {
        int id = 0;
        String name = null;
        String city = null;
        Connection con = Create_Connection.createconnection();
        Statement s = con.createStatement();
        ResultSet result = s.executeQuery("select * from stud where id=1");
        while ((result.next())) {
            id = result.getInt(1);
            name = result.getString(2);
            city = result.getString(3);

        }
        System.out.println("id=" + id);
        System.out.println("name=" + name);
        System.out.println("city=" + city);
        con.close();
    }
    public void getAlldata() throws SQLException, ClassNotFoundException {
        int id = 0;
        String name = null;
        String city = null;
        List<student> list=new ArrayList<>();
        Connection con = Create_Connection.createconnection();
        Statement s = con.createStatement();
        ResultSet result = s.executeQuery("select * from stud");
        while ((result.next())) {
            id = result.getInt(1);
            name = result.getString(2);
            city = result.getString(3);
            list.add(new student(id,name,city));

        }
        for(student s1:list){
            System.out.println("id=" + id);
            System.out.println("name=" + name);
            System.out.println("city=" + city);

        }
        con.close();
    }
    //delete data
    public void deletedata() throws SQLException, ClassNotFoundException {
        Connection con= Create_Connection.createconnection();
        Statement s=con.createStatement();
        int status=s.executeUpdate("delete from stud where id=1");
        if ((status == 1)) {

            System.out.println("data deleted successfully");
        }
        else {
            System.out.println("data not deleted");
        }

    }

    //preparedstatement-delete data
    public  void deletedata1() throws SQLException, ClassNotFoundException {
        Connection con=Create_Connection.createconnection();
        PreparedStatement p = con.prepareStatement("delete from stud where id=?");
        p.setInt(1,2);
        int status=p.executeUpdate();
        if(status==1){
            System.out.println("data deleted");
        }else {
            System.out.println("data not deleted");
        }

    }
    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        Create_Connection obj = new Create_Connection();
       // obj.createtable();
       // obj.savedata();
        //obj.getsingledata();
        //obj.getAlldata();
        //obj.deletedata();
        obj.deletedata1();

    }
}
