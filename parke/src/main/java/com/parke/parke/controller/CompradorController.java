package com.parke.parke.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.parke.parke.service.ICompradorService;
import com.parke.parke.model.Comprador;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/compradores")
public class CompradorController {

	 	@Autowired
	    private ICompradorService CompradorServ;
	 
	 
	    @GetMapping ()
	    public List<Comprador> getComprador() {
	        return CompradorServ.getComprador();
	    }

		@PostMapping ()
	    public String saveComprador (@RequestBody Comprador comprador) {
	    	CompradorServ.saveComprador(comprador);
	        return "El comprador fue creada correctamente";
	    }

	    @DeleteMapping ("/{id}")
	    public String deletePersona(@PathVariable int id) {
	    	CompradorServ.deleteComprador(id);
	        return "El comprador fue eliminado correctamente";
	    }
	    
	    
	    
	    @PutMapping ("/{id}")
	    public Comprador editComprador (@PathVariable int id,
	            @RequestParam(required = false, name = "id") int nuevaId,
	            @RequestParam(required = false, name = "nombre") String nuevoNombre,
	            @RequestParam(required = false, name = "apellido") String nuevoApellido,
	            @RequestParam(required = false, name = "nacimiento") String nuevaFecha,
	            @RequestParam(required = false, name = "dni") String nuevoDni,
	            @RequestParam(required = false, name = "telefono") String nuevoTelefono,
	            @RequestParam(required = false, name = "email") String nuevoEmail
	            ) {
	            
	    	CompradorServ.editComprador(id, nuevaId, nuevoNombre, nuevoApellido,
	    								nuevaFecha, nuevoDni, nuevoTelefono, nuevoEmail);
	        
	        Comprador comprador = CompradorServ.findComprador(nuevaId);
	        
	        return comprador;

	    }
	    
	   
	    @PutMapping ("/editar")
	    public Comprador editComprador(@RequestBody Comprador comprador) {
	    	CompradorServ.editComprador(comprador);
	    	
	    	return CompradorServ.findComprador(comprador.getId());
	    }
}
