package com.proyectos.recetas.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class TestController {

    @GetMapping("/test")
    public String getMethodName() {
        return "Mensaje de test controller";
    }

}
