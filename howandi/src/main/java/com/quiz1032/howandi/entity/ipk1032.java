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
import javax.persistence.ManyToOne;

/**
 *
 * @author Hendro Steven
 */
@Entity
@Table(name = "ipk_1032")
public class ipk1032 implements Serializable {    

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(length = 100, nullable = false, unique = true)
    private String nilai;
    
    @Column(length = 255, nullable = true)
    private String kelas;

    @Column(length = 255, nullable = true)
    private String alamat;
    
    @ManyToOne
    private identitas1032 Identitas1032;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getNilai() {
        return nilai;
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
    public void setNilai(String nilai) {
        this.nilai = nilai;
    }

    public String getkelas() {
        return kelas;
    }

    
    public void setkelas(String kelas) {
        this.kelas = kelas;
    }

    /**
     * @return the name
     */
    
}
