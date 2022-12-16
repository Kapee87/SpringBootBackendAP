package com.portfolioAp.kapeeh.Interface;

import com.portfolioAp.kapeeh.Entity.Domicilio;
import java.util.List;

public interface IDomicilioService {

    public List<Domicilio> getDomicilio();

    public Domicilio findDomicilio(Long id);

    public void saveDomicilio(Domicilio domicilio);

    public void deleteDomicilio(Long id);
}
