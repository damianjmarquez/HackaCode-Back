package com.parke.parke.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;


@Entity
public class Juego {
	
	@Id
    @GeneratedValue (strategy = GenerationType.AUTO)
	private int id;
	private String nombre;
	private int cantidadDePersonas;
	private int precio;
	
	
	public Juego() {
		super();
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getCantidadDePersonas() {
		return cantidadDePersonas;
	}


	public void setCantidadDePersonas(int cantidadDePersonas) {
		this.cantidadDePersonas = cantidadDePersonas;
	}


	public int getPrecio() {
		return precio;
	}


	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	
}
