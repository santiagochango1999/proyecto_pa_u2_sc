package com.example.demo.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.uce.modelo.Hotel;
import com.example.demo.uce.repository.IHotalRepo;

@Service
public class HotelServiceImp implements IHotelService {

	@Autowired
	private IHotalRepo iHotalRepo;

	@Override
	public void crear(Hotel hotel) {
		// TODO Auto-generated method stub
		this.iHotalRepo.insertar(hotel);
	}

	@Override
	public void modificar(Hotel hotel) {
		// TODO Auto-generated method stub
		this.iHotalRepo.actualizar(hotel);
	}

	@Override
	public Hotel buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.iHotalRepo.buscar(id);
	}

	@Override
	public void borrar(Integer id) {
		// TODO Auto-generated method stub
		this.iHotalRepo.eliminar(id);
	}

}
