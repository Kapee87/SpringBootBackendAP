package com.portfolioAp.kapeeh.Repository;

import com.portfolioAp.kapeeh.Entity.Educacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface educacionRepository extends JpaRepository<Educacion, Long> {

}
