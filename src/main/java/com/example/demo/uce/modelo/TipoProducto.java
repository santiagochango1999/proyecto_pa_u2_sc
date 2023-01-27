package com.example.demo.uce.modelo;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="tipoproducto")
public class TipoProducto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "tipo_seq")
	@SequenceGenerator(name="tipo_seq",sequenceName = "tipo_seq",allocationSize = 1)
	@Column(name="tipo_id")
	private Integer id;
	@Column(name="tipo_nombre")
	private String nombre;
	
	@OneToMany(mappedBy = "tipoproducto",cascade = CascadeType.ALL)
	private List<Producto> producto;

	
	
	
	@Override
	public String toString() {
		return "TipoProducto [id=" + id + ", nombre=" + nombre + "]";
	}

	//GET Y SET
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Producto> getProducto() {
		return producto;
	}

	public void setProducto(List<Producto> producto) {
		this.producto = producto;
	}
	
	
	
	
	

}
