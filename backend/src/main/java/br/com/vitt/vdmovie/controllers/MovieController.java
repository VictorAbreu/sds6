package br.com.vitt.vdmovie.controllers;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.vitt.vdmovie.dto.MovieDTO;
import br.com.vitt.vdmovie.services.MovieService;

@RestController
@RequestMapping(value = "/movies")
public class MovieController {
	
	private MovieService service;
	
	@GetMapping
	public Page<MovieDTO> findAll(Pageable pageable){
		return service.findAll(pageable);
	}
	
	@GetMapping(value = "/{id}")
	public MovieDTO findById(@PathVariable Long id){
		return service.findById(id);
	}

}