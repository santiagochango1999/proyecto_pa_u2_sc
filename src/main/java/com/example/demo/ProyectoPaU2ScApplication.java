package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.uce.modelo.Estudiante;
import com.example.demo.uce.service.IEstudianteService;

@SpringBootApplication
public class ProyectoPaU2ScApplication implements CommandLineRunner{

	@Autowired
	private IEstudianteService estudianteService;
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoPaU2ScApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Estudiante estudiante = new Estudiante();
		//Estudiante estudiante1 = new Estudiante();
		
		
		estudiante.setNombre("Santiago");
		estudiante.setApellido("chango");
		estudiante.setCedula("1727490953");
		estudiante.setCiudad("quito");
		estudiante.setGenero("M");
		
		this.estudianteService.agregar(estudiante);
		
//		estudiante1=this.estudianteService.buscar(3);
//		estudiante1.setNombre("Paul");
//		
//		this.estudianteService.modificar(estudiante1);
		
		

		
	}

}
