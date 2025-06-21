<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Area of Circle</title>
</head>
<body>
    <h2>Calculate Area of a Circle</h2>

    <form method="get">
        Enter radius: <input type="text" name="radius" />
        <input type="submit" value="Calculate" />
    </form>

<%
    String radius = request.getParameter("radius");
    if (radius != null && !radius.isEmpty()) {
        try {
            double r = Double.parseDouble(radius);
%>
            <p>Area of circle is: <%= areacircle(r) %></p>
<%
        } catch (NumberFormatException e) {
%>
            <p style="color:red;">Please enter a valid number.</p>
<%
        }
    }
%>

<%!
    // Declaration block (shared across JSP)
    double areacircle(double r) {
        return 3.14 * r * r;
    }
%>

</body>
</html>
