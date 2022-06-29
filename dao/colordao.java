package com.emergentes.dao;

import com.emergentes.modelo.Color;
import java.util.List;

public interface colordao {

    public void insert(Color color) throws Exception;

    public void update(Color color) throws Exception;

    public void delete(int id) throws Exception;

    public Color getById(int id) throws Exception;

    public List<Color> getAll() throws Exception;

}
