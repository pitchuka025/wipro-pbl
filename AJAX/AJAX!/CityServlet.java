package com.example;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/cities")
public class CityServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");

        PrintWriter out = response.getWriter();

        // Get selected state from AJAX request
        String state = request.getParameter("state");

        // Display table
        out.println("<table>");

        out.println("<tr>");
        out.println("<th>State</th>");
        out.println("<th>City</th>");
        out.println("</tr>");

        if ("Andhra Pradesh".equals(state)) {

            out.println("<tr>");
            out.println("<td>Andhra Pradesh</td>");
            out.println("<td>Vijayawada</td>");
            out.println("</tr>");

            out.println("<tr>");
            out.println("<td>Andhra Pradesh</td>");
            out.println("<td>Visakhapatnam</td>");
            out.println("</tr>");

            out.println("<tr>");
            out.println("<td>Andhra Pradesh</td>");
            out.println("<td>Guntur</td>");
            out.println("</tr>");

            out.println("<tr>");
            out.println("<td>Andhra Pradesh</td>");
            out.println("<td>Tirupati</td>");
            out.println("</tr>");
        }

        else if ("Telangana".equals(state)) {

            out.println("<tr>");
            out.println("<td>Telangana</td>");
            out.println("<td>Hyderabad</td>");
            out.println("</tr>");

            out.println("<tr>");
            out.println("<td>Telangana</td>");
            out.println("<td>Warangal</td>");
            out.println("</tr>");

            out.println("<tr>");
            out.println("<td>Telangana</td>");
            out.println("<td>Karimnagar</td>");
            out.println("</tr>");
        }

        else if ("Karnataka".equals(state)) {

            out.println("<tr>");
            out.println("<td>Karnataka</td>");
            out.println("<td>Bengaluru</td>");
            out.println("</tr>");

            out.println("<tr>");
            out.println("<td>Karnataka</td>");
            out.println("<td>Mysuru</td>");
            out.println("</tr>");

            out.println("<tr>");
            out.println("<td>Karnataka</td>");
            out.println("<td>Mangaluru</td>");
            out.println("</tr>");
        }

        else if ("Tamil Nadu".equals(state)) {

            out.println("<tr>");
            out.println("<td>Tamil Nadu</td>");
            out.println("<td>Chennai</td>");
            out.println("</tr>");

            out.println("<tr>");
            out.println("<td>Tamil Nadu</td>");
            out.println("<td>Coimbatore</td>");
            out.println("</tr>");

            out.println("<tr>");
            out.println("<td>Tamil Nadu</td>");
            out.println("<td>Madurai</td>");
            out.println("</tr>");
        }

        else if ("Maharashtra".equals(state)) {

            out.println("<tr>");
            out.println("<td>Maharashtra</td>");
            out.println("<td>Mumbai</td>");
            out.println("</tr>");

            out.println("<tr>");
            out.println("<td>Maharashtra</td>");
            out.println("<td>Pune</td>");
            out.println("</tr>");

            out.println("<tr>");
            out.println("<td>Maharashtra</td>");
            out.println("<td>Nagpur</td>");
            out.println("</tr>");
        }

        else {

            out.println("<tr>");
            out.println("<td colspan='2'>No cities found</td>");
            out.println("</tr>");
        }

        out.println("</table>");
    }
}
