package com.proyectos.recetas.key;

import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

@Embeddable
@Getter
@Setter
public class ItemKey {
    private Long recetaId;
    private Long ingredienteId;

}
