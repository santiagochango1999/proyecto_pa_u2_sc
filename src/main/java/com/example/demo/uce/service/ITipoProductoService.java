package com.example.demo.uce.service;

import com.example.demo.uce.modelo.TipoProducto;

public interface ITipoProductoService {

	public void crear(TipoProducto producto);

	public void modificar(TipoProducto producto);

	public TipoProducto buscar(Integer id);

	public void borrar(Integer id);
}
