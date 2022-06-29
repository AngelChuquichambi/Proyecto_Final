package com.emergentes.dao;

import com.emergentes.modelo.Marca;
import java.util.List;

public interface marcadao {

    public void insert(Marca marca) throws Exception;

    public void update(Marca marca) throws Exception;

    public void delete(int id) throws Exception;

    public Marca getById(int id) throws Exception;

    public List<Marca> getAll() throws Exception;
}
