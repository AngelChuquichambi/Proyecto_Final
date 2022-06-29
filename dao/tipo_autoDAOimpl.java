package com.emergentes.dao;

import com.emergentes.modelo.Color;
import com.emergentes.modelo.tipo_auto;
import com.emergentes.conexion.basedatos;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class tipo_autoDAOimpl extends basedatos implements tipo_autoDAO {

    @Override
    public void insert(tipo_auto tipo) throws Exception {
        try {
            this.conectar();
            PreparedStatement ps = this.conn.prepareStatement("INSERT INTO tipo_auto (descripcion) VALUES (?)");
            ps.setString(1, tipo.getDescripcion());
            ps.executeUpdate();
        } catch (Exception e) {
            throw e;
        } finally {
            this.desconectar();
        }
    }

    @Override
    public void update(tipo_auto tipo) throws Exception {
        try {
            this.conectar();
            PreparedStatement ps = this.conn.prepareStatement("UPDATE tipo_auto SET descripcion=? WHERE id = ?");
            ps.setString(1, tipo.getDescripcion());
            ps.setInt(2, tipo.getId());
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
            PreparedStatement ps = this.conn.prepareStatement("DELETE FROM tipo_auto WHERE id = ?");
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (Exception e) {
            throw e;
        } finally {
            this.desconectar();
        }
    }

    @Override
    public tipo_auto getById(int id) throws Exception {
        tipo_auto tipo = new tipo_auto();
        try {
            this.conectar();
            PreparedStatement ps = this.conn.prepareStatement("SELECT * FROM tipo_auto WHERE id = ?");
            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                tipo.setId(rs.getInt("id"));
                tipo.setDescripcion(rs.getString("descripcion"));
            }
        } catch (Exception e) {
            throw e;
        } finally {
            this.desconectar();
        }
        return tipo;

    }

    @Override
    public List<tipo_auto> getAll() throws Exception {
        List<tipo_auto> lista = null;
        try {
            this.conectar();
            PreparedStatement ps = this.conn.prepareStatement("select * from tipo_auto");
            ResultSet rs = ps.executeQuery();
            // Iniciar la lista 
            lista = new ArrayList<tipo_auto>();
            while (rs.next()) {
                tipo_auto tipo = new tipo_auto();
                tipo.setId(rs.getInt("id"));
                tipo.setDescripcion(rs.getString("descripcion"));
                lista.add(tipo);
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
