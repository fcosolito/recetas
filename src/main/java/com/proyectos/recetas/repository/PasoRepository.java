package com.proyectos.recetas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proyectos.recetas.model.Paso;

public interface PasoRepository extends JpaRepository<Paso, Long> {

}
