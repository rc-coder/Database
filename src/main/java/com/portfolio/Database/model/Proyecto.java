package com.portfolio.Database.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "proyectos")
public class Proyecto {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int id;
    
    public String nombre;
    public String link;
    public String img;

    public Proyecto() {
    }

    public Proyecto(int id, String nombre, String link, String img) {
        this.id = id;
        this.nombre = nombre;
        this.link = link;
        this.img = img;
    }
    
}
