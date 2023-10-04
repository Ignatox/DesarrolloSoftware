package com.utn.TPAPIRESTDiaz.controllers;

import com.utn.TPAPIRESTDiaz.entities.Persona;
import com.utn.TPAPIRESTDiaz.services.PersonaService;
import com.utn.TPAPIRESTDiaz.services.PersonaServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/BD1/personas")
public class PersonaController extends BaseControllerImpl <Persona, PersonaServiceImpl>{

}