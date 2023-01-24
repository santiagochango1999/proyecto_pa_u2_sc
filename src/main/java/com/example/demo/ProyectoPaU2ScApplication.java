package com.example.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.uce.modelo.Ciudadano;
import com.example.demo.uce.modelo.Empleado;
import com.example.demo.uce.modelo.Estudiante;
import com.example.demo.uce.service.ICiudadanoService;
import com.example.demo.uce.service.IEmpleadoService;
import com.example.demo.uce.service.IEstudianteService;

@SpringBootApplication
public class ProyectoPaU2ScApplication implements CommandLineRunner {

	@Autowired
	private IEstudianteService estudianteService;

	@Autowired
	private ICiudadanoService ciudadanoService;

	@Autowired
	private IEmpleadoService empleadoService;

	public static void main(String[] args) {
		SpringApplication.run(ProyectoPaU2ScApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub


		// CIUDADANO
//		Ciudadano ciu = new Ciudadano();
//		ciu.setNombre("Santiago ");
//		ciu.setApellido("Chango");
//
//		// EMPLEADO
//		Empleado emp = new Empleado();
//		emp.setSalario(new BigDecimal(20));
//		emp.setFechaIngreso(LocalDateTime.now());
//		emp.setCiudadano(ciu);
//
//		// INGRESAR
//		this.ciudadanoService.ingresar(ciu);
//		ciu.setEmpleado(emp);
//
//		this.empleadoService.ingresar(emp);
		//EJEMPLO 2
		
		// CIUDADANO
//		Ciudadano ciu2 = new Ciudadano();
//		ciu2.setNombre("Paul ");
//		ciu2.setApellido("Chango");
//
//		// EMPLEADO
//		Empleado emp2 = new Empleado();
//		emp2.setSalario(new BigDecimal(20));
//		emp2.setFechaIngreso(LocalDateTime.now());
//		emp2.setCiudadano(ciu2);
//		ciu2.setEmpleado(emp2);
//
//		this.empleadoService.ingresar(emp2);

		// BUSCAR Y ACTUALIZAr

//		Empleado emp1=this.empleadoService.encontrar(1);
//		emp1.setSalario(new BigDecimal(100));
//		this.empleadoService.actualizar(emp1);
//		
//		Ciudadano ciu1 =this.ciudadanoService.encontrar(1);
//		ciu1.setNombre("Henry");
//		this.ciudadanoService.actualizar(ciu1);

	}

}
