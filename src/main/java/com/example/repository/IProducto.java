package com.example.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.model.Producto;

public interface IProducto extends JpaRepository<Producto, Long> {
	List<Producto> findByCategoriaId(Long categoriaId);
}