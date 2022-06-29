
package com.emergentes.dao;

import com.emergentes.modelo.Clientes;
import java.util.List;

public interface clientesdao {
    
     public void insert(Clientes cliente) throws Exception;

    public void update(Clientes cliente) throws Exception;

    public void delete(int ci) throws Exception;

    public Clientes Buscarid(int ci) throws Exception;

    public List<Clientes> MostrarTabla() throws Exception;
    
}
