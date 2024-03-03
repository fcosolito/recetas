package com.proyectos.recetas.model;

import java.util.List;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class Usuario {
    private long id;
    private String nombreUsuario;
    private List<Album> albumes;

}
