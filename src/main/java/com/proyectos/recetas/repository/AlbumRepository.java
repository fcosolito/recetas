package com.proyectos.recetas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proyectos.recetas.model.Album;

public interface AlbumRepository extends JpaRepository<Album, Long> {

}
