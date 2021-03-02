package org.generation.blogPessoal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import org.generation.blogPessoal.model.Tema;

public interface TemaRepository extends JpaRepository<Tema,Long > {
	public List<Tema> findAllByDescricaoContainingIgnoreCase(String descricao);
}
