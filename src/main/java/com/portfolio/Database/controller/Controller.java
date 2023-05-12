package com.portfolio.Database.controller;

import com.portfolio.Database.model.Persona;
import com.portfolio.Database.model.Proyecto;
import com.portfolio.Database.model.Tecnologia;
import com.portfolio.Database.service.IPersonaService;
import com.portfolio.Database.service.IProyectoService;
import com.portfolio.Database.service.ITecnologiaService;
import com.portfolio.Database.service.demoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/db")
public class Controller {

    @Autowired
    public IPersonaService persoServ;
    @Autowired
    public IProyectoService proyServ;
    @Autowired
    public ITecnologiaService tecServ;

    // @GetMapping("/api/db/hola")
    //@ResponseBody;
    //public String decirHola() {
    //  return demoService1.decirHola();
    // }
    //Persona
    @PostMapping("/new/persona")
    public void agregarPersona(@RequestBody Persona pers) {
        persoServ.crearPersona(pers);
    }

    @GetMapping("/ver/persona")
    @ResponseBody
    public List<Persona> verPersonas() {
        return persoServ.verPersonas();
    }

    @DeleteMapping("/borrar/persona/{id}")
    public void borrarPersona(@PathVariable int id) {
        persoServ.borrarPersona(id);
    }

    @GetMapping("/buscar/persona/{id}")
    @ResponseBody
    public Persona buscarPersona(@PathVariable int id) {
        return persoServ.buscarPersona(id);
    }

    @PutMapping("/editar/persona")
    public void editarPersona(@RequestBody Persona pers) {
        persoServ.editarPersona(pers);
    }

    //Tecnologia
    @PostMapping("/new/tecnologia")
    public void agregarTecnologia(@RequestBody Tecnologia tec) {
        tecServ.crearTecnologia(tec);
    }

    @GetMapping("/ver/tecnologia")
    @ResponseBody
    public List<Tecnologia> verTecnologias() {
        return tecServ.verTecnologias();
    }

    @DeleteMapping("/borrar/tecnologia/{id}")
    public void borrarTecnologia(@PathVariable int id) {
        tecServ.borrarTecnologia(id);
    }

    @GetMapping("/buscar/tecnologia/{id}")
    @ResponseBody
    public Tecnologia buscarTecnologia(@PathVariable int id) {
        return tecServ.buscarTecnologia(id);
    }

    @PutMapping("/editar/tecnologia")
    public void editarTecnologia(@RequestBody Tecnologia tec) {
        tecServ.editarTecnologia(tec);
    }

    //Proyecto
    @PostMapping("/new/proyecto")
    public void agregarProyecto(@RequestBody Proyecto proy) {
        proyServ.crearProyecto(proy);
    }

    @GetMapping("/ver/proyecto")
    @ResponseBody
    public List<Proyecto> verProyectos() {
        return proyServ.verProyectos();
    }

    @DeleteMapping("/borrar/proyecto/{id}")
    public void borrarProyecto(@PathVariable int id) {
        proyServ.borrarProyecto(id);
    }

    @GetMapping("/buscar/proyecto/{id}")
    @ResponseBody
    public Proyecto buscarProyecto(@PathVariable int id) {
        return proyServ.buscarProyecto(id);
    }

    @PutMapping("/editar/proyecto")
    public void editarProyecto(@RequestBody Proyecto proy) {
        proyServ.editarProyecto(proy);
    }

}
