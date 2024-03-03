package com.proyectos.recetas.model;

import java.util.List;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class Album {
    private long id;
    private String descripcion;
    private String nombre;
    private List<Receta> recetas;
    private Imagen imagen;

}
