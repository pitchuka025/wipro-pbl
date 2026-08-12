import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class EmployeeServlet extends HttpServlet {
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        
        String name = request.getParameter("name");
        String idStr = request.getParameter("id");
        String designation = request.getParameter("designation");
        
        try {
            int id = Integer.parseInt(idStr);
            
            // Create Employee object
            Employee emp = new Employee(name, id, designation);
            
            // Insert into database
            boolean inserted = DatabaseConnection.insertEmployee(emp);
            
            if (inserted) {
                // Set success message and forward to success page
                request.setAttribute("success", "Employee added successfully!");
                request.setAttribute("name", name);
                request.setAttribute("id", id);
                request.setAttribute("designation", designation);
                
                RequestDispatcher dispatcher = request.getRequestDispatcher("employee_success.jsp");
                dispatcher.forward(request, response);
            } else {
                // Error adding employee
                request.setAttribute("error", "Failed to add employee!");
                RequestDispatcher dispatcher = request.getRequestDispatcher("employee_error.jsp");
                dispatcher.forward(request, response);
            }
            
        } catch (NumberFormatException e) {
            response.setContentType("text/html");
            PrintWriter out = response.getWriter();
            out.println("<h2>Error: Please enter a valid employee ID!</h2>");
            out.println("<a href='assignment3.html'>Back</a>");
        }
    }
}
