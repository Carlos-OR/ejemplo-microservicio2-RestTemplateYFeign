package com.microservicio2.practica.de.un.microservicio2.serviceRestTemplate;

import com.microservicio2.practica.de.un.microservicio2.model.GrupoMS2;

import java.util.List;

public interface GrupoServiceMS2 {

    public List<GrupoMS2> findAll();
    public GrupoMS2 findById(int id);

}
