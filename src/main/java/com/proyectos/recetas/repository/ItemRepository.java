package com.proyectos.recetas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proyectos.recetas.key.ItemKey;
import com.proyectos.recetas.model.Item;

public interface ItemRepository extends JpaRepository<Item, ItemKey> {

}
