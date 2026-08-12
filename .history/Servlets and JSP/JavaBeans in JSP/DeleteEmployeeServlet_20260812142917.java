import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class DeleteEmployeeServlet extends HttpServlet {
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        
        String idStr = request.getParameter("id");
        
        try {
            int id = Integer.parseInt(idStr);
            
            // Delete from database
            boolean deleted = DatabaseConnection.deleteEmployee(id);
            
            if (deleted) {
                request.setAttribute("message", "Employee deleted successfully!");
                request.setAttribute("type", "success");
            } else {
                request.setAttribute("message", "Failed to delete employee!");
                request.setAttribute("type", "error");
            }
            
            RequestDispatcher dispatcher = request.getRequestDispatcher("delete_result.jsp");
            dispatcher.forward(request, response);
            
        } catch (NumberFormatException e) {
            response.setContentType("text/html");
            PrintWriter out = response.getWriter();
            out.println("<h2>Error: Invalid employee ID!</h2>");
        }
    }
}
