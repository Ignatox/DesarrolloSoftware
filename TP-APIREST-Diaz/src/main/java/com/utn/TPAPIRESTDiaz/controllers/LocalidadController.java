package com.utn.TPAPIRESTDiaz.controllers;

import com.utn.TPAPIRESTDiaz.entities.Localidad;
import com.utn.TPAPIRESTDiaz.services.LocalidadServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/BD1/localidades")
public class LocalidadController extends BaseControllerImpl<Localidad, LocalidadServiceImpl>{

}