package com.portfolio.Database.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "tecnologias")
public class Tecnologia {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int id;

    public String nombre;
    public String icono;

    public Tecnologia() {
    }

    public Tecnologia(int id, String nombre, String icono) {
        this.id = id;
        this.nombre = nombre;
        this.icono = icono;
    }
}
