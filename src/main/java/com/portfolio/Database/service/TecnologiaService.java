package com.portfolio.Database.service;

import com.portfolio.Database.model.Tecnologia;
import com.portfolio.Database.repository.TecnologiaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TecnologiaService implements ITecnologiaService{
    
    @Autowired
    public TecnologiaRepository tecRepo;

    @Override
    public List<Tecnologia> verTecnologias() {
        return tecRepo.findAll();
    }

    @Override
    public void crearTecnologia(Tecnologia tec) {
        tecRepo.save(tec);
    }

    @Override
    public void borrarTecnologia(int id) {
        tecRepo.deleteById(id);
    }

    @Override
    public Tecnologia buscarTecnologia(int id) {
       return tecRepo.findById(id).orElse(null);
    }

    @Override
    public void editarTecnologia(Tecnologia tec) {
        tecRepo.save(tec);
    }
}
