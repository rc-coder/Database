package com.portfolio.Database.service;

import com.portfolio.Database.model.Proyecto;
import java.util.List;

public interface IProyectoService {

    public List<Proyecto> verProyectos();

    public void crearProyecto(Proyecto pro);

    public void borrarProyecto(int id);

    public Proyecto buscarProyecto(int id);

    public void editarProyecto(Proyecto pro);
}
