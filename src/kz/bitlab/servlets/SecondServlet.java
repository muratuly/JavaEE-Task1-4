package kz.bitlab.servlets;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(value="/second")
public class SecondServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response){

    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String name = request.getParameter("user_name");
        String surname = request.getParameter("user_surname");
        String uzhin = request.getParameter("uzhin");
        String result = name + " " + surname + " ordered " + uzhin;

        PrintWriter out = response.getWriter();
        out.print(result);
    }
}
