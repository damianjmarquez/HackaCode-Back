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
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getContraseña() {
		return contraseña;
	}
	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}
   
    
    //tabla una en una 
    
    
    

    

	



	







	



	







	



	
	
	
    
    
    
}
