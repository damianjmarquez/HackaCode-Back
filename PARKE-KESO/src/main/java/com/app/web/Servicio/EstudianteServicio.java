package com.app.web.Servicio;
import java.util.List;

import com.app.web.Modelos.Estudiante;
public interface EstudianteServicio {

	public List<Estudiante> listarTodosLosEstudiantes();
	public Estudiante guardarEstudiante(Estudiante estudiante);
	
	public Estudiante obtenerEstudiantePorID(Long id);
	
	public Estudiante actualizarEstudiante(Estudiante estudiante);
	
	public void  eliminarEstudiante(Long id);
	}
