package com.emergentes.dao;

import com.emergentes.modelo.Automovil;
import com.emergentes.conexion.basedatos;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class AutomovilDAOimpl extends basedatos implements AutomovilDAO {

    @Override
    public void insert(Automovil automovil) throws Exception {
        try {
            this.conectar();
            PreparedStatement ps = this.conn.prepareStatement("INSERT INTO automovil ( matricula, marca, modelo, color, tipo_auto, precio, motor, fecha_fab, observaciones) VALUES (?,?,?,?,?,?,?,?,?)");
            //ps.setInt(1, automovil.getId_automovil());
            ps.setString(1, automovil.getMatricula());
            ps.setInt(2, automovil.getMarca());
            ps.setString(3, automovil.getModelo());
            ps.setInt(4, automovil.getColor());
            ps.setInt(5, automovil.getTipo_auto());
            ps.setDouble(6, automovil.getPrecio());
            ps.setString(7, automovil.getMotor());
            ps.setString(8, automovil.getFecha_fac());
            ps.setString(9, automovil.getObservaciones());
            ps.executeUpdate();
        } catch (Exception e) {
            throw e;
        } finally {
            this.desconectar();
        }
    }

    @Override
    public void update(Automovil automovil) throws Exception {
        try {
            this.conectar();
            PreparedStatement ps = this.conn.prepareStatement("UPDATE automovil SET matricula=?, marca=?, modelo=?, color=?, tipo_auto = ?, precio=?, motor=?, fecha_fab=?, observaciones=? WHERE id = ?");
            ps.setString(1, automovil.getMatricula());
            ps.setInt(2, automovil.getMarca());
            ps.setString(3, automovil.getModelo());
            ps.setInt(4, automovil.getColor());
            ps.setInt(5, automovil.getTipo_auto());
            ps.setDouble(5, automovil.getPrecio());
            ps.setString(6, automovil.getMotor());
            ps.setString(7, automovil.getFecha_fac());
            ps.setString(8, automovil.getObservaciones());
            ps.setInt(9, automovil.getId_automovil());

            ps.executeUpdate();
        } catch (Exception e) {
            throw e;
        } finally {
            this.desconectar();
        }
    }

    @Override
    public void delete(int id) throws Exception {
        try {
            this.conectar();
            PreparedStatement ps = this.conn.prepareStatement("DELETE FROM automovil WHERE id = ?");
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (Exception e) {
            throw e;
        } finally {
            this.desconectar();
        }
    }

    @Override
    public Automovil getById(int id) throws Exception {
        Automovil automovil = new Automovil();
        try {
            this.conectar();
            PreparedStatement ps = this.conn.prepareStatement("SELECT * FROM automovil WHERE id = ?");
            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                automovil.setId_automovil(rs.getInt("id"));
                automovil.setMatricula(rs.getString("matricula"));
                automovil.setMarca(rs.getInt("marca"));
                automovil.setModelo(rs.getString("modelo"));
                automovil.setColor(rs.getInt("color"));
                automovil.setTipo_auto(rs.getInt("tipo_auto"));
                automovil.setPrecio(rs.getDouble("precio"));
                automovil.setMotor(rs.getString("motor"));
                automovil.setFecha_fac(rs.getString("fecha_fab"));
                automovil.setObservaciones(rs.getString("observaciones"));
            }
        } catch (Exception e) {
            throw e;
        } finally {
            this.desconectar();
        }
        return automovil;
    }

    @Override
    public List<Automovil> getAll() throws Exception {
        List<Automovil> lista = null;
        try {
            this.conectar();
            PreparedStatement ps = this.conn.prepareStatement("select * from automovil;");
            ResultSet rs = ps.executeQuery();
            // Iniciar la lista 
            lista = new ArrayList<Automovil>();
            while (rs.next()) {
                
                Automovil a = new Automovil();
                
                a.setId_automovil(rs.getInt("id"));
                a.setMatricula(rs.getString("matricula"));
                a.setMarca(rs.getInt("marca"));
                a.setModelo(rs.getString("modelo"));
                a.setColor(rs.getInt("color"));
                a.setTipo_auto(rs.getInt("tipo_auto"));
                a.setPrecio(rs.getDouble("precio"));
                a.setMotor(rs.getString("motor"));
                a.setFecha_fac(rs.getString("fecha_fab"));
                a.setObservaciones(rs.getString("observaciones"));
                
                lista.add(a);
            }
            rs.close();
            ps.close();
        } catch (Exception e) {
            throw e;
        } finally {
            this.desconectar();
        }
        return lista;
    }
}
