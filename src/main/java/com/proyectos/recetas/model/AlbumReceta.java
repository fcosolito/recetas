package com.proyectos.recetas.model;

import java.time.LocalDate;

import com.proyectos.recetas.key.AlbumRecetaKey;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class AlbumReceta {
    @EmbeddedId
    private AlbumRecetaKey id;
    private LocalDate fechaAgregacion;
    @ManyToOne
    private Receta receta;

}
