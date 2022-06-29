package com.emergentes.dao;

import com.emergentes.conexion.basedatos;
import com.emergentes.modelo.Marca;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class marcadi extends basedatos implements marcadao {

    @Override
    public void insert(Marca marca) throws Exception {
        try {
            this.conectar();
            PreparedStatement ps = this.conn.prepareStatement("insert into marca_auto (nombre) values (?)");
            ps.setString(2, marca.getNombre());
            ps.executeUpdate();
        } catch (Exception e) {
            throw e;
        } finally {
            this.desconectar();
        }
    }

    @Override
    public void update(Marca marca) throws Exception {
        try {
            this.conectar();
            PreparedStatement ps = this.conn.prepareStatement("update marca_auto set nombre = ? where id = ?");
            ps.setString(1, marca.getNombre());
            ps.setInt(2, marca.getId());
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
            PreparedStatement ps = this.conn.prepareStatement("delete from marca_auto where id = ?");
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (Exception e) {
            throw e;
        } finally {
            this.desconectar();
        }
    }

    @Override
    public Marca getById(int id) throws Exception {
        Marca ma = new Marca();
        try {
            this.conectar();

            PreparedStatement ps = this.conn.prepareStatement("select * from marca_auto where id = ?");
            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                ma.setId(rs.getInt("id"));
                ma.setNombre(rs.getString("nombre"));
            }

        } catch (Exception e) {
            throw e;
        } finally {
            this.desconectar();
        }
        return ma;
    }

    @Override
    public List<Marca> getAll() throws Exception {
        List<Marca> lista = null;
        try {
            this.conectar();

            PreparedStatement ps = this.conn.prepareStatement("select * from marca_auto");
            ResultSet rs = ps.executeQuery();

            lista = new ArrayList<Marca>();
            while (rs.next()) {
                Marca ma = new Marca();

                ma.setId(rs.getInt("id"));
                ma.setNombre(rs.getString("nombre"));
                lista.add(ma);
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
