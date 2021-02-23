package com.Farmacia.farmacia.repository;

import java.util.List;

import com.Farmacia.farmacia.model.Produto;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {
	public List<Produto> findAllByTituloContainingIgnoreCase (String titulo);
	
}
