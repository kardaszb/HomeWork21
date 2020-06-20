package workHome;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/calcmetryczny")
public class CalcMetrServlet extends HttpServlet {
    private Calculator calculator = new Calculator();

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String metry = request.getParameter("metry");
        String centymetry = request.getParameter("centymetry");
        String milimetry = request.getParameter("milimetry");

        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();
        if (Utils.checkInputFields(metry, centymetry, milimetry) == 0) {
            writer.println("<h1>Wprowadz co najmniej jedna wartosc</h1>");
        } else if (Utils.checkInputFields(metry, centymetry, milimetry) > 1) {
            writer.println("<h1>Mozesz wypelnic tylko jedno pole</h1>");
        } else {
            calculator.calculateMeter(metry, centymetry, milimetry);
            writer.println("<h1>Podana wartosc w przeliczeniu na:</h1>");
            writer.println("<h1>metry:" + calculator.getMetry() + "</h1>");
            writer.println("<h1>centymetry:" + calculator.getCentymetry() + "</h1>");
            writer.println("<h1>milimetry:" + calculator.getMilimetry() + "</h1>");
        }
    }
}
