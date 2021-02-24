
package com.jogos.LojaJogos.repository;

import java.util.List;
import com.jogos.LojaJogos.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CategoriaRepository extends JpaRepository<Categoria,Long > {
	public List<Categoria> findAllByDescricaoContainingIgnoreCase(String descricao );
}
