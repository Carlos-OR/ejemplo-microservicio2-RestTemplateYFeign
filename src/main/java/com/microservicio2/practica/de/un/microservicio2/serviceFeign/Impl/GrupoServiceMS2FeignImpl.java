package com.microservicio2.practica.de.un.microservicio2.serviceFeign.Impl;

import com.microservicio2.practica.de.un.microservicio2.model.GrupoMS2;
import com.microservicio2.practica.de.un.microservicio2.serviceFeign.GrupoClientFeign;
import com.microservicio2.practica.de.un.microservicio2.serviceRestTemplate.GrupoServiceMS2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("serviceFeignClient")
public class GrupoServiceMS2FeignImpl implements GrupoServiceMS2 {

    @Autowired
    private GrupoClientFeign grupoClientFeign;

    @Override
    public List<GrupoMS2> findAll() {
        System.out.println("Entro al metodo findAll() con Feign");
        return grupoClientFeign.findAll();
    }

    @Override
    public GrupoMS2 findById(int id) {
        System.out.println("Entro al metodo findById() con Feign");
        return grupoClientFeign.findById(id);
    }
}
