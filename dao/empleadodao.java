package com.emergentes.dao;

import com.emergentes.modelo.Empleados;
import java.util.List;

public interface empleadodao {

    public void insert(Empleados empleado) throws Exception;

    public void update(Empleados empleado) throws Exception;

    public void delete(int ci) throws Exception;

    public Empleados Buscarid(int ci) throws Exception;

    public List<Empleados> MostrarTabla() throws Exception;

}
