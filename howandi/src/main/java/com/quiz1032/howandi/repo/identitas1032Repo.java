/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.quiz1032.howandi.repo;

import com.quiz1032.howandi.entity.identitas1032;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Hendro Steven
 */
public interface identitas1032Repo extends CrudRepository<identitas1032, Long> {

    @Query("select c from identitas1032 c")
    public List<identitas1032> findAllidentitas1032();
}
