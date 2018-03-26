import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;


@WebServlet(name = "HelloServlet", urlPatterns = "/hello")
public class HelloWorldServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        if (name == null) {
            name = "World";
        }

        response.getWriter().println("Hello" + " " + name);
//        response.getWriter().println("<p>Enter name:</p>");
//        response.getWriter().println("<form>");
//        response.getWriter().println("< input name=\"name\" />");
//        response.getWriter().println("</form>");

//        response.getWriter().println("Hello World!");

    }
}


