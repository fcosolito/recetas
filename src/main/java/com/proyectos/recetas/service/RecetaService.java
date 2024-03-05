package com.proyectos.recetas.service;

import java.time.LocalDate;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.proyectos.recetas.dto.RecetaDto;
import com.proyectos.recetas.key.AlbumRecetaKey;
import com.proyectos.recetas.model.Album;
import com.proyectos.recetas.model.AlbumReceta;
import com.proyectos.recetas.model.Receta;
import com.proyectos.recetas.repository.AlbumRecetaRepository;
import com.proyectos.recetas.repository.AlbumRepository;
import com.proyectos.recetas.repository.CategoriaRepository;
import com.proyectos.recetas.repository.RecetaRepository;

import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@AllArgsConstructor
@Slf4j
public class RecetaService {
    RecetaRepository recetaRepository;
    AlbumRepository albumRepository;
    CategoriaRepository categoriaRepository;
    AlbumRecetaRepository albumRecetaRepository;

    @Transactional
    public void crearReceta(RecetaDto recetaDto, Long albumId) {
        Optional<Album> optAlbum = albumRepository.findById(albumId);
        if (optAlbum.isPresent()) {
            LocalDate now = LocalDate.now();
            Receta nuevaReceta = new Receta();
            AlbumReceta nuevaAlbumReceta = new AlbumReceta();

            nuevaAlbumReceta.setFechaAgregacion(now);
            nuevaAlbumReceta.setReceta(nuevaReceta);

            nuevaReceta.setAutor(optAlbum.get().getAutor());
            nuevaReceta.setNombre(recetaDto.nombre());
            nuevaReceta.setDescripcion(recetaDto.descripcion());
            nuevaReceta.setDuracion(recetaDto.duracion());
            nuevaReceta.setPasos(recetaDto.pasos());
            nuevaReceta.setItems(recetaDto.items());
            nuevaReceta.setCategorias(recetaDto.categorias());
            nuevaReceta.setFechaCreacion(now);

            optAlbum.get().getAlbumRecetas().add(nuevaAlbumReceta);

            categoriaRepository.saveAll(recetaDto.categorias());
            albumRecetaRepository.save(nuevaAlbumReceta);
            recetaRepository.save(nuevaReceta);

            log.info("Receta creada: " + recetaDto.nombre());
        } else
            throw new EntityNotFoundException("No se encontro el album: " + albumId);

    }

    public void eliminarReceta(Long id) {
        recetaRepository.deleteById(id);
    }

}
