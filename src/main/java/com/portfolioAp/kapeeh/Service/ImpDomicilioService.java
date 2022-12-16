package com.portfolioAp.kapeeh.Service;

import com.portfolioAp.kapeeh.Entity.Domicilio;
import com.portfolioAp.kapeeh.Interface.IDomicilioService;
import com.portfolioAp.kapeeh.Repository.IDomicilioRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImpDomicilioService implements IDomicilioService {

    @Autowired
    public IDomicilioRepository iDomicilioRepository;

    @Override
    public List<Domicilio> getDomicilio() {
        List<Domicilio> domicilios = iDomicilioRepository.findAll();
        return domicilios;
    }

    @Override
    public Domicilio findDomicilio(Long id) {
        return iDomicilioRepository.findById(id).orElse(null);
    }

    @Override
    public void saveDomicilio(Domicilio domicilio) {
        iDomicilioRepository.save(domicilio);
    }

    @Override
    public void deleteDomicilio(Long id) {
        iDomicilioRepository.deleteById(id);
    }

}
