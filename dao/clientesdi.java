package com.emergentes.dao;

import com.emergentes.conexion.basedatos;
import com.emergentes.modelo.Clientes;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class clientesdi extends basedatos implements clientesdao {

    @Override
    public void insert(Clientes cliente) throws Exception {
        try {
            this.conectar();
            PreparedStatement ps = this.conn.prepareStatement("insert into clientes values (?,?,?,?,?,?)");
            ps.setInt(1, cliente.getCi());
            ps.setString(2, cliente.getNombres());
            ps.setString(3, cliente.getApellidos());
            ps.setInt(4, cliente.getTelefono());
            ps.setString(5, cliente.getFecha_nac());
            ps.setString(6, cliente.getDireccion());
            ps.executeUpdate();
        } catch (Exception e) {
            throw e;
        } finally {
            this.desconectar();
        }
    }

    @Override
    public void update(Clientes cliente) throws Exception {
        try {
            this.conectar();
            PreparedStatement ps = this.conn.prepareStatement("update clientes set nombres = ?,apellidos = ?,telefono = ?,fecha_nac = ?,direccion = ? where ci = ?");
            ps.setString(1, cliente.getNombres());
            ps.setString(2, cliente.getApellidos());
            ps.setInt(3, cliente.getTelefono());
            ps.setString(4, cliente.getFecha_nac());
            ps.setString(5, cliente.getDireccion());
            ps.setInt(6, cliente.getCi());
            ps.executeUpdate();
        } catch (Exception e) {
            throw e;
        } finally {
            this.desconectar();
        }
    }

    @Override
    public void delete(int ci) throws Exception {
        try {
            this.conectar();
            PreparedStatement ps = this.conn.prepareStatement("delete from clientes where ci = ?");
            ps.setInt(1, ci);
            ps.executeUpdate();
        } catch (Exception e) {
            throw e;
        } finally {
            this.desconectar();
        }
    }

    @Override
    public Clientes Buscarid(int ci) throws Exception {
        Clientes c = new Clientes();
        try {
            this.conectar();

            PreparedStatement ps = this.conn.prepareStatement("select * from clientes where ci = ?");
            ps.setInt(1, ci);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                c.setCi(rs.getInt("ci"));
                c.setNombres(rs.getString("nombres"));
                c.setApellidos(rs.getString("apellidos"));
                c.setTelefono(rs.getInt("telefono"));
                c.setFecha_nac(rs.getString("fecha_nac"));
                c.setDireccion(rs.getString("direccion"));
            }

        } catch (Exception e) {
            throw e;
        } finally {
            this.desconectar();
        }
        return c;
    }

    @Override
    public List<Clientes> MostrarTabla() throws Exception {
        List<Clientes> lista = null;
        try {
            this.conectar();

            PreparedStatement ps = this.conn.prepareStatement("select * from clientes");
            ResultSet rs = ps.executeQuery();

            lista = new ArrayList<Clientes>();
            while (rs.next()) {
                Clientes cli = new Clientes();

                cli.setCi(rs.getInt("ci"));
                cli.setNombres(rs.getString("nombres"));
                cli.setApellidos(rs.getString("apellidos"));
                cli.setTelefono(rs.getInt("telefono"));
                cli.setFecha_nac(rs.getString("fecha_nac"));
                cli.setDireccion(rs.getString("direccion"));

                lista.add(cli);
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
