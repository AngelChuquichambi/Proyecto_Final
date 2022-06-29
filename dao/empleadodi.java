package com.emergentes.dao;

import com.emergentes.conexion.basedatos;
import com.emergentes.modelo.Empleados;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class empleadodi extends basedatos implements empleadodao {

    @Override
    public void insert(Empleados empleado) throws Exception {
        try {
            this.conectar();
            PreparedStatement ps = this.conn.prepareStatement("insert into empleados values (?,?,?,?,?,?,?)");
            ps.setInt(1, empleado.getCi());
            ps.setInt(2, empleado.getCargo());
            ps.setString(3, empleado.getNombre());
            ps.setString(4, empleado.getApellidos());
            ps.setString(5, empleado.getFecha_nac());
            ps.setInt(6, empleado.getTelefono());
            ps.setString(7, empleado.getDireccion());
            ps.executeUpdate();
        } catch (Exception e) {
            throw e;
        } finally {
            this.desconectar();
        }
    }

    @Override
    public void update(Empleados empleado) throws Exception {
        try {
            this.conectar();
            PreparedStatement ps = this.conn.prepareStatement("update empleados set cargo = ?,nombre = ?,apellidos = ?,fecha_nac = ?,telefono = ?,direccion = ? where ci = ?");
            ps.setInt(1, empleado.getCargo());
            ps.setString(2, empleado.getNombre());
            ps.setString(3, empleado.getApellidos());
            ps.setInt(4, empleado.getTelefono());
            ps.setString(5, empleado.getFecha_nac());
            ps.setString(6, empleado.getDireccion());
            ps.setInt(7, empleado.getCi());
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
            PreparedStatement ps = this.conn.prepareStatement("delete from empleados where ci = ?");
            ps.setInt(1, ci);
            ps.executeUpdate();
        } catch (Exception e) {
            throw e;
        } finally {
            this.desconectar();
        }
    }

    @Override
    public Empleados Buscarid(int ci) throws Exception {
        Empleados em = new Empleados();
        try {
            this.conectar();

            PreparedStatement ps = this.conn.prepareStatement("select * from empleados where ci = ?");
            ps.setInt(1, ci);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                em.setCi(rs.getInt("ci"));
                em.setCargo(rs.getInt("cargo"));
                em.setNombre(rs.getString("nombre"));
                em.setApellidos(rs.getString("apellidos"));
                em.setFecha_nac(rs.getString("fecha_nac"));
                em.setTelefono(rs.getInt("telefono"));
                em.setDireccion(rs.getString("direccion"));
            }

        } catch (Exception e) {
            throw e;
        } finally {
            this.desconectar();
        }
        return em;
    }

    @Override
    public List<Empleados> MostrarTabla() throws Exception {
        List<Empleados> lista = null;
        try {
            this.conectar();

            PreparedStatement ps = this.conn.prepareStatement("select * from empleados");
            ResultSet rs = ps.executeQuery();

            lista = new ArrayList<Empleados>();
            while (rs.next()) {
                Empleados e = new Empleados();

                e.setCi(rs.getInt("ci"));
                e.setCargo(rs.getInt("cargo"));
                e.setNombre(rs.getString("nombre"));
                e.setApellidos(rs.getString("apellidos"));
                e.setFecha_nac(rs.getString("fecha_nac"));
                e.setTelefono(rs.getInt("telefono"));
                e.setDireccion(rs.getString("direccion"));

                lista.add(e);
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
