package com.portfolioAp.kapeeh.Interface;

import com.portfolioAp.kapeeh.Entity.Proyectos;
import java.util.List;

public interface IProyectosService {

    public List<Proyectos> getProyectos();

    public Proyectos saveProyectos(Proyectos proyecto);

    public void deleteProyectos(Long id);
    
    public void vaciarProyectos();

    public Proyectos findProyecto(Long id);

    public void updateProyectos(Proyectos proyectos);
}
