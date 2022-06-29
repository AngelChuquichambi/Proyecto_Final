package com.emergentes.control;

import com.emergentes.dao.clientesdao;
import com.emergentes.dao.clientesdi;
import com.emergentes.modelo.Clientes;
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

@WebServlet(name = "controladorClientes", urlPatterns = {"/controladorClientes"})
public class controladorClientes extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            clientesdao dao = new clientesdi();
            Clientes cli = new Clientes();

            String action = (request.getParameter("action") != null) ? request.getParameter("action") : "vista";
            int ci;

            switch (action) {
                case "vista":
                    List<Clientes> lista = dao.MostrarTabla();
                    request.setAttribute("tabla", lista);
                    request.getRequestDispatcher("clientes.jsp").forward(request, response);
                    break;
                case "nuevo":
                    request.setAttribute("cliente", cli);
                    request.getRequestDispatcher("frmclientes.jsp").forward(request, response);
                    break;
                case "editar":
                    ci = Integer.parseInt(request.getParameter("ci"));
                    cli = dao.Buscarid(ci);
                    request.setAttribute("cliente", cli);
                    request.getRequestDispatcher("frmclientes.jsp").forward(request, response);
                    break;
                case "eliminar":
                    ci = Integer.parseInt(request.getParameter("ci"));
                    dao.delete(ci);
                    response.sendRedirect("controladorClientes");
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
