package SucursalBancariaEjercicio;

import java.time.LocalDate;

public class Cliente {
	
	private String nombre;
	private String apellidos;
	private String direccion;
	private String localidad;
	private LocalDate fechaNacimiento;
	
	public Cliente(String nombre, String apellidos, String direccion, String localidad, LocalDate fechaNacimiento) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.direccion = direccion;
		this.localidad = localidad;
		this.fechaNacimiento = fechaNacimiento;
	}
	
	public String nombreCompleto() {
		return nombre + " " + apellidos;
	}
	
	public String direccionCompleta() {
		return direccion + ", " + localidad ;
	}
	
	
	
	

}
