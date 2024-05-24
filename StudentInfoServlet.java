import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

@WebServlet("/StudentInfoServlet")
public class StudentInfoServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public StudentInfoServlet() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        Enumeration<String> en = request.getParameterNames();
        while (en.hasMoreElements()) {
            String nameReceived = en.nextElement();
            out.print(nameReceived + "=");

            String valueReceived = request.getParameter(nameReceived);
            out.println(valueReceived);

            out.println(" ");
        }

        // Additional logic if needed

        response.getWriter().append("Served at: ").append(request.getContextPath());
    }
}
