package com.proyectos.recetas.dto;

import java.util.Set;

import com.proyectos.recetas.model.Categoria;
import com.proyectos.recetas.model.Item;
import com.proyectos.recetas.model.Paso;

public record RecetaDto(String nombre, String descripcion, Integer duracion, Set<Paso> pasos, Set<Item> items,
                Set<Categoria> categorias) {
}
