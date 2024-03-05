package com.proyectos.recetas.model;

import com.proyectos.recetas.key.ItemKey;

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
public class Item {
    @EmbeddedId
    private ItemKey id;
    private Integer cantidad;
    private String unidadMedida;
    @ManyToOne
    private Ingrediente ingrediente;

}
