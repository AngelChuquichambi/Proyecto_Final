package com.emergentes.dao;

import com.emergentes.conexion.basedatos;
import com.emergentes.modelo.Color;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class colordi extends basedatos implements colordao {

    @Override
    public void insert(Color color) throws Exception {
        try {
            this.conectar();
            PreparedStatement ps = this.conn.prepareStatement("INSERT INTO color_auto (descripcion) VALUES (?)");
            ps.setString(1, color.getDescripcion());
            ps.executeUpdate();
        } catch (Exception e) {
            throw e;
        } finally {
            this.desconectar();
        }
    }

    @Override
    public void update(Color color) throws Exception {
        try {
            this.conectar();
            PreparedStatement ps = this.conn.prepareStatement("UPDATE color_auto SET descripcion=? WHERE id = ?");
            ps.setString(1, color.getDescripcion());
            ps.setInt(2, color.getId());
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
            PreparedStatement ps = this.conn.prepareStatement("DELETE FROM color_auto WHERE id = ?");
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (Exception e) {
            throw e;
        } finally {
            this.desconectar();
        }
    }

    @Override
    public Color getById(int id) throws Exception {
        Color color = new Color();
        try {
            this.conectar();
            PreparedStatement ps = this.conn.prepareStatement("SELECT * FROM color_auto WHERE id = ?");
            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                color.setId(rs.getInt("id"));
                color.setDescripcion(rs.getString("descripcion"));
            }
        } catch (Exception e) {
            throw e;
        } finally {
            this.desconectar();
        }
        return color;

    }

    @Override
    public List<Color> getAll() throws Exception {
        List<Color> lista = null;
        try {
            this.conectar();
            PreparedStatement ps = this.conn.prepareStatement("select * from color_auto");
            ResultSet rs = ps.executeQuery();
            // Iniciar la lista 
            lista = new ArrayList<Color>();
            while (rs.next()) {
                Color color = new Color();
                color.setId(rs.getInt("id"));
                color.setDescripcion(rs.getString("descripcion"));
                lista.add(color);
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
