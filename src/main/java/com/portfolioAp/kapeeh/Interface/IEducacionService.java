package com.portfolioAp.kapeeh.Interface;

import com.portfolioAp.kapeeh.Entity.Educacion;
import java.util.List;

public interface IEducacionService {

    public List<Educacion> getEducacion();

    public Educacion saveEducacion(Educacion educacion);

    public void deleteEducacion(Long id);

    public Educacion findEducacion(Long id);

    public void updateEducacion(Educacion educacion);

}
