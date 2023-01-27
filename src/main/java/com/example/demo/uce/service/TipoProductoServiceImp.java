package com.example.demo.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.uce.modelo.TipoProducto;
import com.example.demo.uce.repository.ITipoProductoRepo;

@Service
public class TipoProductoServiceImp implements ITipoProductoService {

	@Autowired
	private ITipoProductoRepo iTipoProductoRepo;

	@Override
	public void crear(TipoProducto producto) {
		// TODO Auto-generated method stub
		this.iTipoProductoRepo.insertar(producto);
	}

	@Override
	public void modificar(TipoProducto producto) {
		// TODO Auto-generated method stub
		this.iTipoProductoRepo.actualizar(producto);
	}

	@Override
	public TipoProducto buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.iTipoProductoRepo.buscar(id);
	}

	@Override
	public void borrar(Integer id) {
		// TODO Auto-generated method stub
		this.iTipoProductoRepo.eliminar(id);
	}

}
