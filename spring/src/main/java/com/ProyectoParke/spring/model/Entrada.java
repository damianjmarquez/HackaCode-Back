package com.ProyectoParke.spring.model;

import java.util.Date;

public class Entrada {
	private int id;
	private Venta venta;
	private Juego juego;
	private Comprador comprador;
	private String codigo;
	private Date fechaCompraEntrada = new Date();
	private Date HorarioCompraEntrada = new Date();
	
}
