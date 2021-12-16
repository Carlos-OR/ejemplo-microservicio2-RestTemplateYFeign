package com.microservicio2.practica.de.un.microservicio2.serviceFeign;

import com.microservicio2.practica.de.un.microservicio2.model.GrupoMS2;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "micro-servicio-1", url = "localhost:8081/api/ms1")
public interface GrupoClientFeign {

    @GetMapping("/findAll")
    public List<GrupoMS2> findAll();

    @GetMapping("/findById/{id}")
    public GrupoMS2 findById(@PathVariable int id);

}
