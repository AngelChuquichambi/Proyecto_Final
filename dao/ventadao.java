package com.emergentes.dao;

import com.emergentes.modelo.Ventas;
import java.util.List;

public interface ventadao {

    public void insert(Ventas venta) throws Exception;

    public void update(Ventas venta) throws Exception;

    public void delete(int id) throws Exception;

    public Ventas getById(int id) throws Exception;

    public List<Ventas> getAll() throws Exception;

}
