package com.parke.parke.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.parke.parke.model.Usuario;

import com.parke.parke.service.IUsuarioService;

@RestController
public class UsuarioController {
    
    @Autowired
    private IUsuarioService persoServ;
    
    @GetMapping ("/personas/traer")
    public List<Usuario> getPersonas() {
        
        return persoServ.getPersonas();
    }
    
    @PostMapping ("/personas/crear")
    public String savePersona (@RequestBody Usuario perso) {
        persoServ.savePersona(perso);
        
        return "La persona fue creada correctamente";
    }
    
    @DeleteMapping ("/personas/borrar/{id}")
    public String deletePersona(@PathVariable Long id) {
        persoServ.deletePersona(id);
        return "La persona fue eliminada correctamente";
    }
    
    @PutMapping ("/personas/editar/{id_original}")
    public Usuario editPersona (@PathVariable Long id_original,
            @RequestParam(required = false, name = "id") Long nuevaId,
            @RequestParam(required = false, name = "nombre") String nuevoUsuario,
            @RequestParam(required = false, name = "apellido") String nuevoContraseña) {
            
        persoServ.editPersona(id_original, nuevaId, nuevoUsuario, nuevoContraseña);
        
        Usuario perso = persoServ.findPersona(nuevaId);
        
        return perso;

    }
    
    @PutMapping ("/personas/editar")
    public Usuario editPersona(@RequestBody Usuario per) {
    	persoServ.editPersona(per);
    	
    	return persoServ.findPersona(per.getId());
    }
    
    
}
