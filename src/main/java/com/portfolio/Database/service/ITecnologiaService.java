
package com.portfolio.Database.service;

import com.portfolio.Database.model.Tecnologia;
import java.util.List;

public interface ITecnologiaService {

    public List<Tecnologia> verTecnologias();

    public void crearTecnologia(Tecnologia tec);

    public void borrarTecnologia(int id);

    public Tecnologia buscarTecnologia(int id);
    
    public void editarTecnologia(Tecnologia tec);
}
