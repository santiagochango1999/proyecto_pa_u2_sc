package com.example.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import org.hibernate.engine.jdbc.spi.TypeSearchability;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.uce.modelo.CochesEmplesa;
import com.example.demo.uce.modelo.Empleados;
import com.example.demo.uce.service.ICocheEmpresaService;
import com.example.demo.uce.modelo.Ciudadano;
import com.example.demo.uce.modelo.Empleado;
import com.example.demo.uce.modelo.Estudiante;
import com.example.demo.uce.modelo.Habitacion;
import com.example.demo.uce.modelo.Hotel;
import com.example.demo.uce.modelo.Producto;
import com.example.demo.uce.modelo.TipoProducto;
import com.example.demo.uce.service.ICiudadanoService;
import com.example.demo.uce.service.IEmpleadoService;
import com.example.demo.uce.service.IEstudianteService;
import com.example.demo.uce.service.IHabitacionService;
import com.example.demo.uce.service.IHotelService;
import com.example.demo.uce.service.ITipoProductoService;

@SpringBootApplication
public class ProyectoPaU2ScApplication implements CommandLineRunner {
	
	@Autowired
	private ITipoProductoService iTipoProductoService;

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
		// EJEMPLO 2

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
//		List<Habitacion> habitacionlist = new ArrayList<>();

//		Hotel hotel = new Hotel();
//		hotel.setNombre("La coruña");
//		hotel.setDireccion("av.colon");
//
//		Habitacion habitacion = new Habitacion();
//		habitacion.setNumero("001");
//		habitacion.setHotel(hotel);
//		habitacionlist.add(habitacion);
//
//		Habitacion habitacion1 = new Habitacion();
//		habitacion1.setNumero("002");
//		habitacion1.setHotel(hotel);
//		habitacionlist.add(habitacion1);
//
//		Habitacion habitacion2 = new Habitacion();
//		habitacion2.setNumero("003");
//		habitacion2.setHotel(hotel);
//		habitacionlist.add(habitacion2);
//
//		hotel.setHabitaciones(habitacionlist);

//		this.iHotelService.crear(hotel);

//		BUSQUEDA Y ACTUALIZACION

//		Hotel hotel2 = this.iHotelService.buscar(2);
//		System.out.println("El nombre del hotel es: "+hotel2.getNombre());
//		System.out.println("SUS habitaciones son: ");
//		
//		for (Habitacion habitacion : hotel2.getHabitaciones()) {
//			System.out.println(habitacion);
//		}
//		

//		Habitacion habitacion3=this.iHabitacionService.buscar(14);

//		this.iHabitacionService.borrar(8);

		// BORRAR
//		this.iHotelService.borrar(1);
		
		
//		CochesEmplesa cochesEmplesa = new CochesEmplesa();
//		cochesEmplesa.setColor("Rojo");
//		cochesEmplesa.setPlaca("prt2341");
//
//		Empleados empleado = new Empleados();
//		empleado.setApellido("chango");
//		empleado.setNombre("santiago");
//		empleado.setSalario(new BigDecimal(100));
//		empleado.setCochesemplesa(cochesEmplesa);
//		
//		cochesEmplesa.setEmpleados(empleado);

		//CREACION
//		this.cocheEmpresaService.crear(cochesEmplesa);
		
		//BUSCAR Y ACTUALIZAR
//		CochesEmplesa cochesEmplesa2=this.cocheEmpresaService.buscar(2);
//		cochesEmplesa2.setColor("blanco");
//		this.cocheEmpresaService.modificar(cochesEmplesa2);
		
		//ELIMINAR
//		this.cocheEmpresaService.borrar(2);
		
		List<Producto> list=new ArrayList<>();
		
		TipoProducto tipoProducto=new TipoProducto();
		tipoProducto.setNombre("carnes");
		
		Producto producto=new Producto();
		producto.setNombre("lomofino");
		producto.setPrecio(new BigDecimal(6));
		producto.setTipoproducto(tipoProducto);
		list.add(producto);
		
		Producto producto1=new Producto();
		producto1.setNombre("lomofalda");
		producto1.setPrecio(new BigDecimal(4));
		producto1.setTipoproducto(tipoProducto);
		list.add(producto1);
		
		Producto producto2=new Producto();
		producto2.setNombre("pulpa");
		producto2.setPrecio(new BigDecimal(3));
		producto2.setTipoproducto(tipoProducto);
		list.add(producto2);
		
		tipoProducto.setProducto(list);
		
//		this.iTipoProductoService.crear(tipoProducto);

//		BUSQUEDA Y ACTUALIZACION

//		TipoProducto tipoProducto2 = this.iTipoProductoService.buscar(1);
//		tipoProducto2.setNombre("cortes de carne");
//		this.iTipoProductoService.modificar(tipoProducto2);
		
		
		this.iTipoProductoService.borrar(1);
	}

}
