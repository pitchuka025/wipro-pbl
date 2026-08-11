import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/firsttime")
public class FirstTimeVisitorServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private static final String VISITOR_COOKIE = "visitorSeen";

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        boolean firstVisit = true;
        Cookie[] cookies = request.getCookies();
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if (VISITOR_COOKIE.equals(cookie.getName())) {
                    firstVisit = false;
                    break;
                }
            }
        }

        if (firstVisit) {
            Cookie visitorCookie = new Cookie(VISITOR_COOKIE, "yes");
            visitorCookie.setMaxAge(60 * 60 * 24 * 30); // keep for 30 days
            visitorCookie.setPath(request.getContextPath().isEmpty() ? "/" : request.getContextPath());
            response.addCookie(visitorCookie);
            response.getWriter().println("<html><body>");
            response.getWriter().println("<h2>Welcome, you are visiting for the first time</h2>");
            response.getWriter().println("</body></html>");
        } else {
            response.getWriter().println("<html><body>");
            response.getWriter().println("<h2>Welcome Back</h2>");
            response.getWriter().println("</body></html>");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }
}
