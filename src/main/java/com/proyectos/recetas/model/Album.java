package com.proyectos.recetas.model;

import java.util.HashSet;
import java.util.Set;

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
    private Set<AlbumReceta> albumRecetas;
    @ManyToMany(cascade = { CascadeType.PERSIST })
    @JoinTable(name = "album_imagen", joinColumns = @JoinColumn(name = "album_id"), inverseJoinColumns = @JoinColumn(name = "imagen_id"))
    private Set<Imagen> imagenes;
    @ManyToOne
    private Usuario autor;

    public Album() {
        this.albumRecetas = new HashSet<>();
    }
}
