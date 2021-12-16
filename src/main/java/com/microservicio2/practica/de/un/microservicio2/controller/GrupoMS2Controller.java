package com.microservicio2.practica.de.un.microservicio2.controller;

import com.microservicio2.practica.de.un.microservicio2.model.GrupoMS2;
import com.microservicio2.practica.de.un.microservicio2.serviceRestTemplate.GrupoServiceMS2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/ms2-connect1")
public class GrupoMS2Controller {

    @Autowired
    @Qualifier("serviceRestTemplate")
    private GrupoServiceMS2 grupoServiceMS2;

    @GetMapping("/findAll")
    public List<GrupoMS2> findAll() {
        return grupoServiceMS2.findAll();
    }

    @GetMapping("/findById/{id}")
    public GrupoMS2 findById(@PathVariable int id) {
        return grupoServiceMS2.findById(id);
    }

}
