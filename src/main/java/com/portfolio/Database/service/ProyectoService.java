package com.portfolio.Database.service;

import com.portfolio.Database.model.Proyecto;
import com.portfolio.Database.repository.ProyectoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProyectoService implements IProyectoService{
    
    @Autowired
    public ProyectoRepository proRepo;

    @Override
    public List<Proyecto> verProyectos() {
        return proRepo.findAll();
    }

    @Override
    public void crearProyecto(Proyecto pro) {
        proRepo.save(pro);
    }

    @Override
    public void borrarProyecto(int id) {
        proRepo.deleteById(id);
    }

    @Override
    public Proyecto buscarProyecto(int id) {
        return proRepo.findById(id).orElse(null);
    }

    @Override
    public void editarProyecto(Proyecto pro) {
        proRepo.save(pro);
    }
    
}
