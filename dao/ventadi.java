package com.emergentes.dao;

import com.emergentes.conexion.basedatos;
import com.emergentes.modelo.Ventas;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ventadi extends basedatos implements ventadao {

    @Override
    public void insert(Ventas venta) throws Exception {
        try {
            this.conectar();
            PreparedStatement ps = this.conn.prepareStatement("insert into ventas (empleado,cliente,automovil,fecha_venta) values (?,?,?,?)");
            ps.setInt(1, venta.getEmpleado());
            ps.setInt(2, venta.getCliente());
            ps.setInt(3, venta.getAutomovil());
            ps.setString(4, venta.getFecha_venta());
            ps.executeUpdate();
        } catch (Exception e) {
            throw e;
        } finally {
            this.desconectar();
        }
    }

    @Override
    public void update(Ventas venta) throws Exception {
        try {
            this.conectar();
            PreparedStatement ps = this.conn.prepareStatement("update ventas set empleado = ?, cliente = ?, automovil = ?, fecha_venta = ? where id = ?");
            ps.setInt(1, venta.getEmpleado());
            ps.setInt(2, venta.getCliente());
            ps.setInt(3, venta.getAutomovil());
            ps.setString(4, venta.getFecha_venta());
            ps.setInt(5, venta.getId());
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
            PreparedStatement ps = this.conn.prepareStatement("delete from ventas where id = ?");
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (Exception e) {
            throw e;
        } finally {
            this.desconectar();
        }
    }

    @Override
    public Ventas getById(int id) throws Exception {
        Ventas v = new Ventas();
        try {
            this.conectar();

            PreparedStatement ps = this.conn.prepareStatement("select * from ventas where id = ?");
            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                v.setId(rs.getInt("id"));
                v.setEmpleado(rs.getInt("empleado"));
                v.setCliente(rs.getInt("cliente"));
                v.setAutomovil(rs.getInt("automovil"));
                v.setFecha_venta(rs.getString("fecha_venta"));
            }

        } catch (Exception e) {
            throw e;
        } finally {
            this.desconectar();
        }
        return v;
    }

    @Override
    public List<Ventas> getAll() throws Exception {
        List<Ventas> lista = null;
        try {
            this.conectar();

            PreparedStatement ps = this.conn.prepareStatement("select * from ventas");
            ResultSet rs = ps.executeQuery();

            lista = new ArrayList<Ventas>();
            while (rs.next()) {
                Ventas v = new Ventas();

                v.setId(rs.getInt("id"));
                v.setEmpleado(rs.getInt("empleado"));
                v.setCliente(rs.getInt("cliente"));
                v.setAutomovil(rs.getInt("automovil"));
                v.setFecha_venta(rs.getString("fecha_venta"));

                lista.add(v);
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
