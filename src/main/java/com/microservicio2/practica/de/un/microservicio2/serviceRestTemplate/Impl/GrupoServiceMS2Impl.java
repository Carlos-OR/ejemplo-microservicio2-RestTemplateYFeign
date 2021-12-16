package com.microservicio2.practica.de.un.microservicio2.serviceRestTemplate.Impl;

import com.microservicio2.practica.de.un.microservicio2.model.GrupoMS2;
import com.microservicio2.practica.de.un.microservicio2.serviceRestTemplate.GrupoServiceMS2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service("serviceRestTemplate")
public class GrupoServiceMS2Impl implements GrupoServiceMS2 {

    @Autowired
    public RestTemplate restTemplate;

    @Override
    public List<GrupoMS2> findAll() {
        System.out.println("Entro al metodo findAll() con RestTemplate");
        return Arrays.asList(restTemplate.getForObject("http://localhost:8081/api/ms1/findAll", GrupoMS2[].class));
    }

    @Override
    public GrupoMS2 findById(int id) {
        System.out.println("Entro al metodo findById() con RestTemplate");
        Map<String, Integer> mapById = new HashMap<>();
        mapById.put("id", id);

        return restTemplate.getForObject("http://localhost:8081/api/ms1/findById/{id}", GrupoMS2.class, mapById);
    }
}
