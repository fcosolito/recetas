package com.proyectos.recetas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proyectos.recetas.model.Ingrediente;

public interface IngredienteRepository extends JpaRepository<Ingrediente, Long> {

}
