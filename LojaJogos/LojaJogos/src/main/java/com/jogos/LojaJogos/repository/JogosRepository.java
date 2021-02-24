
package com.jogos.LojaJogos.repository;

import java.util.List;

import com.jogos.LojaJogos.model.Jogos;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
@Repository

public interface JogosRepository extends JpaRepository<Jogos, Long> {
	public List<Jogos> findAllByTituloContainingIgnoreCase (String titulo);
}
