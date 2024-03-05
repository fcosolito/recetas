package com.proyectos.recetas;

import java.util.HashSet;
import java.util.Set;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.proyectos.recetas.dto.AlbumDto;
import com.proyectos.recetas.dto.RecetaDto;
import com.proyectos.recetas.dto.UsuarioDto;
import com.proyectos.recetas.model.Album;
import com.proyectos.recetas.model.Categoria;
import com.proyectos.recetas.model.Imagen;
import com.proyectos.recetas.model.Item;
import com.proyectos.recetas.model.Paso;
import com.proyectos.recetas.repository.AlbumRepository;
import com.proyectos.recetas.service.AlbumService;
import com.proyectos.recetas.service.RecetaService;
import com.proyectos.recetas.service.UsuarioService;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
@AllArgsConstructor
public class RecetasApplication implements CommandLineRunner {

	private UsuarioService usuarioService;
	private AlbumService albumService;
	private RecetaService recetaService;

	public static void main(String[] args) {
		SpringApplication.run(RecetasApplication.class, args);
	}

	@Override
	public void run(String... args) {
		log.info("Executing: command line runner");

		usuarioService.crearUsuario(new UsuarioDto("franco"));
		albumService.crearAlbum(new AlbumDto("pasta", "Recetas de pastas"), "franco");
		Set<Paso> pasos = new HashSet<>();
		Paso p1 = new Paso();
		p1.setDescripcion("Mezclar huevos y harina");
		pasos.add(p1);

		Set<Categoria> categorias = new HashSet<>();
		Categoria c1 = new Categoria();
		c1.setNombre("carbohidratos");
		categorias.add(c1);

		recetaService.crearReceta(new RecetaDto("Fideos", "Fideos al huevo", 30,
				pasos, null, categorias), 1L);

	}

}
