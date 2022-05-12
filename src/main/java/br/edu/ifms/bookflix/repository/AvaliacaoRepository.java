package br.edu.ifms.bookflix.repository;

import br.edu.ifms.bookflix.model.Avaliacao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AvaliacaoRepository extends JpaRepository<Avaliacao, Integer>{

}
