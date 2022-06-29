package com.emergentes.control;

import com.emergentes.dao.tipo_autoDAO;
import com.emergentes.dao.tipo_autoDAOimpl;
import com.emergentes.modelo.tipo_auto;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "tipo_autoControlador", urlPatterns = {"/tipo_autoControlador"})
public class tipo_autoControlador extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        System.out.println("Iniciando automovil...");
        try {
            tipo_autoDAO dao = new tipo_autoDAOimpl();
            tipo_auto tipo = new tipo_auto();
            int id;

            String action = (request.getParameter("action") != null) ? request.getParameter("action") : "view";

            switch (action) {
                case "add":
                    // adicionar 
                    request.setAttribute("tipo", tipo);
                    request.getRequestDispatcher("frmtipo.jsp").forward(request, response);
                    break;
                case "edit":
                    id = Integer.parseInt(request.getParameter("id"));
                    tipo = dao.getById(id);
                    request.setAttribute("tipo", tipo);
                    request.getRequestDispatcher("frmtipo.jsp").forward(request, response);
                    break;
                case "delete":
                    id = Integer.parseInt(request.getParameter("id"));
                    dao.delete(id);

                    response.sendRedirect("tipo_autoControlador");
                    break;
                case "view":
                    // OBTENER LA LISTA DE REGISTROS
                    List<tipo_auto> lista = dao.getAll();
                    request.setAttribute("tipo", lista);
                    request.getRequestDispatcher("tipo.jsp").forward(request, response);
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

        tipo_auto tipo = new tipo_auto();

        tipo.setId(id);
        tipo.setDescripcion(descripcion);

        if (id == 0) {
            tipo_autoDAO dao = new tipo_autoDAOimpl();
            try {
                // NUEVO REGISTRO
                dao.insert(tipo);
                response.sendRedirect("tipo_autoControlador");

            } catch (Exception ex) {
                System.out.println("ERROR AL INTRODUCIR UN NUEVO REGISRO" + ex.getMessage());
            }
        } else {
            tipo_autoDAO dao = new tipo_autoDAOimpl();

            try {
                // EDICION DE REGISTRO
                dao.update(tipo);
                response.sendRedirect("tipo_autoControlador");
            } catch (Exception ex) {
                System.out.println("ERROR AL EDITAR EL REGISTRO" + ex.getMessage());
            }
        }
    }

}
