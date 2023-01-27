package com.example.demo.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.uce.modelo.CochesEmplesa;
import com.example.demo.uce.repository.ICocheEmpresaRepo;

import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Transactional
@Repository
public class CocheEmpresaServiceImp implements ICocheEmpresaService {

	@Autowired
	private ICocheEmpresaRepo cocheEmpresaRepo;

	@Override
	public void crear(CochesEmplesa cochesEmpresa) {
		// TODO Auto-generated method stub
		this.cocheEmpresaRepo.insertar(cochesEmpresa);
	}

	@Override
	public void modificar(CochesEmplesa cochesEmpresa) {
		// TODO Auto-generated method stub
		this.cocheEmpresaRepo.actualizar(cochesEmpresa);
	}

	@Override
	public CochesEmplesa buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.cocheEmpresaRepo.buscar(id);
	}

	@Override
	public void borrar(Integer id) {
		// TODO Auto-generated method stub
		this.cocheEmpresaRepo.eliminar(id);
	}

}
