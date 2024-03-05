package com.proyectos.recetas.repository;

import com.proyectos.recetas.model.Receta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecetaRepository extends JpaRepository<Receta, Long> {

}
