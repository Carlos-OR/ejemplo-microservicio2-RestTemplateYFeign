package com.microservicio2.practica.de.un.microservicio2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class PracticaDeUnMicroservicio2Application {

	public static void main(String[] args) {
		SpringApplication.run(PracticaDeUnMicroservicio2Application.class, args);
	}

}
