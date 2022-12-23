
package com.portfolioAp.kapeeh.Interface;

import com.portfolioAp.kapeeh.Entity.Skills;
import java.util.List;

public interface ISkillsService {
    
    public List<Skills> getSkills();

    public void saveSkills(Skills skills);

    public void deleteSkills(Long id);

    public Skills findProyecto(Long id);

    public void updateSkills(Skills skills);
}
