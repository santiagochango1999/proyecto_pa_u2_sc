package com.example.demo.uce.modelo;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "cochesemplesa")
public class CochesEmplesa {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "co_seq")
	@SequenceGenerator(name = "co_Seq", sequenceName = "co_seq", allocationSize = 1)
	@Column(name = "co_id_coche")
	private Integer idCoche;
	@Column(name = "co_placa")
	private String placa;
	@Column(name = "co_color")
	private String color;

	@OneToOne(mappedBy = "cochesemplesa",cascade = CascadeType.ALL)
	private Empleados empleados;

	@Override
	public String toString() {
		return "CochesEmpresa [idCoche=" + idCoche + ", placa=" + placa + ", color=" + color + "]";
	}

	// GET Y SET
	
	
	public Integer getIdCoche() {
		return idCoche;
	}

	public Empleados getEmpleados() {
		return empleados;
	}

	public void setEmpleados(Empleados empleados) {
		this.empleados = empleados;
	}

	public void setIdCoche(Integer idCoche) {
		this.idCoche = idCoche;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}
