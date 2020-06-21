package workHome;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/textCounter")
public class TextServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.setCharacterEncoding("UTF-8");

        String text = request.getParameter("text2count");

        System.out.println(text);

        CharacterCounter chCounter = new CharacterCounter(text);

        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();

        writer.println("<h1>Przelicznik tekstu:</h1>");
        writer.println(text + "<br/>");
        writer.println("<h1>Ilość słów: " + Utils.wordCounter(text) + "</h1><br/>");

        writer.println("<h1>Ilość znaków: " + chCounter.sumAllChar() + "</h1><br/>");

        writer.println("<h1>Ilość znaków bez spacji: " + (chCounter.sumAllChar() - chCounter.getSpace()) + "</h1><br/>");

        writer.println("<h1>Palindrom: " + Utils.isPalindrome(text) + "</h1><br/>");

    }
}

