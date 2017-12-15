/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.kuis_1006.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;
import javax.persistence.OneToMany;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 *
 * @author PC-7-320
 */
@Entity
@Table(name = "aksesoris_1006")
public class Aksesoris_1006 implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_aksesoris;
    @Column(length = 255, nullable = true)
    private String nama_aksesoris;
    @Column(length = 255, nullable = true)
    private String jenis_aksesoris;

    public Long getId_aksesoris() {
        return id_aksesoris;
    }

    public void setId_aksesoris(Long id_aksesoris) {
        this.id_aksesoris = id_aksesoris;
    }

    /**
     * @return the nama_aksesoris
     */
    public String getNama_aksesoris() {
        return nama_aksesoris;
    }

    /**
     * @param nama_aksesoris the nama_aksesoris to set
     */
    public void setNama_aksesoris(String nama_aksesoris) {
        this.nama_aksesoris = nama_aksesoris;
    }

    /**
     * @return the jenis_aksesoris
     */
    public String getJenis_aksesoris() {
        return jenis_aksesoris;
    }

    /**
     * @param jenis_aksesoris the jenis_aksesoris_aksesoris to set
     */
    public void setJenis_aksesoris_aksesoris(String jenis_aksesoris) {
        this.jenis_aksesoris = jenis_aksesoris;
    }

    /**
     * @return the nama_aksesoris
     */
}
