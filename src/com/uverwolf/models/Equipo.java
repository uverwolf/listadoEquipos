package com.uverwolf.models;

public class Equipo {
	private String nombre;
	private int nroJugadores =0;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getNroJugadores() {
		return nroJugadores;
	}
	public void setNroJugadores(int nroJugadores) {
		this.nroJugadores = nroJugadores;
	}
}
