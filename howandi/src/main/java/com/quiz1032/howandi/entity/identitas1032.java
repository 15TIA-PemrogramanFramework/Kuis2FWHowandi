/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.quiz1032.howandi.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Hendro Steven
 */
@Entity
@Table(name = "identitas_1032")
public class identitas1032 implements Serializable {    

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(length = 100, nullable = false, unique = true)
    private String name;
    
    @Column(length = 255, nullable = true)
    private String Deskripsi;

    @Column(length = 255, nullable = true)
    private String alamat;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

        public String getAlamat() {
        return alamat;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    public String getDeskripsi() {
        return Deskripsi;
    }

    
    public void setDeskripsi(String Deskripsi) {
        this.Deskripsi = Deskripsi;
    }

    /**
     * @return the name
     */
    
}
