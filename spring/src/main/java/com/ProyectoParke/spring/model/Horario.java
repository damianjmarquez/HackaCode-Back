package com.ProyectoParke.spring.model;

import java.util.Date;

public class Horario {
	private int id;
	Date fechaInicio = new Date();
	Date fechaFin = new Date();
	Juego juego;
}
