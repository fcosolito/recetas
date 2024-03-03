package com.proyectos.recetas.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class Paso {
    private long id;
    private String descripcion;
    private Integer duracion;

}
