/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.dao.inter;

import com.company.entity.UserSkill;
import java.util.List;

/**
 *
 * @author Seymur
 */
public interface UserSkillDaoInter {
    
    public List<UserSkill> getAllSkillByUserId(int userId);
    
    public UserSkill getById(int id);
    
    public boolean insertUserSkill(UserSkill us);
    
    public boolean updateUserSkill(UserSkill us);
    
    public boolean removeUserSkill(int id);
}
