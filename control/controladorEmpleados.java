package com.emergentes.control;

import com.emergentes.dao.empleadodao;
import com.emergentes.dao.empleadodi;
import com.emergentes.modelo.Empleados;
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

@WebServlet(name = "controladorEmpleados", urlPatterns = {"/controladorEmpleados"})
public class controladorEmpleados extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         try {
            empleadodao dao = new empleadodi();
            Empleados e = new Empleados();

            String action = (request.getParameter("action") != null) ? request.getParameter("action") : "vista";
            int ci;

            switch (action) {
                case "vista":
                    List<Empleados> lista = dao.MostrarTabla();
                    request.setAttribute("tabla", lista);
                    request.getRequestDispatcher("empleados.jsp").forward(request, response);
                    break;
                case "nuevo":
                    request.setAttribute("empleado", e);
                    request.getRequestDispatcher("frmempleados.jsp").forward(request, response);
                    break;
                case "editar":
                    ci = Integer.parseInt(request.getParameter("ci"));
                    e = dao.Buscarid(ci);
                    request.setAttribute("empleado", e);
                    request.getRequestDispatcher("frmempleados.jsp").forward(request, response);
                    break;
                case "eliminar":
                    ci = Integer.parseInt(request.getParameter("ci"));
                    dao.delete(ci);
                    response.sendRedirect("controladorEmpleados");
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
