package com.udemy.app.usuario.controllers;

import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.udemy.app.commons.controllers.CommonController;
import com.udemy.app.usuario.models.entity.Curso;
import com.udemy.app.usuario.services.CursoService;

@RestController
public class CursoController extends CommonController<Curso, CursoService>{
		
	@PutMapping("/{id}")
	public  ResponseEntity<?> editar(@RequestBody Curso curso, @PathVariable Long id) {
		Optional<Curso> o = this.service.findById(id);
		
		if(o.isEmpty()) {
			return ResponseEntity.notFound().build();
		}
		
		Curso cursoDb = o.get();
		cursoDb.setNombre(curso.getNombre());
		return ResponseEntity.status(HttpStatus.CREATED).body(this.service.save(cursoDb));
	}

}
