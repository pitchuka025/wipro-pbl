import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class OperationServlet extends HttpServlet {
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        
        try {
            String operationStr = request.getParameter("operation");
            int operation = Integer.parseInt(operationStr);
            
            RequestDispatcher dispatcher = null;
            
            if (operation < 10) {
                // Forward to Page 1
                request.setAttribute("message", "Input is less than 10");
                request.setAttribute("value", operation);
                dispatcher = request.getRequestDispatcher("page1.jsp");
            } 
            else if (operation >= 10 && operation <= 99) {
                // Forward to Page 2
                request.setAttribute("message", "Input is between 10 and 99");
                request.setAttribute("value", operation);
                dispatcher = request.getRequestDispatcher("page2.jsp");
            } 
            else {
                // Forward to Error Page
                request.setAttribute("message", "Input is 100 or greater");
                request.setAttribute("value", operation);
                dispatcher = request.getRequestDispatcher("error.jsp");
            }
            
            dispatcher.forward(request, response);
            
        } catch (NumberFormatException e) {
            response.setContentType("text/html");
            PrintWriter out = response.getWriter();
            out.println("<h2>Error: Please enter a valid number!</h2>");
            out.println("<a href='assignment2_q.html'>Back</a>");
        }
    }
}
