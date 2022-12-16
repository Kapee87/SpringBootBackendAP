package com.portfolioAp.kapeeh.Repository;

import com.portfolioAp.kapeeh.Entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
//                                              obj a persistir    Tipo dato Primary key
public interface IPersonaRepository extends JpaRepository<Persona, Long> {

}
