
package com.portfolioAp.kapeeh.Interface;

import com.portfolioAp.kapeeh.Entity.Skills;
import java.util.List;

public interface ISkillsService {
    
    public List<Skills> getSkills();

    public Skills saveSkills(Skills skills);

    public void deleteSkills(Long id);
    
    public void deleteAllSkills();

    public Skills findSkill(Long id);

    public void updateSkills(Skills skills);
}
