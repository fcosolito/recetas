package com.proyectos.recetas.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proyectos.recetas.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    public Optional<Usuario> findByNombreUsuario(String nombreUsuario);

}
