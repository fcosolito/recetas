package com.proyectos.recetas.model;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class Receta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String descripcion;
    private Integer duracion;
    private LocalDate fechaCreacion;
    private LocalDate fechaModificacion;
    @ManyToOne
    private Usuario autor;
    @ManyToOne(optional = true)
    private Receta recetaBase;
    @OneToMany(cascade = { CascadeType.PERSIST, CascadeType.REMOVE })
    @JoinColumn(name = "receta_id")
    private List<Paso> pasos;
    @ManyToMany
    @JoinTable(name = "receta_categoria", joinColumns = @JoinColumn(name = "receta_id"), inverseJoinColumns = @JoinColumn(name = "categoria_id"))
    private List<Categoria> categorias;
    @ManyToMany
    @JoinTable(name = "receta_imagen", joinColumns = @JoinColumn(name = "receta_id"), inverseJoinColumns = @JoinColumn(name = "imagen_id"))
    private List<Imagen> imagenes;
    @OneToMany(cascade = { CascadeType.PERSIST, CascadeType.REMOVE })
    @JoinColumn(name = "receta_id")
    private List<Item> items;

}
