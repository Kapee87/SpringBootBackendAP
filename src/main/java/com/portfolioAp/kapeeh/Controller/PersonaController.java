package com.portfolioAp.kapeeh.Controller;

import com.portfolioAp.kapeeh.Entity.Persona;
import com.portfolioAp.kapeeh.Interface.IPersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonaController {

    @Autowired
    IPersonaService iPersonaService;

    @GetMapping("/personas/traer")
    public List<Persona> getPersona() {
        return iPersonaService.getPersona();
    }

    @PostMapping("/personas/crear")
    public String createPersona(@RequestBody Persona persona) {
        iPersonaService.savePersona(persona);
        return "La persona fue creada correctamente";
    }

    @DeleteMapping("/personas/borrar/{id}")
    public String deletePersona(@PathVariable Long id) {
        iPersonaService.deletePersona(id);
        return "La persona fue eliminada correctamente";
    }

    
    @PutMapping("/personas/editar/{id}")
    public Persona editPersona(@RequestBody Persona persona) {
        iPersonaService.updatePersona(persona);
        return persona;
    }
}
