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
public class ProyectoPaU2ScApplication implements CommandLineRunner{

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
//		Estudiante estudiante = new Estudiante();
//		//Estudiante estudiante1 = new Estudiante();
//		
//		
//		estudiante.setNombre("sebas");
//		estudiante.setApellido("chango");
//		estudiante.setCedula("1727490953");
//		estudiante.setCiudad("quito");
//		estudiante.setGenero("M");
//		
//		this.estudianteService.agregar(estudiante);
		
//		estudiante1=this.estudianteService.buscar(3);
//		estudiante1.setNombre("Paul");
//		
//		this.estudianteService.modificar(estudiante1);
		
		//CIUDADANO
		Ciudadano ciu=new Ciudadano();
		ciu.setNombre("Santiago ");
		ciu.setApellido("Chango");

		
		//EMPLEADO
		Empleado emp=new Empleado();
		emp.setSalario(new BigDecimal(20));
		emp.setFechaIngreso(LocalDateTime.now());
		emp.setCiudadano(ciu);
		
		
		//INGRESAR
//		this.ciudadanoService.ingresar(ciu);
//		this.empleadoService.ingresar(emp);
		
		//BUSCAR Y ACTUALIZAr
		
		Empleado emp1=this.empleadoService.encontrar(1);
		emp1.setSalario(new BigDecimal(100));
		this.empleadoService.actualizar(emp1);
		
		Ciudadano ciu1 =this.ciudadanoService.encontrar(52);
		ciu1.setNombre("Henry");
		ciu1.setEmpleado(emp1);
		this.ciudadanoService.actualizar(ciu1);

		
	}

}
