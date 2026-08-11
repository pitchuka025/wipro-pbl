import java.io.IOException;
import java.io.PrintWriter;import java.servlet.ServletConfig;
import java.servlet.ServletContext;
import java.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ConfigContextDemo extends HttpServlet {

    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");

        PrintWriter out = response.getWriter();

        // ServletConfig
        ServletConfig config = getServletConfig();
        String studentName = config.getInitParameter("studentName");

        // ServletContext
        ServletContext context = getServletContext();
        String collegeName = context.getInitParameter("collegeName");

        out.println("<html>");
        out.println("<body>");

        out.println("<h2>Servlet Config and Context Parameters</h2>");

        out.println("<h3>ServletConfig Parameter:</h3>");
        out.println("Student Name: " + studentName);

        out.println("<h3>ServletContext Parameter:</h3>");
        out.println("College Name: " + collegeName);

        out.println("</body>");
        out.println("</html>");
    }
}
