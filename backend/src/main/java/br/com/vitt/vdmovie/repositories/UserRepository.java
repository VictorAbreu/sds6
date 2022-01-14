package br.com.vitt.vdmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.vitt.vdmovie.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	User findByEmail(String email);

}
