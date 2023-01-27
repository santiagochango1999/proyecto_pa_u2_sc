package com.example.demo.uce.repository;

import com.example.demo.uce.modelo.TipoProducto;

public interface ITipoProductoRepo {
	public void insertar(TipoProducto producto);

	public void actualizar(TipoProducto producto);

	public TipoProducto buscar(Integer id);

	public void eliminar(Integer id);

}
