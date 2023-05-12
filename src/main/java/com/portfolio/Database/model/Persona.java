package com.portfolio.Database.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int id;

    public String nombre;
    public String apellido;
    public String titulo;
    public String telefono;
    public String email;
    public String sobreMi;
    public String habilidades;

    public Persona() {
    }

    public Persona(int id, String nombre, String apellido, String titulo, String telefono, String email, String sobreMi, String habilidades) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.titulo = titulo;
        this.telefono = telefono;
        this.email = email;
        this.sobreMi = sobreMi;
        this.habilidades = habilidades;
    }

}
