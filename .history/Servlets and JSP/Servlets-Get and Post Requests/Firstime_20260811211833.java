import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;
import java.util.Set;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/firsttime")
public class Firsttime extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    private void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter writer = response.getWriter()) {
            writer.println("<html><head><title>Request Parameters</title></head><body>");
            writer.println("<h2>Request Method: " + request.getMethod() + "</h2>");
            writer.println("<h3>Parameter Map</h3>");

            Map<String, String[]> parameterMap = request.getParameterMap();
            if (parameterMap.isEmpty()) {
                writer.println("<p>No request parameters were sent.</p>");
            } else {
                writer.println("<table border=1 cellpadding=4 cellspacing=0>");
                writer.println("<tr><th>Parameter Name</th><th>Value(s)</th></tr>");
                for (Map.Entry<String, String[]> entry : parameterMap.entrySet()) {
                    String name = entry.getKey();
                    String[] values = entry.getValue();
                    writer.println("<tr><td>" + escapeHtml(name) + "</td><td>");
                    if (values == null || values.length == 0) {
                        writer.println("<i>(no value)</i>");
                    } else {
                        for (int i = 0; i < values.length; i++) {
                            writer.print(escapeHtml(values[i]));
                            if (i < values.length - 1) {
                                writer.print("<br/>");
                            }
                        }
                    }
                    writer.println("</td></tr>");
                }
                writer.println("</table>");
            }

            writer.println("</body></html>");
        }
    }

    private String escapeHtml(String input) {
        if (input == null) {
            return "";
        }
        return input.replace("&", "&amp;")
                    .replace("<", "&lt;")
                    .replace(">", "&gt;")
                    .replace("\"", "&quot;")
                    .replace("'", "&#39;");
    }
}
