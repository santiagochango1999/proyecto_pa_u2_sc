package com.example.demo.uce.modelo;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="producto")
public class Producto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "pro_seq")
	@SequenceGenerator(name="pro_seq",sequenceName = "pro_seq",allocationSize = 1)
	@Column(name="pro_id")
	private Integer id;
	@Column(name="pro_nombre")
	private String nombre;
	@Column(name="pro_precio")
	private BigDecimal precio;

	
	@ManyToOne
	@JoinColumn(name="pro_id_tipo")
	private TipoProducto tipoproducto;

	
	

	@Override
	public String toString() {
		return "Producto [id=" + id + ", nombre=" + nombre + ", precio=" + precio + ", tipoproducto=" + tipoproducto
				+ "]";
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


	public BigDecimal getPrecio() {
		return precio;
	}


	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}


	public TipoProducto getTipoproducto() {
		return tipoproducto;
	}


	public void setTipoproducto(TipoProducto tipoproducto) {
		this.tipoproducto = tipoproducto;
	}
	
	
}
