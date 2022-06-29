package com.emergentes.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class basedatos {

    private String driver = "com.mysql.cj.jdbc.Driver";
    private String bd = "jdbc:mysql://localhost:3306/sistema_ventas";
    private String usuario = "root";
    private String password = "";

    protected Connection conn;

    public basedatos() {
        try {
            Class.forName(driver);

            conn = DriverManager.getConnection(bd, usuario, password);
            if (conn != null) {
                System.out.println("Conexcion OK" + conn);
            }

        } catch (ClassNotFoundException ex) {
            System.out.println("ERROR EN DRIVER" + ex.getMessage());
        } catch (SQLException ex) {
            System.out.println("ERROR AL CONECTAR" + ex.getMessage());
        }

    }

    public Connection conectar() {
        return conn;
    }

    public void desconectar() {
        try {
            conn.close();
        } catch (SQLException ex) {
            System.out.println("ERROR AL DESCONECTAR" + ex.getMessage());
        }
    }

    /*public static void main(String args[]) {
        try {
            basedatos b = new basedatos();
            b.conectar();
            PreparedStatement ps = b.conn.prepareStatement("select * from cargos");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String id = rs.getString("id");
                    String de = rs.getString("descripcion");
                System.out.println("ID = " + id);
                System.out.println("Desc = " + de);
            }
        } catch (SQLException ex) {
            Logger.getLogger(basedatos.class.getName()).log(Level.SEVERE, null, ex);
        }
    */
}
