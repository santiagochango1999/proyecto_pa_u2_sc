package com.example.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.uce.modelo.Ciudadano;
import com.example.demo.uce.modelo.Empleado;
import com.example.demo.uce.modelo.Estudiante;
import com.example.demo.uce.modelo.Habitacion;
import com.example.demo.uce.modelo.Hotel;
import com.example.demo.uce.service.ICiudadanoService;
import com.example.demo.uce.service.IEmpleadoService;
import com.example.demo.uce.service.IEstudianteService;
import com.example.demo.uce.service.IHotelService;

@SpringBootApplication
public class ProyectoPaU2ScApplication implements CommandLineRunner {

	@Autowired
	private IHotelService iHotelService;

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
		List<Habitacion> habitacionlist= new ArrayList<>();
		
		Hotel hotel=new Hotel();
		hotel.setNombre("La coruña");
		hotel.setDireccion("av.colon");
		
		Habitacion habitacion=new Habitacion();
		habitacion.setNumero("001");
		habitacion.setHotel(hotel);
		habitacionlist.add(habitacion);
		
		Habitacion habitacion1=new Habitacion();
		habitacion1.setNumero("002");
		habitacion1.setHotel(hotel);
		habitacionlist.add(habitacion1);
		
		Habitacion habitacion2=new Habitacion();
		habitacion2.setNumero("003");
		habitacion2.setHotel(hotel);
		habitacionlist.add(habitacion2);
		
		
		
		hotel.setHabitaciones(habitacionlist);

		//this.iHotelService.crear(hotel);
		
		//BUSQUEDA Y ACTUALIZACION
		
//		Hotel hotel2=this.iHotelService.buscar(1);
//		hotel2.setDireccion("AV COLON Y 10 DE AGOSTO");
//		this.iHotelService.modificar(hotel2);
		
		//BORRAR
		this.iHotelService.borrar(1);
		
		
	}

}
