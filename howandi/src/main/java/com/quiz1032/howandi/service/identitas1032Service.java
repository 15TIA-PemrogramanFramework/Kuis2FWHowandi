/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.quiz1032.howandi.service;

import com.quiz1032.howandi.entity.identitas1032;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.quiz1032.howandi.repo.identitas1032Repo;

/**
 *
 * @author Hendro Steven
 */
@Service("identitas1032Service")
@Transactional
public class identitas1032Service {

    @Autowired
    private identitas1032Repo repo;

    public identitas1032 insert(identitas1032 identitas1032) {
        return repo.save(identitas1032);
    }
    
    public identitas1032 update(identitas1032 identitas1032) {
        return repo.save(identitas1032);
    }
    
    public boolean delete(Long id){
        repo.delete(id);
        return true;
    }
    
    public identitas1032 getById(Long id){
        return repo.findOne(id);
    }
    
    public List<identitas1032> getAll(){
        return repo.findAllidentitas1032();
    }
}
