/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.quiz1032.howandi.controller;

import com.quiz1032.howandi.entity.identitas1032;
import com.quiz1032.howandi.service.identitas1032Service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Hendro Steven
 */
@RestController
@RequestMapping("/identitas_1032")
public class identitas1032Controller {

    @Autowired
    private identitas1032Service identitas1032Service;

    @RequestMapping(method = RequestMethod.POST)
    public identitas1032 insert(@RequestBody identitas1032 identitas1032) {
        return identitas1032Service.insert(identitas1032);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public identitas1032 update(@RequestBody identitas1032 identitas1032) {
        return identitas1032Service.update(identitas1032);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
    public boolean delete(@PathVariable("id") Long id) {
        return identitas1032Service.delete(id);
    }
    
    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    public identitas1032 getById(@PathVariable("id") Long id){
        return identitas1032Service.getById(id);
    }
    
    @RequestMapping(method = RequestMethod.GET)
    public List<identitas1032> getAll(){
        return identitas1032Service.getAll();
    }
}
