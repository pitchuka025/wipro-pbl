import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class BidServlet extends HttpServlet {
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        
        try {
            // Get form parameters
            String itemId = request.getParameter("itemId");
            String itemName = request.getParameter("itemName");
            String bidderName = request.getParameter("yourName");
            String bidderEmail = request.getParameter("email");
            String bidAmountStr = request.getParameter("bidAmount");
            String autoIncrementStr = request.getParameter("autoIncrement");
            
            // Validate inputs
            if (itemId == null || itemId.trim().isEmpty() ||
                itemName == null || itemName.trim().isEmpty() ||
                bidderName == null || bidderName.trim().isEmpty() ||
                bidderEmail == null || bidderEmail.trim().isEmpty() ||
                bidAmountStr == null || bidAmountStr.trim().isEmpty()) {
                
                response.sendRedirect("assignment1.html?error=missing_fields");
                return;
            }
            
            // Validate bid amount
            double bidAmount;
            try {
                bidAmount = Double.parseDouble(bidAmountStr);
                if (bidAmount <= 0) {
                    response.sendRedirect("assignment1.html?error=invalid_bid");
                    return;
                }
            } catch (NumberFormatException e) {
                response.sendRedirect("assignment1.html?error=invalid_amount");
                return;
            }
            
            // Validate email format
            if (!isValidEmail(bidderEmail)) {
                response.sendRedirect("assignment1.html?error=invalid_email");
                return;
            }
            
            // Check auto-increment flag
            boolean autoIncrement = "true".equals(autoIncrementStr);
            
            // Create Bid object (Java Bean)
            Bid bid = new Bid(itemId.trim(), itemName.trim(), bidderName.trim(), 
                            bidderEmail.trim(), bidAmount, autoIncrement);
            
            // Set bid as request attribute
            request.setAttribute("bid", bid);
            
            // Forward to JSP page
            request.getRequestDispatcher("bidConfirmation.jsp").forward(request, response);
            
        } catch (Exception e) {
            e.printStackTrace();
            response.sendRedirect("assignment1.html?error=server_error");
        }
    }
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        // Redirect GET requests to the HTML form
        response.sendRedirect("assignment1.html");
    }
    
    // Helper method to validate email format
    private boolean isValidEmail(String email) {
        String emailRegex = "^[^\\s@]+@[^\\s@]+\\.[^\\s@]+$";
        return email.matches(emailRegex);
    }
}
