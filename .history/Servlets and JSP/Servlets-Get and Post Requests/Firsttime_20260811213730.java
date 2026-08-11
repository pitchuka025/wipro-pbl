import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;
import java.util.Set;
import javax.servlet.http.Cookie;
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

            // First-time visitor detection using a cookie named 'visited'
            boolean firstTime = true;
            Cookie[] cookies = request.getCookies();
            if (cookies != null) {
                for (Cookie c : cookies) {
                    if ("visited".equals(c.getName()) && "true".equals(c.getValue())) {
                        firstTime = false;
                        break;
                    }
                }
            }

            if (firstTime) {
                Cookie visited = new Cookie("visited", "true");
                visited.setMaxAge(60 * 60 * 24 * 365); // 1 year
                response.addCookie(visited);
                writer.println("<h2>Welcome, you are visiting for the first time</h2>");
            } else {
                writer.println("<h2>Welcome Back</h2>");
            }

            writer.println("<h3>Request Method: " + request.getMethod() + "</h3>");
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