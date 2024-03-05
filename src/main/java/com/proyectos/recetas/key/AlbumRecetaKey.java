package com.proyectos.recetas.key;

import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

@Embeddable
@Getter
@Setter
public class AlbumRecetaKey {
    private Long albumId;
    private Long recetaId;

}
