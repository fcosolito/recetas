package com.proyectos.recetas.model;

import java.time.LocalDate;
import java.util.List;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class Receta {
    private long id;
    private String nombre;
    private String descripcion;
    private Integer duracion;
    private LocalDate fechaCreacion;
    private LocalDate fechaModificacion;
    private Usuario autor;
    private Receta recetaBase;
    private List<Paso> pasos;
    private List<Categoria> categorias;
    private List<Imagen> imagenes;

}
