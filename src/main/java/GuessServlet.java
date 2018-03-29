import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "GuessServlet", urlPatterns = "/guess")
public class GuessServlet extends HttpServlet {

    private int computerGuess = 8;


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Integer userGuess = Integer.parseInt(request.getParameter("userGuess"));

        String message = null;

        if(userGuess == computerGuess) {
            message = "You won!";
        } else if (userGuess < computerGuess) {
            message = "Too Low";
        } else if (userGuess > computerGuess){
            message = "Too High";
        }


        request.setAttribute("userGuess", userGuess);
        request.setAttribute("message", message);

        request.getRequestDispatcher("WEB-INF/userGuess.jsp").forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("WEB-INF/guess.jsp").forward(request, response);
    }






}
