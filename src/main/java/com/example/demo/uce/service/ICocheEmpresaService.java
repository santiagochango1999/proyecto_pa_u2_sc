package com.example.demo.uce.service;

import com.example.demo.uce.modelo.CochesEmplesa;

public interface ICocheEmpresaService {

	public void crear(CochesEmplesa cochesEmpresa);

	public void modificar(CochesEmplesa cochesEmpresa);

	public CochesEmplesa buscar(Integer id);

	public void borrar(Integer id);

}
