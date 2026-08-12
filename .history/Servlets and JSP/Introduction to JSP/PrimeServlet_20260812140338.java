import java.io.*;
import java.util.ArrayList;
import javax.servlet.*;
import javax.servlet.http.*;

public class PrimeServlet extends HttpServlet {
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        
        try {
            String numberStr = request.getParameter("number");
            int num = Integer.parseInt(numberStr);
            
            // Generate all prime numbers less than the given number
            ArrayList<Integer> primeNumbers = new ArrayList<>();
            
            if (num > 2) {
                primeNumbers.add(2); // 2 is prime
            }
            
            for (int i = 3; i < num; i += 2) {
                if (isPrime(i)) {
                    primeNumbers.add(i);
                }
            }
            
            // Store the list in request scope to forward to JSP
            request.setAttribute("primeList", primeNumbers);
            request.setAttribute("inputNumber", num);
            
            // Forward to JSP page
            RequestDispatcher dispatcher = request.getRequestDispatcher("assignment1_result.jsp");
            dispatcher.forward(request, response);
            
        } catch (NumberFormatException e) {
            response.setContentType("text/html");
            PrintWriter out = response.getWriter();
            out.println("<h2>Error: Please enter a valid number!</h2>");
            out.println("<a href='assignment1.html'>Back</a>");
        }
    }
    
    // Helper method to check if a number is prime
    private boolean isPrime(int num) {
        if (num <= 1) return false;
        if (num == 2) return true;
        if (num % 2 == 0) return false;
        
        for (int i = 3; i <= Math.sqrt(num); i += 2) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
