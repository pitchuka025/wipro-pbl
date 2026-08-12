import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class DisplayEmployeeServlet extends HttpServlet {
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        
        // Get all employees from database
        ResultSet rs = DatabaseConnection.getAllEmployees();
        
        // Forward to display page
        request.setAttribute("employeeList", rs);
        RequestDispatcher dispatcher = request.getRequestDispatcher("display_employees.jsp");
        dispatcher.forward(request, response);
    }
}
