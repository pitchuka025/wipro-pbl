package com.example;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/checkEmail")
public class EmailCheckServlet extends HttpServlet {

    private static final String URL =
            "jdbc:oracle:thin:@localhost:1521/XEPDB1";

    private static final String USERNAME =
            "system";

    private static final String PASSWORD =
            "your_password";


    protected void doGet(
            HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/plain");

        PrintWriter out = response.getWriter();

        // Get email from AJAX request
        String email = request.getParameter("email");

        if (email == null || email.trim().isEmpty()) {

            out.print("Not Available");

            return;
        }

        email = email.trim();

        Connection connection = null;

        PreparedStatement statement = null;

        ResultSet resultSet = null;

        try {

            // Load Oracle JDBC driver
            Class.forName("oracle.jdbc.OracleDriver");

            // Connect to database
            connection = DriverManager.getConnection(
                    URL,
                    USERNAME,
                    PASSWORD
            );

            /*
             * UPPER() is used so that:
             *
             * RUPA@GMAIL.COM
             * rupa@gmail.com
             * Rupa@gmail.com
             *
             * are treated as the same email.
             */

            String sql =
                    "SELECT EMAIL FROM PROFILE " +
                    "WHERE UPPER(EMAIL) = UPPER(?)";

            statement =
                    connection.prepareStatement(sql);

            statement.setString(1, email);

            resultSet = statement.executeQuery();

            if (resultSet.next()) {

                // Email exists
                out.print("Available");

            } else {

                // Email does not exist
                out.print("Not Available");
            }

        } catch (Exception e) {

            e.printStackTrace();

            out.print("Not Available");

        } finally {

            try {
                if (resultSet != null)
                    resultSet.close();
            } catch (Exception e) {
            }

            try {
                if (statement != null)
                    statement.close();
            } catch (Exception e) {
            }

            try {
                if (connection != null)
                    connection.close();
            } catch (Exception e) {
            }
        }
    }
}