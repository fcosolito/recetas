package com.proyectos.recetas.key;

import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

@Embeddable
@Getter
@Setter
public class ItemKey {
    private Long receta_id;
    private Long ingrediente_id;

}
