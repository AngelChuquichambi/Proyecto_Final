package com.emergentes.control;

import com.emergentes.dao.AutomovilDAO;
import com.emergentes.dao.AutomovilDAOimpl;
import com.emergentes.modelo.Automovil;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "AutomovilControlador", urlPatterns = {"/AutomovilControlador"})
public class AutomovilControlador extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            AutomovilDAO dao = new AutomovilDAOimpl();
            Automovil automovil = new Automovil();
            int id;

            String action = (request.getParameter("action") != null) ? request.getParameter("action") : "vista";

            switch (action) {
                case "add":
                    // adicionar 
                    request.setAttribute("automovil", automovil);
                    request.getRequestDispatcher("frmautomovil.jsp").forward(request, response);
                    break;
                case "edit":
                    id = Integer.parseInt(request.getParameter("id"));
                    automovil = dao.getById(id);
                    request.setAttribute("automovil", automovil);
                    request.getRequestDispatcher("frmautomovil.jsp").forward(request, response);
                    break;
                case "delete":
                    id = Integer.parseInt(request.getParameter("id_automovil"));
                    dao.delete(id);

                    response.sendRedirect("AutomovilControlador");
                    break;
                case "vista":
                    // OBTENER LA LISTA DE REGISTROS
                    List<Automovil> lista = dao.getAll();
                    request.setAttribute("tabla", lista);
                    request.getRequestDispatcher("automovils.jsp").forward(request, response);
                    break;
            }

        } catch (Exception ex) {
            System.out.println("ERROR FATAL " + ex.getMessage());
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        int id_automovil = Integer.parseInt(request.getParameter("id"));
        String matricula = request.getParameter("matricula");
        int marca = Integer.parseInt(request.getParameter("marca"));
        String modelo = request.getParameter("modelo");
        int color = Integer.parseInt(request.getParameter("color"));
        Double precio = Double.parseDouble(request.getParameter("precio"));
        String motor = request.getParameter("motor");
        String fecha_fab = request.getParameter("fecha_fab");
        String observaciones = request.getParameter("observaciones");

        Automovil automovil = new Automovil();

        automovil.setId_automovil(id_automovil);
        automovil.setMatricula(matricula);
        automovil.setMarca(marca);
        automovil.setModelo(modelo);
        automovil.setColor(color);
        automovil.setPrecio(precio);
        automovil.setMotor(motor);
        automovil.setFecha_fac(fecha_fab);
        automovil.setObservaciones(observaciones);

        if (id_automovil == 0) {
            AutomovilDAO dao = new AutomovilDAOimpl();
            try {
                // NUEVO REGISTRO
                dao.insert(automovil);
                response.sendRedirect("AutomovilControlador");

            } catch (Exception ex) {
                System.out.println("ERROR AL INTRODUCIR UN NUEVO REGISRO" + ex.getMessage());
            }
        } else {
            AutomovilDAO dao = new AutomovilDAOimpl();
            try {
                // EDICION DE REGISTRO
                dao.update(automovil);
                response.sendRedirect("AutomovilControlador");
            } catch (Exception ex) {
                System.out.println("ERROR AL EDITAR EL REGISTRO" + ex.getMessage());
            }
        }
    }

}
