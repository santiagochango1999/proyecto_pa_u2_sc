package com.example.demo.uce.repository;

import com.example.demo.uce.modelo.CochesEmplesa;

public interface ICocheEmpresaRepo {
	
	public void insertar(CochesEmplesa cochesEmpresa);

	public void actualizar(CochesEmplesa cochesEmpresa);

	public CochesEmplesa buscar(Integer id);

	public void eliminar(Integer id);

}
