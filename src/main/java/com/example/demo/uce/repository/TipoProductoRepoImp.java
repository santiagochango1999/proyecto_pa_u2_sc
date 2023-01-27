package com.example.demo.uce.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.uce.modelo.TipoProducto;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Transactional
@Repository
public class TipoProductoRepoImp implements ITipoProductoRepo {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(TipoProducto producto) {
		// TODO Auto-generated method stub
		this.entityManager.persist(producto);
	}

	@Override
	public void actualizar(TipoProducto producto) {
		// TODO Auto-generated method stub
		this.entityManager.merge(producto);
	}

	@Override
	public TipoProducto buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(TipoProducto.class, id);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		TipoProducto producto = this.buscar(id);
		this.entityManager.remove(producto);
	}

}
