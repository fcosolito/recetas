package com.proyectos.recetas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proyectos.recetas.key.AlbumRecetaKey;
import com.proyectos.recetas.model.AlbumReceta;

public interface AlbumRecetaRepository extends JpaRepository<AlbumReceta, AlbumRecetaKey> {

}
