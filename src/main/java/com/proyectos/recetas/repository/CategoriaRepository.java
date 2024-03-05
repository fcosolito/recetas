package com.proyectos.recetas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proyectos.recetas.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

}
