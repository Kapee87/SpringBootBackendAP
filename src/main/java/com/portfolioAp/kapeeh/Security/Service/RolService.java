package com.portfolioAp.kapeeh.Security.Service;

import com.portfolioAp.kapeeh.Security.Entity.Rol;
import com.portfolioAp.kapeeh.Security.Enums.RolNombre;
import com.portfolioAp.kapeeh.Security.Repository.iRolRepository;
import jakarta.transaction.Transactional;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class RolService {

    @Autowired
    iRolRepository iRolRepository;

    public Optional<Rol> getByRolNombre(RolNombre rolNombre) {
        return iRolRepository.findByRolNombre(rolNombre);
    }

    public void save(Rol rol) {
        iRolRepository.save(rol);
    }

}
