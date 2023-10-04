package com.utn.TPAPIRESTDiaz.controllers;

import com.utn.TPAPIRESTDiaz.entities.Domicilio;

import com.utn.TPAPIRESTDiaz.services.DomicilioServiceImpl;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/BD1/domicilio")
public class DomicilioController extends BaseControllerImpl<Domicilio, DomicilioServiceImpl>{

}