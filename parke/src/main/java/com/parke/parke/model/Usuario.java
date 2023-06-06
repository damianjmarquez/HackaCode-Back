package com.parke.parke.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;


@Entity
public class Usuario {
    
    @Id
    
    private Long id;
    private String usuario;
    private String contraseña;
   
    
    //tabla una en una 
    
    
    

    

	



	







	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return usuario;
	}

	public void setNombre(String nombre) {
		this.usuario = nombre;
	}

	public String getApellido() {
		return contraseña;
	}

	public void setApellido(String apellido) {
		this.contraseña = apellido;
	}

	



	







	



	
	
	
    
    
    
}
