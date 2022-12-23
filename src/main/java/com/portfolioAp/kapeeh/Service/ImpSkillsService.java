package com.portfolioAp.kapeeh.Service;

import com.portfolioAp.kapeeh.Entity.Skills;
import com.portfolioAp.kapeeh.Interface.ISkillsService;
import com.portfolioAp.kapeeh.Repository.skillsRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

public class ImpSkillsService implements ISkillsService {

    @Autowired
    private skillsRepository skillsRepo;

    @Override
    public List<Skills> getSkills() {
        List<Skills> skilles = skillsRepo.findAll();
        return skilles;
    }

    @Override
    public void saveSkills(Skills skills) {
        skillsRepo.save(skills);
    }

    @Override
    public void deleteSkills(Long id) {
        skillsRepo.deleteById(id);
    }

    @Override
    public Skills findProyecto(Long id) {
        Skills skill = skillsRepo.findById(id).orElse(null);
        return skill;
    }

    @Override
    public void updateSkills(Skills skills) {
        skillsRepo.save(skills);
    }

}
