package br.com.desafiozup.tentativatres.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.desafiozup.tentativatres.model.Sorteio;

@Repository
public interface SorteioReposiroty extends JpaRepository<Sorteio, Long> {

}
