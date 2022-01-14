package br.com.vitt.vdmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.vitt.vdmovie.entities.Score;
import br.com.vitt.vdmovie.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK>{

}
