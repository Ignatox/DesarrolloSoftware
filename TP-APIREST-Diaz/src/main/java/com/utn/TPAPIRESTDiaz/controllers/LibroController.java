package com.utn.TPAPIRESTDiaz.controllers;

import com.utn.TPAPIRESTDiaz.entities.Libro;
import com.utn.TPAPIRESTDiaz.services.LibroServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/BD1/libros")
public class LibroController extends BaseControllerImpl<Libro, LibroServiceImpl>{

}