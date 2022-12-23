package com.portfolioAp.kapeeh.Controller;

import com.portfolioAp.kapeeh.Entity.Educacion;
import com.portfolioAp.kapeeh.Interface.IEducacionService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EducacionController {

    @Autowired
    IEducacionService educacionService;

    @GetMapping("/educacion/traer")
    public List<Educacion> getEducacion() {
        return educacionService.getEducacion();
    }

    @PostMapping("/educacion/crear")
    public String createEducacion(@RequestBody Educacion educacion) {
        educacionService.saveEducacion(educacion);
        return "La educacion se registró correctamente";
    }
    
    

}
