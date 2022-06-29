package com.emergentes.control;

import com.emergentes.dao.ventadao;
import com.emergentes.dao.ventadi;
import com.emergentes.modelo.Ventas;
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

@WebServlet(name = "controladorVentas", urlPatterns = {"/controladorVentas"})
public class controladorVentas extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            ventadao dao = new ventadi();
            Ventas v = new Ventas();
            String action = (request.getParameter("action") != null) ? request.getParameter("action") : "vista";
            int id;

            switch (action) {
                case "vista":
                    List<Ventas> lista = dao.getAll();
                    request.setAttribute("tabla", lista);
                    request.getRequestDispatcher("ventas.jsp").forward(request, response);
                    break;
                case "nuevo":
                    request.setAttribute("venta", v);
                    request.getRequestDispatcher("frmventas.jsp").forward(request, response);
                    break;
                case "editar":
                    id = Integer.parseInt(request.getParameter("id"));
                    v = dao.getById(id);
                    request.setAttribute("venta", v);
                    request.getRequestDispatcher("frmventas.jsp").forward(request, response);
                    break;
                case "eliminar":
                    id = Integer.parseInt(request.getParameter("id"));
                    dao.delete(id);
                    response.sendRedirect("controladorVentas");
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
