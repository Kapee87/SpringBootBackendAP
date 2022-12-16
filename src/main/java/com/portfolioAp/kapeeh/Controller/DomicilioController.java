package com.portfolioAp.kapeeh.Controller;

import com.portfolioAp.kapeeh.Entity.Domicilio;
import com.portfolioAp.kapeeh.Interface.IDomicilioService;
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

@RestController
public class DomicilioController {

    @Autowired
    IDomicilioService iDomicilioService;

    @GetMapping("/domicilio/traer")
    public List<Domicilio> getDomicilio() {
        return iDomicilioService.getDomicilio();
    }

    @PostMapping("/domicilio/crear")
    public String createDomicilio(@RequestBody Domicilio domicilio) {
        iDomicilioService.saveDomicilio(domicilio);
        return "El Domicilio fue creado correctamente";
    }

    @DeleteMapping("/domicilio/borrar/{id}")
    public String deleteDomicilio(@PathVariable Long id) {
        iDomicilioService.deleteDomicilio(id);
        return "El domicilio fue borrado correctamente";
    }

    @PutMapping("/domicilio/editar/{id}")
    public Domicilio editDomicilio(@PathVariable Long id,
            @RequestParam("direccionPostal") String nuevoDireccionPostal,
            @RequestParam("localidad") String nuevaLocalidad,
            @RequestParam("codigoPostal") String nuevoCodigoPostal,
            @RequestParam("provincia") String nuevaProvincia,
            @RequestParam("pais") String pais
    ) {
        Domicilio domicilio = iDomicilioService.findDomicilio(id);
        domicilio.setDireccionPostal(nuevoDireccionPostal);
        domicilio.setLocalidad(nuevaLocalidad);
        domicilio.setCodigoPostal(nuevoCodigoPostal);
        domicilio.setProvincia(nuevaProvincia);
        domicilio.setPais(pais);

        iDomicilioService.saveDomicilio(domicilio);

        return domicilio;
    }
}
