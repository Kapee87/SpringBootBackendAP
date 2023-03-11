
package com.portfolioAp.kapeeh.Security.Repository;

import com.portfolioAp.kapeeh.Security.Entity.Rol;
import com.portfolioAp.kapeeh.Security.Enums.RolNombre;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface iRolRepository extends JpaRepository<Rol, Integer>{
    
     Optional<Rol> findByRolNombre(RolNombre rolNombre);
}
