package com.example.demo.uce.modelo;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "empleados")
public class Empleados {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "empl_seq")
	@SequenceGenerator(name = "empl_seq", sequenceName = "empl_Seq", allocationSize = 1)
	@Column(name = "empl_id_empleado")
	private Integer idEmpleado;
	@Column(name = "empl_nombre")
	private String nombre;
	@Column(name = "empl_apellido")
	private String apellido;
	@Column(name = "empl_salario")
	private BigDecimal salario;
	

	@OneToOne
	@JoinColumn(name = "empl_id_coche")
	private CochesEmplesa cochesemplesa;

	@Override
	public String toString() {
		return "Empleado [inEmpleado=" + idEmpleado + ", nombre=" + nombre + ", apellido=" + apellido + ", salario="
				+ salario + "]";
	}

	// GET Y SET
	

	public String getNombre() {
		return nombre;
	}

	public Integer getIdEmpleado() {
		return idEmpleado;
	}

	public void setIdEmpleado(Integer idEmpleado) {
		this.idEmpleado = idEmpleado;
	}

	public CochesEmplesa getCochesemplesa() {
		return cochesemplesa;
	}

	public void setCochesemplesa(CochesEmplesa cochesemplesa) {
		this.cochesemplesa = cochesemplesa;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public BigDecimal getSalario() {
		return salario;
	}

	public void setSalario(BigDecimal salario) {
		this.salario = salario;
	}

}
