package br.com.vitt.vdmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.vitt.vdmovie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long>{

}
