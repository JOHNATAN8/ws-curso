package com.udemy.app.usuario.services.impl;

import org.springframework.stereotype.Service;

import com.udemy.app.commons.services.impl.CommonServiceImpl;
import com.udemy.app.usuario.models.entity.Curso;
import com.udemy.app.usuario.models.repository.CursoRepository;
import com.udemy.app.usuario.services.CursoService;

@Service
public class CursoServiceImpl extends CommonServiceImpl<Curso, CursoRepository> implements CursoService {

}
