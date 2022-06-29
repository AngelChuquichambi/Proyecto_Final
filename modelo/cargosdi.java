package com.emergentes.modelo;

import com.emergentes.conexion.basedatos;
import com.emergentes.dao.cargosdao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class cargosdi extends basedatos implements cargosdao {

    @Override
    public void insert(cargos cargo) throws Exception {
        try {
            this.conectar();
            PreparedStatement ps = this.conn.prepareStatement("insert into cargos (descripcion) values (?)");
            ps.setString(2, cargo.getDescripcion());
            ps.executeUpdate();
        } catch (Exception e) {
            throw e;
        } finally {
            this.desconectar();
        }
    }

    @Override
    public void update(cargos cargo) throws Exception {
        try {
            this.conectar();
            PreparedStatement ps = this.conn.prepareStatement("update cargos set descripcion = ? where id = ?");
            ps.setString(1, cargo.getDescripcion());
            ps.setInt(2, cargo.getId());
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
            PreparedStatement ps = this.conn.prepareStatement("delete from cargos where id = ?");
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (Exception e) {
            throw e;
        } finally {
            this.desconectar();
        }
    }

    @Override
    public cargos getById(int id) throws Exception {
        cargos c = new cargos();
        try {
            this.conectar();

            PreparedStatement ps = this.conn.prepareStatement("select * from cargos where id = ?");
            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                c.setId(rs.getInt("id"));
                c.setDescripcion(rs.getString("descripcion"));
            }

        } catch (Exception e) {
            throw e;
        } finally {
            this.desconectar();
        }
        return c;
    }

    @Override
    public List<cargos> getAll() throws Exception {
        List<cargos> lista = null;
        try {
            this.conectar();

            PreparedStatement ps = this.conn.prepareStatement("select * from cargos");
            ResultSet rs = ps.executeQuery();

            lista = new ArrayList<cargos>();
            while (rs.next()) {
                cargos c = new cargos();

                c.setId(rs.getInt("id"));
                c.setDescripcion(rs.getString("descripcion"));

                lista.add(c);
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
