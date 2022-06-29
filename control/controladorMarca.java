package com.emergentes.control;

import com.emergentes.dao.marcadao;
import com.emergentes.dao.marcadi;
import com.emergentes.modelo.Marca;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "controladorMarca", urlPatterns = {"/controladorMarca"})
public class controladorMarca extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            marcadao dao = new marcadi();
            Marca ma = new Marca();

            String action = (request.getParameter("action") != null) ? request.getParameter("action") : "vista";
            int id;

            switch (action) {
                case "vista":
                    List<Marca> lista = dao.getAll();
                    request.setAttribute("tabla", lista);
                    request.getRequestDispatcher("marca.jsp").forward(request, response);
                    break;
                case "nuevo":
                    request.setAttribute("marca", ma);
                    request.getRequestDispatcher("frmmarca.jsp").forward(request, response);
                    break;
                case "editar":
                    id = Integer.parseInt(request.getParameter("id"));
                    ma = dao.getById(id);
                    request.setAttribute("marca", ma);
                    request.getRequestDispatcher("frmmarca.jsp").forward(request, response);
                    break;
                case "eliminar":
                    id = Integer.parseInt(request.getParameter("id"));
                    dao.delete(id);
                    response.sendRedirect("controladorMarca");
                    break;

            }
        } catch (Exception ex) {
            Logger.getLogger(controladorCargos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

}
