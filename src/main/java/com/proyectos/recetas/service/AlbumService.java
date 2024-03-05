package com.proyectos.recetas.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.proyectos.recetas.dto.AlbumDto;
import com.proyectos.recetas.model.Album;
import com.proyectos.recetas.model.Usuario;
import com.proyectos.recetas.repository.AlbumRepository;
import com.proyectos.recetas.repository.UsuarioRepository;

import jakarta.persistence.EntityNotFoundException;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@AllArgsConstructor
@Slf4j
public class AlbumService {
    private AlbumRepository albumRepository;
    private UsuarioRepository usuarioRepository;

    public void crearAlbum(AlbumDto albumDto, String nombreUsuario) {
        Optional<Usuario> optUsuario = usuarioRepository.findByNombreUsuario(nombreUsuario);
        if (optUsuario.isPresent()) {
            Album album = new Album();
            album.setAutor(optUsuario.get());
            album.setNombre(albumDto.nombre());
            album.setDescripcion(albumDto.descripcion());
            albumRepository.save(album);
            log.info("Album creado: " + albumDto.nombre());
        } else
            throw new EntityNotFoundException("No se encontro el usuario: " + nombreUsuario);

    }

    public void eliminarAlbum(Long id) {
        albumRepository.deleteById(id);
    }

}
