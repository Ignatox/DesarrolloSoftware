package com.utn.TPAPIRESTDiaz.controllers;


import com.utn.TPAPIRESTDiaz.entities.Autor;
import com.utn.TPAPIRESTDiaz.services.AutorServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/BD1/autores")
public class AutorController extends BaseControllerImpl<Autor, AutorServiceImpl>{

}