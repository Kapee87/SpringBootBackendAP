package com.portfolioAp.kapeeh.Service;

import com.portfolioAp.kapeeh.Entity.Educacion;
import com.portfolioAp.kapeeh.Interface.IEducacionService;
import com.portfolioAp.kapeeh.Repository.educacionRepository;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ImpEducacionService implements IEducacionService {
    
    @Autowired
    private educacionRepository eduRepo;
    
    @Override
    public List<Educacion> getEducacion() {
        List<Educacion> educaciones = eduRepo.findAll();
        return educaciones;
    }
    
    @Override
    public void saveEducacion(Educacion educacion) {
        eduRepo.save(educacion);
    }
    
    @Override
    public void deleteEducacion(Long id) {
        eduRepo.deleteById(id);
    }
    
    @Override
    public Educacion findEducacion(Long id) {
        Educacion educacion = eduRepo.findById(id).orElse(null);
        return educacion;
    }
    
    @Override
    public void updateEducacion(Educacion educacion) {
        eduRepo.save(educacion);
    }
    
}
