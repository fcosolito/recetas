package com.proyectos.recetas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proyectos.recetas.model.Imagen;

public interface ImagenRepository extends JpaRepository<Imagen, Long> {

}
