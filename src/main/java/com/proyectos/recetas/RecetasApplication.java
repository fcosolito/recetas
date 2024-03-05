package com.proyectos.recetas;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.proyectos.recetas.model.Album;
import com.proyectos.recetas.model.Imagen;
import com.proyectos.recetas.repository.AlbumRepository;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
@AllArgsConstructor
public class RecetasApplication implements CommandLineRunner {

	private AlbumRepository albumRepository;

	public static void main(String[] args) {
		SpringApplication.run(RecetasApplication.class, args);
	}

	@Override
	public void run(String... args) {
		log.info("Executing: command line runner");

		Imagen imagen1 = new Imagen();
		imagen1.setNombre("Imagen 1");

		Album album1 = new Album();
		album1.setNombre("Album 1");
		album1.setDescripcion("Descripcion...");
		album1.setImagenes(List.of(imagen1));

		albumRepository.save(album1);

	}

}
