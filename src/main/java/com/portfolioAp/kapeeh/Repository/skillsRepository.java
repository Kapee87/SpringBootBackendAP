package com.portfolioAp.kapeeh.Repository;

import com.portfolioAp.kapeeh.Entity.Skills;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface skillsRepository extends JpaRepository<Skills, Long> {

}
