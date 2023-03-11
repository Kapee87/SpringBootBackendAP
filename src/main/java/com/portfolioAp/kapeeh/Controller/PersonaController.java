package com.portfolioAp.kapeeh.Controller;

import com.portfolioAp.kapeeh.Entity.Persona;
import com.portfolioAp.kapeeh.Interface.IPersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

@CrossOrigin(origins = "http://localhost:4200")
public class PersonaController {

    @Autowired
    IPersonaService iPersonaService;

    @GetMapping("/personas/traer")
    public List<Persona> getPersona() {
        return iPersonaService.getPersona();
    }

    @GetMapping("/personas/traer/{id}")
    public Persona getPersonaById(@PathVariable Long id) {
        return iPersonaService.findPersona(id);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/personas/crear")
    public Persona createPersona(@RequestBody Persona persona) {
        iPersonaService.savePersona(persona);
        return persona;
    }
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/personas/borrar/{id}")
    public Persona deletePersona(@PathVariable Long id) {
        iPersonaService.deletePersona(id);
        return iPersonaService.findPersona(id);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/personas/editar/{id}")
    public Persona editPersona(@RequestBody Persona newPersona, @PathVariable Long id) {
        Persona persona = iPersonaService.findPersona(id);
        persona.setNombre(newPersona.getNombre());
        persona.setApellido(newPersona.getApellido());
        persona.setFechaNac(newPersona.getFechaNac());
        persona.setTelefono(newPersona.getTelefono());
        persona.setCorreo(newPersona.getCorreo());
        persona.setDescripcion(newPersona.getDescripcion());
        persona.setUrlFoto(newPersona.getUrlFoto());

        iPersonaService.savePersona(persona);
        return persona;
    }

    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/personas/vaciar")
    public void deleteAll() {
        iPersonaService.deleteAll();
    }

}
