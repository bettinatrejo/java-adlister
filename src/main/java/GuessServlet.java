import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "GuessServlet", urlPatterns = "/guess")
public class GuessServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Integer userGuess = Integer.parseInt(request.getParameter("userGuess"));
        request.setAttribute("userGuess", userGuess);
        String message = request.getParameter("message");
        request.setAttribute("message", message);

//        int randResponse = (int) Math.round(Math.random() * 99 + 1);
        int randResponse = 4;

        if(userGuess == randResponse) {
            message = "You won!";
        } else if (userGuess < randResponse) {
            message = "Too Low";
        } else if (userGuess > randResponse){
            message = "Too High";
        }

        request.getRequestDispatcher("WEB-INF/userGuess.jsp").forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("WEB-INF/guess.jsp").forward(request, response);
    }






}
