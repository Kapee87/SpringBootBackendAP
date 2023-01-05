package com.portfolioAp.kapeeh.Service;

import com.portfolioAp.kapeeh.Entity.Proyectos;
import com.portfolioAp.kapeeh.Interface.IProyectosService;
import com.portfolioAp.kapeeh.Repository.proyectosRepository;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ImpProyectosService implements IProyectosService {

    @Autowired
    private proyectosRepository ProyectosRepo;

    @Override
    public List<Proyectos> getProyectos() {
        List<Proyectos> proyectos = ProyectosRepo.findAll();
        return proyectos;
    }

    @Override
    public void saveProyectos(Proyectos proyecto) {
        ProyectosRepo.save(proyecto);
    }

    @Override
    public void deleteProyectos(Long id) {
        ProyectosRepo.deleteById(id);
    }

    @Override
    public Proyectos findProyecto(Long id) {
        Proyectos proyecto = ProyectosRepo.findById(id).orElse(null);
        return proyecto;
    }

    @Override
    public void updateProyectos(Proyectos proyectos) {
        ProyectosRepo.save(proyectos);
    }

    @Override
    public void vaciarProyectos() {
        ProyectosRepo.deleteAll();
    }
}
