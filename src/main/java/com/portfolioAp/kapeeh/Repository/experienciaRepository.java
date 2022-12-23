package com.portfolioAp.kapeeh.Repository;

import com.portfolioAp.kapeeh.Entity.Experiencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface experienciaRepository extends JpaRepository<Experiencia, Long> {

}
