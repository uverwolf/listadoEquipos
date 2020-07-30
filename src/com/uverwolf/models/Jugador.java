package com.uverwolf.models;

public class Jugador {
	
	private String primerNombre;
	private String apellido;
	private int edad;
	private String equipo;
	
	public Jugador() {
		
	}
	public Jugador(String nombre,String apellido,int edad) {
		setPrimerNombre(nombre);
		setApellido(apellido);
		setEdad(edad);
	}
	public String getPrimerNombre() {
		return primerNombre;
	}
	public void setPrimerNombre(String primerNombre) {
		this.primerNombre = primerNombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getEquipo() {
		return equipo;
	}
	public void setEquipo(String equipo) {
		this.equipo = equipo;
	}
	
}
