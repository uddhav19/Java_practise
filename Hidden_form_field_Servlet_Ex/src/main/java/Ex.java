import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/servlet1")
public class Ex extends HttpServlet {
    public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
        res.setContentType("text/html");
        PrintWriter out= res.getWriter();
        String name= req.getParameter("uname");
        out.print("hello"+name);

        out.print("<form action='servlet2'>");
        out.print(" <input type='hidden' name='name' value="+name+">");
        out.print("<button type='submit'>click</button>");
        out.print("</form>");

    }
}
