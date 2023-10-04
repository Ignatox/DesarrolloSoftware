package com.utn.TPAPIRESTDiaz;

import com.utn.TPAPIRESTDiaz.entities.Localidad;
import com.utn.TPAPIRESTDiaz.repositories.LocalidadRepository;
import com.utn.TPAPIRESTDiaz.repositories.PersonaRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cglib.core.Local;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TpApirestDiazApplication {

	public static void main(String[] args) {
		SpringApplication.run(TpApirestDiazApplication.class, args);
	}

}
