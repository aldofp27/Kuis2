/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.kuis_1006.entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.OneToMany;
import javax.persistence.*;

/**
 *
 * @author PC-7-320
 */

@Entity
@Table(name = "mobil_1006")
public class Mobil_1006 implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id_mobil;
    @Column(length = 255, nullable = true)
    private String nama_mobil;
    @Column(length = 100, nullable = true)
    private String tahun_mobil;
    @Column(length = 255, nullable = true)
    private String tipe_mobil;
    
    @OneToMany
    @JoinColumn(name = "id_mobil")
    private Set<Aksesoris_1006> aksesoris_1006;
    
    
    public Long getId_mobil() {
        return id_mobil;
    }

    public void setId_mobil(Long id_mobil) {
        this.id_mobil = id_mobil;
    }

    /**
     * @return the nama_mobil
     */
    public String getNama_mobil() {
        return nama_mobil;
    }

    /**
     * @param nama_mobil the nama_mobil to set
     */
    public void setNama_mobil(String nama_mobil) {
        this.nama_mobil = nama_mobil;
    }

    /**
     * @return the tipe_mobil_mobil
     */
    public String getTipe_mobil() {
        return tipe_mobil;
    }

    /**
     * @param tipe_mobilthe tipe_mobil_mobil to set
     */
    public void setTipe_mobil(String tipe_mobil) {
        this.tipe_mobil = tipe_mobil;
    }

    /**
     * @return the nama_mobil
     */
    
    public String getTahun_mobil() {
        return tahun_mobil;
    }

    /**
     * @param tipe_mobil_mobil the tipe_mobil_mobil to set
     */
    public void setTahun_mobil(String tahun_mobil) {
        this.tahun_mobil = tahun_mobil;
    }
    
}
