package com.example.demo.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.uce.modelo.Profesor;
import com.example.demo.uce.repository.IProfesorRepo;

@Service
public class ProfesorServiceImp implements IProfesorService {

	@Autowired
	private IProfesorRepo iProfesorRepo;

	@Override
	public void agregar(Profesor profesor) {
		// TODO Auto-generated method stub
		this.iProfesorRepo.insertar(profesor);
	}

	@Override
	public void modificar(Profesor profesor) {
		// TODO Auto-generated method stub
		this.iProfesorRepo.actualizar(profesor);
	}

	@Override
	public Profesor buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.iProfesorRepo.buscar(id);
	}

	@Override
	public void borrar(Integer id) {
		// TODO Auto-generated method stub
		this.iProfesorRepo.eliminar(id);
	}

}
