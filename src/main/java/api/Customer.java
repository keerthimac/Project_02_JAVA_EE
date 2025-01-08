package api;

import com.google.gson.Gson;
import com.google.gson.JsonParser;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;

public class Customer extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //Query param
        //Path Variables
        //Headers
        //Body - Not a good practice
        resp.getWriter().println("ok");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //Query param
        String id = req.getParameter("id");
        resp.getWriter().println(id);
        //Path Variables
        //Headers
        String name = req.getHeader("name");
        resp.getWriter().println(name);
        //Body
        BufferedReader reader = req.getReader();
        Gson gson = new Gson();
        dto.Customer customer = gson.fromJson(reader, dto.Customer.class);
        String json = gson.toJson(customer);
        resp.getWriter().write("recived"+json );

    }

    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //Query param
        //Path Variables
        //Headers
        //Body
    }

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //Query param
        //Path Variables
        //Headers
        //Body
    }
}
