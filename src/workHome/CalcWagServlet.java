package workHome;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/calcwag")
public class CalcWagServlet extends HttpServlet {
    private Calculator calculator = new Calculator();

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String kilogramy = request.getParameter("kilogramy");
        String gramy = request.getParameter("gramy");
        String miligramy = request.getParameter("miligramy");

        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();
        if (Utils.checkInputFields(kilogramy, gramy, miligramy) == 0) {
            writer.println("<h1>Wprowadz co najmniej jedna wartosc</h1>");
        } else if (Utils.checkInputFields(kilogramy, gramy, miligramy) > 1) {
            writer.println("<h1>Mozesz wypelnic tylko jedno pole</h1>");
        } else {
            calculator.calculateWag(kilogramy, gramy, miligramy);
            writer.println("<h1>Podana wartosc w przeliczeniu na:</h1>");
            writer.println("<h1>kilogramy:" + calculator.getKilogramy() + "</h1>");
            writer.println("<h1>gramy:" + calculator.getGramy() + "</h1>");
            writer.println("<h1>miligramy:" + calculator.getMiligramy() + "</h1>");
        }
    }

}
