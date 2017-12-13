/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.quiz1032.howandi.controller;

import com.quiz1032.howandi.entity.ipk1032;
import com.quiz1032.howandi.service.ipk1032Service;
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
@RequestMapping("/ipk_1032")
public class ipk1032Controller {

    @Autowired
    private ipk1032Service ipk1032Service;

    @RequestMapping(method = RequestMethod.POST)
    public ipk1032 insert(@RequestBody ipk1032 ipk1032) {
        return ipk1032Service.insert(ipk1032);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public ipk1032 update(@RequestBody ipk1032 ipk1032) {
        return ipk1032Service.update(ipk1032);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
    public boolean delete(@PathVariable("id") Long id) {
        return ipk1032Service.delete(id);
    }
    
    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    public ipk1032 getById(@PathVariable("id") Long id){
        return ipk1032Service.getById(id);
    }
    
    @RequestMapping(method = RequestMethod.GET)
    public List<ipk1032> getAll(){
        return ipk1032Service.getAll();
    }
}
