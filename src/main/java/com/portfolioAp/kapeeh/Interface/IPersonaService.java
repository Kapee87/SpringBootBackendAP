package com.portfolioAp.kapeeh.Interface;

import com.portfolioAp.kapeeh.Entity.Persona;
import java.util.List;

public interface IPersonaService {

    //Traer una lista de personas
    public List<Persona> getPersona();

    //Guardar un objeto de tipo Persona
    public Persona savePersona(Persona persona);

    //Eliminar un usuario por ID
    public void deletePersona(Long id);

    //Buscar una persona por ID
    public Persona findPersona(Long id);

    public void deleteAll();
}
