
package com.emergentes.dao;

import com.emergentes.modelo.tipo_auto;
import java.util.List;

public interface tipo_autoDAO {
    public void insert(tipo_auto tipo) throws Exception;

    public void update(tipo_auto tipo) throws Exception;

    public void delete(int id) throws Exception;

    public tipo_auto getById(int id) throws Exception;

    public List<tipo_auto> getAll() throws Exception;
}
