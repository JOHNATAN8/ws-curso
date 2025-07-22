package com.udemy.app.usuario.models.repository;


import org.springframework.data.repository.CrudRepository;
import com.udemy.app.usuario.models.entity.Curso;

public interface CursoRepository extends CrudRepository<Curso, Long> {

	

}
