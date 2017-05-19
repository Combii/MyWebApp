import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by David Stovlbaek
 * 27 April 2017.
 */
public class MyServlet extends HttpServlet {


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("IT WORKS!!!!");
        System.out.println("IT WORKS!!!!");
        System.out.println("IT WORKS!!!!");
        System.out.println("IT WORKS!!!!");
        System.out.println("IT WORKS!!!!");

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String docType =
                "<!doctype html public \"-//w3c//dtd html 4.0 " +
                        "transitional//en\">\n";
        out.println(docType +
                "<html>\n" +
                "<body bgcolor=\"#f0f0f0\">\n" +
                "<h1 align=\"center\">" + "Hello" + "</h1>\n" +
                "</body></html>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("IT WORKS!!!!");
        System.out.println("IT WORKS!!!!");
        System.out.println("IT WORKS!!!!");
        System.out.println("IT WORKS!!!!");
        System.out.println("IT WORKS!!!!");

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String docType =
                "<!doctype html public \"-//w3c//dtd html 4.0 " +
                        "transitional//en\">\n";
        out.println(docType +
                "<html>\n" +
                "<body bgcolor=\"#f0f0f0\">\n" +
                "<h1 align=\"center\">" + "Hello" + "</h1>\n" +
                "</body></html>");    }
}
