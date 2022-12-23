package com.portfolioAp.kapeeh.Repository;

import com.portfolioAp.kapeeh.Entity.Proyectos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface proyectosRepository extends JpaRepository<Proyectos, Long> {

}
