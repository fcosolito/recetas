package com.proyectos.recetas.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.proyectos.recetas.dto.UsuarioDto;
import com.proyectos.recetas.model.Usuario;
import com.proyectos.recetas.repository.UsuarioRepository;

import jakarta.persistence.EntityExistsException;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@AllArgsConstructor
@Slf4j
public class UsuarioService {
    private UsuarioRepository usuarioRepository;

    public void crearUsuario(UsuarioDto dto) {
        Optional<Usuario> optUsuario = usuarioRepository.findByNombreUsuario(dto.nombreUsuario());
        if (optUsuario.isPresent())
            throw new EntityExistsException("Ya existe un usuario con el nombre: " + dto.nombreUsuario());
        else {
            Usuario nuevoUsuario = new Usuario();
            nuevoUsuario.setNombreUsuario(dto.nombreUsuario());
            usuarioRepository.save(nuevoUsuario);
            log.info("Usuario creado: " + dto.nombreUsuario());
        }

    }

    public void eliminarUsuario(Long id) {
        usuarioRepository.deleteById(id);
    }

}
