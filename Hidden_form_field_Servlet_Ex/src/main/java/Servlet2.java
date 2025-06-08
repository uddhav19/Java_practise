import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/servlet2")
public class Servlet2 extends HttpServlet {
    public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {


        PrintWriter out= res.getWriter();
        String name= req.getParameter("name");
        out.print("hello"+name);
    }
}
