import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

@WebServlet("/httpservlet")

public class Crud_opearations extends HttpServlet {
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/crud_oper";
    private static final String JDBC_USER = "root";
    private static final String JDBC_PASS = "Redmi@8265";

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String name = request.getParameter("name");
        String email = request.getParameter("email");

        PrintWriter out = response.getWriter();
        response.setContentType("text/html");

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASS);


            String sql = "INSERT INTO users (name, email) VALUES (?, ?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, name);
            stmt.setString(2, email);

            int rowsInserted = stmt.executeUpdate();
            if (rowsInserted > 0) {
                out.println("<h3>User added successfully!</h3>");
            } else {
                out.println("<h3>Failed to add user.</h3>");
            }

            stmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace(out);
        }
    }





    }
