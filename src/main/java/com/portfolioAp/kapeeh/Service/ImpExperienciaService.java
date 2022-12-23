package com.portfolioAp.kapeeh.Service;

import com.portfolioAp.kapeeh.Entity.Experiencia;
import com.portfolioAp.kapeeh.Interface.IExperienciaService;
import com.portfolioAp.kapeeh.Repository.experienciaRepository;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class ImpExperienciaService implements IExperienciaService {
    
    @Autowired
    private experienciaRepository ExpRepo;
    
    @Override
    public List<Experiencia> getExperiencia() {
        List<Experiencia> experiencias = ExpRepo.findAll();
        return experiencias;
    }
    
    @Override
    public void saveExperiencia(Experiencia experiencia) {
        ExpRepo.save(experiencia);
    }
    
    @Override
    public void deleteExperiencia(Long id) {
        ExpRepo.deleteById(id);
    }
    
    @Override
    public Experiencia findExperiencia(Long id) {
        Experiencia experiencia = ExpRepo.findById(id).orElse(null);
        return experiencia;
    }
    
    @Override
    public void updateExperiencia(Experiencia experiencia) {
        Experiencia newExp = ExpRepo.findById(experiencia.getIdExp()).orElse(null);
        ExpRepo.deleteById(experiencia.getIdExp());
        ExpRepo.save(newExp);
    }
    
}
