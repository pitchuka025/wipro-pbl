import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class EditEmployeeServlet extends HttpServlet {
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        
        String idStr = request.getParameter("id");
        
        try {
            int id = Integer.parseInt(idStr);
            
            // Get employee from database
            Employee emp = DatabaseConnection.getEmployeeById(id);
            
            if (emp != null) {
                request.setAttribute("employee", emp);
                RequestDispatcher dispatcher = request.getRequestDispatcher("edit_employee.jsp");
                dispatcher.forward(request, response);
            } else {
                response.setContentType("text/html");
                PrintWriter out = response.getWriter();
                out.println("<h2>Employee not found!</h2>");
            }
            
        } catch (NumberFormatException e) {
            response.setContentType("text/html");
            PrintWriter out = response.getWriter();
            out.println("<h2>Error: Invalid employee ID!</h2>");
        }
    }
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        
        String name = request.getParameter("name");
        String idStr = request.getParameter("id");
        String designation = request.getParameter("designation");
        
        try {
            int id = Integer.parseInt(idStr);
            
            Employee emp = new Employee(name, id, designation);
            
            // Update in database
            boolean updated = DatabaseConnection.updateEmployee(emp);
            
            if (updated) {
                request.setAttribute("message", "Employee updated successfully!");
                request.setAttribute("type", "success");
            } else {
                request.setAttribute("message", "Failed to update employee!");
                request.setAttribute("type", "error");
            }
            
            RequestDispatcher dispatcher = request.getRequestDispatcher("update_result.jsp");
            dispatcher.forward(request, response);
            
        } catch (NumberFormatException e) {
            response.setContentType("text/html");
            PrintWriter out = response.getWriter();
            out.println("<h2>Error: Invalid employee ID!</h2>");
        }
    }
}
