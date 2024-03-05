package com.proyectos.recetas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proyectos.recetas.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}
