package com.Farmacia.farmacia.repository;

import java.util.List;
import com.Farmacia.farmacia.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria,Long > {
	public List<Categoria> findAllByDescricaoContainingIgnoreCase(String descricao );
}
