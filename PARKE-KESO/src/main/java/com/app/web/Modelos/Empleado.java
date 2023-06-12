package com.app.web.Modelos;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Empleado {
	
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
    private int id;
	private String usuario;
	private String password;
	
	public Empleado() {
		super();
	}

	public Empleado(int id, String usuario, String password) {
		super();
		this.id = id;
		this.usuario = usuario;
		this.password = password;
	}
	
	public Empleado(String usuario, String password) {
		super();
		
		this.usuario = usuario;
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "EmpleadoJuegos [id=" + id + ", usuario=" + usuario + ", password=" + password + "]";
	}
	
	
	
	
	
}
