package com.app.web.Controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.app.web.Modelos.Estudiante;
import com.app.web.Servicio.EstudianteServicio;

@Controller
public class EstudianteControlador {
	
	@Autowired
	private EstudianteServicio servicio;
	
	@GetMapping ("/estudiantes/index") 
	public String abrirArchivo() {
		return "index";
	}
	
	@GetMapping ("/estudiantes") 
	public String listarEstudiantes(Model modelo) {
		modelo.addAttribute("estudiantes" , servicio.listarTodosLosEstudiantes());
		return "estudiantes";
	}
	
	@GetMapping ("/estudiantes/nuevo")
	public String mostrarFormularioDeRegistrarEstudiante(Model modelo) {
		Estudiante estudiante = new Estudiante();
		modelo.addAttribute("estudiante", estudiante);
		return "estudiantesFormulario";
	}
	
	@PostMapping("/estudiantes")
	public String guardarEstudiante(@ModelAttribute("estudiante") Estudiante estudiante) {
		servicio.guardarEstudiante(estudiante);
		return "redirect:/estudiantes";
		
	}
	
	
	@GetMapping ("/estudiantes/editar/{id}")
	public String mostrarFormularioDeEditar(@PathVariable Long id , Model modelo) {
		modelo.addAttribute("estudiante", servicio.obtenerEstudiantePorID(id));
		return "editar_estudiante";
		
	}
	
	@PostMapping("/estudiantes/{id}")
	 public String actualizarEstudiante(@PathVariable Long id, @ModelAttribute ("estudiante") Estudiante estudiante,Model modelo) {
		Estudiante estudianteExistente = servicio.obtenerEstudiantePorID(id);
		estudianteExistente.setId(id);
		estudianteExistente.setNombre(estudiante.getNombre());
		estudianteExistente.setApellido(estudiante.getApellido());
		estudianteExistente.setEmail(estudiante.getEmail());
		servicio.actualizarEstudiante(estudianteExistente);
		return "redirect:/estudiantes";
	}
	
	@GetMapping ("/estudiantes/{id}")
	public String eliminarEstudiante(@PathVariable Long id ) {
		servicio.eliminarEstudiante(id);
		return "redirect:/estudiantes";
	}
	
	
}