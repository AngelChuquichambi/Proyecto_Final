package com.emergentes.dao;

import com.emergentes.modelo.cargos;
import java.util.List;

public interface cargosdao {

    public void insert(cargos cargo) throws Exception;

    public void update(cargos cargo) throws Exception;

    public void delete(int id) throws Exception;

    public cargos getById(int id) throws Exception;

    public List<cargos> getAll() throws Exception;

}
