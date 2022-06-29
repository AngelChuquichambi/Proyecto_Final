package com.emergentes.control;

import com.emergentes.conexion.basedatos;
import com.emergentes.dao.cargosdao;
import com.emergentes.modelo.cargos;
import com.emergentes.modelo.cargosdi;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "controladorCargos", urlPatterns = {"/controladorCargos"})
public class controladorCargos extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            cargosdao dao = new cargosdi();
            cargos ca = new cargos();

            String action = (request.getParameter("action") != null) ? request.getParameter("action") : "vista";
            int id;

            switch (action) {
                case "vista":
                    List<cargos> lista = dao.getAll();
                    request.setAttribute("tabla", lista);
                    request.getRequestDispatcher("cargos.jsp").forward(request, response);
                    break;
                case "nuevo":
                    request.setAttribute("cargo", ca);
                    request.getRequestDispatcher("frmcargos.jsp").forward(request, response);
                    break;
                case "editar":
                    id = Integer.parseInt(request.getParameter("id"));
                    ca = dao.getById(id);
                    request.setAttribute("cargo", ca);
                    request.getRequestDispatcher("frmcargos.jsp").forward(request, response);
                    break;
                case "eliminar":
                    id = Integer.parseInt(request.getParameter("id"));
                    dao.delete(id);
                    response.sendRedirect("controladorCargos");
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
