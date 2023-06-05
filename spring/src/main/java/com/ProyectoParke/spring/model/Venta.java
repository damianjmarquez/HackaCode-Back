package com.ProyectoParke.spring.model;

import java.util.Date;

public class Venta {
	private int id;
	private Empleado empleado;
	private Date fechaVenta = new Date();
	private int cantidad;
	private int total;
}
