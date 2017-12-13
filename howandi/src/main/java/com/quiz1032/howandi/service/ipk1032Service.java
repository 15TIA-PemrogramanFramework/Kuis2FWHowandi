/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.quiz1032.howandi.service;

import com.quiz1032.howandi.entity.ipk1032;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.quiz1032.howandi.repo.ipk1032Repo;

/**
 *
 * @author Hendro Steven
 */
@Service("ipk1032Service")
@Transactional
public class ipk1032Service {

    @Autowired
    private ipk1032Repo repo;

    public ipk1032 insert(ipk1032 ipk1032) {
        return repo.save(ipk1032);
    }
    
    public ipk1032 update(ipk1032 ipk1032) {
        return repo.save(ipk1032);
    }
    
    public boolean delete(Long id){
        repo.delete(id);
        return true;
    }
    
    public ipk1032 getById(Long id){
        return repo.findOne(id);
    }
    
    public List<ipk1032> getAll(){
        return repo.findAllipk1032();
    }
}
