package com.proyectos.recetas.model;

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
public class Album {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String descripcion;
    private String nombre;
    @OneToMany
    @JoinColumn(name = "album_id")
    private List<AlbumReceta> albumRecetas;
    @ManyToMany(cascade = { CascadeType.PERSIST })
    @JoinTable(name = "album_imagen", joinColumns = @JoinColumn(name = "album_id"), inverseJoinColumns = @JoinColumn(name = "imagen_id"))
    private List<Imagen> imagenes;
    @ManyToOne
    private Usuario autor;

}
