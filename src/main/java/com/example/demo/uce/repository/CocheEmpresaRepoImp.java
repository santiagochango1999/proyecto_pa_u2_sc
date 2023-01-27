package com.example.demo.uce.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.uce.modelo.CochesEmplesa;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Transactional
@Repository
public class CocheEmpresaRepoImp implements ICocheEmpresaRepo {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(CochesEmplesa cochesEmpresa) {
		// TODO Auto-generated method stub
		this.entityManager.persist(cochesEmpresa);
	}

	@Override
	public void actualizar(CochesEmplesa cochesEmpresa) {
		// TODO Auto-generated method stub
		this.entityManager.merge(cochesEmpresa);
	}

	@Override
	public CochesEmplesa buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(CochesEmplesa.class, id);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		CochesEmplesa cochesEmpresa = this.buscar(id);
		this.entityManager.remove(cochesEmpresa);
	}

}
