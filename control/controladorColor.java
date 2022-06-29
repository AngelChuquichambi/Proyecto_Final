package com.emergentes.control;

import com.emergentes.dao.colordao;
import com.emergentes.dao.colordi;
import com.emergentes.modelo.Color;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "controladorColor", urlPatterns = {"/controladorColor"})
public class controladorColor extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        System.out.println("Iniciando automovil...");
        try {
            colordao dao = new colordi();
            Color c = new Color();
            int id;

            String action = (request.getParameter("action") != null) ? request.getParameter("action") : "view";

            switch (action) {
                case "nuevo":
                    // adicionar 
                    request.setAttribute("color", c);
                    request.getRequestDispatcher("frmcolor.jsp").forward(request, response);
                    break;
                case "editar":
                    id = Integer.parseInt(request.getParameter("id"));
                    c = dao.getById(id);
                    request.setAttribute("color", c);
                    request.getRequestDispatcher("frmcolor.jsp").forward(request, response);
                    break;
                case "eliminar":
                    id = Integer.parseInt(request.getParameter("id"));
                    dao.delete(id);

                    response.sendRedirect("controladorColor");
                    break;
                case "view":
                    // OBTENER LA LISTA DE REGISTROS
                    List<Color> lista = dao.getAll();
                    request.setAttribute("tabla", lista);
                    request.getRequestDispatcher("color.jsp").forward(request, response);
                    break;
            }

        } catch (Exception ex) {
            System.out.println("ERROR FATAL " + ex.getMessage());
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        String descripcion = request.getParameter("descripcion");

        Color c = new Color();

        c.setId(id);
        c.setDescripcion(descripcion);

        if (id == 0) {
            colordao dao = new colordi();
            try {
                // NUEVO REGISTRO
                dao.insert(c);
                response.sendRedirect("color_autoControlador");

            } catch (Exception ex) {
                System.out.println("ERROR AL INTRODUCIR UN NUEVO REGISRO" + ex.getMessage());
            }
        } else {
            colordao dao = new colordi();

            try {
                // EDICION DE REGISTRO
                dao.update(c);
                response.sendRedirect("color_autoControlador");
            } catch (Exception ex) {
                System.out.println("ERROR AL EDITAR EL REGISTRO" + ex.getMessage());
            }
        }
    }

}
