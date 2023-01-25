package com.example.demo.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.uce.modelo.Habitacion;
import com.example.demo.uce.repository.IHabitacionRepo;

@Service
public class HabitacionServiceImp implements IHabitacionService {

	@Autowired
	private IHabitacionRepo iHabitacionRepo;

	@Override
	public void crear(Habitacion habitacion) {
		// TODO Auto-generated method stub
		this.iHabitacionRepo.insertar(habitacion);
	}

	@Override
	public void modificar(Habitacion habitacion) {
		// TODO Auto-generated method stub
		this.iHabitacionRepo.actualizar(habitacion);
	}

	@Override
	public Habitacion buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.iHabitacionRepo.buscar(id);
	}

	@Override
	public void borrar(Integer id) {
		// TODO Auto-generated method stub
		this.iHabitacionRepo.eliminar(id);
	}

}
